package Lesson_5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

import com.opencsv.*;

public class ImplAccountManager implements AccountManager {

    private static MailDataBase csv;

    static {
        try {
            csv = MailDataBase.getInstance("data.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void registerNewAccount(String email, String password, Person person) throws DuplicateAccountException {

        try {
            CSVWriter writer = new CSVWriter(new FileWriter(csv.dataBase.getName(), true));
            if (hasAccount(email)) throw new DuplicateAccountException("Данный аккаунт уже зарегестрирован!");
            String[] record = {email, password, person.getInformation()};
            writer.writeNext(record);
            writer.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void removeAccount(String email, String password) {

        try {
            List<String> lines = Files.readAllLines(Paths.get("data.csv"), StandardCharsets.UTF_8);
            int sizeLines = lines.size();
            for (String k : lines) {
                String g = k.replaceAll("\"", "");
                String[] g1 = g.split(",");
                if (g1[0].equalsIgnoreCase(email) && g1[1].equalsIgnoreCase(password)) {
                    lines.remove(k);
                    break;
                }
            }
            if (lines.size() == sizeLines){
                throw new WrongCredentialsException("Аккаунт с такими данными отсутствует в базе данных, проверьте корректность введенных данных!");
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

            try {
                List<String> lines = Files.readAllLines(Paths.get("data.csv"), StandardCharsets.UTF_8);
                int count = Integer.valueOf(lines.get(0).replace("\"",""));
                if (count < 5) {
                    for (String g : lines) {
                        g = g.replaceAll("\"", "");
                        if (g.length() > 3) {
                            String[] g1 = g.split(",");
                            if (g1[0].equalsIgnoreCase(email) && g1[1].equalsIgnoreCase(password)) {
                                String[] g2 = g1[2].split(" ");
                                csv.setCounter(0);
                                return new Person(g2[0], g2[1], g2[2], g2[3]);
                            }
                        }
                    }
                    csv.appCounter();
                    if(count + 1 == 5){
                        csv.setCounter(0);
                        throw new TooManyLoginAttemptsException("Превышено количество попыток доступа");
                    }
                    System.out.println("IAM: "+ csv.getCounter());
                    throw new WrongCredentialsException("Введены некорректные данные, пожалуйста, повторите попытку");
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            return null;
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
