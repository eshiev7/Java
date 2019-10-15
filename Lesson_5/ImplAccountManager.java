package Lesson_5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

import com.opencsv.*;

public class ImplAccountManager implements AccountManager {

    private static List<Person> dP = new LinkedList<Person>();
    private MailDataBase csv = MailDataBase.getInstance("data.csv");

    @Override
    public void registerNewAccount(String email, String password, Person person) throws DuplicateAccountException {

        try {
            CSVWriter writer = new CSVWriter(new FileWriter(csv.dataBase.getName(), true));
            if (hasAccount(email)) throw new DuplicateAccountException("Данный аккаунт уже зарегестрирован!");
            String[] record = {email, password, person.getInformation()};
            writer.writeNext(record);
            writer.close();
            dP.add(person);

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void removeAccount(String email, String password) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("data.csv"), StandardCharsets.UTF_8);
            for (String k : lines) {
                String g = k.replaceAll("\"", "");
                String[] g1 = g.split(",");
                if (g1[0].equalsIgnoreCase(email) && g1[1].equalsIgnoreCase(password)) {
                    lines.remove(k);
                    break;
                }
            }
            CSVWriter writer = new CSVWriter(new FileWriter(csv.dataBase.getName(), false));
            for(String g2 : lines){
                writer.writeNext(g2.replaceAll("\"", "").split(","));
            }
            writer.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean hasAccount(String email) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("data.csv"), StandardCharsets.UTF_8);
            for (String g : lines) {
                g = g.replaceAll("\"", "");
                String[] g1 = g.split(",");
                if (g1[0].equalsIgnoreCase(email)) {
                    return true;
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    @Override
    public Person getPerson(String email, String password) throws TooManyLoginAttemptsException {
        if (csv.getCounter() < 4) {
            try {
                List<String> lines = Files.readAllLines(Paths.get("data.csv"), StandardCharsets.UTF_8);
                for (String g : lines) {
                    g = g.replaceAll("\"", "");
                    String[] g1 = g.split(",");
                    if (g1[0].equalsIgnoreCase(email) && g1[1].equalsIgnoreCase(password)) {
                        for (Person p1 : dP) {
                            if (p1.getInformation().equalsIgnoreCase(g1[2])) {
                                return p1;
                            }
                        }
                    }
                }
                csv.appCounter();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            return null;
        } else {
            csv.setCounter(0);
            throw new TooManyLoginAttemptsException("Превышено количество попыток доступа");
        }
    }

    @Override
    public int numOfAccounts() {
        int num = 0;
        try {
            List<String> lines = Files.readAllLines(Paths.get("data.csv"), StandardCharsets.UTF_8);
            num = lines.size();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return num;
    }

}
