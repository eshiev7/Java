package Lesson_5;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ImplAccountManager implements AccountManager{

    @Override
    public void registerNewAccount(String email, String password, Person person){
        List<String> inp = new ArrayList<>();
        System.out.println(inp.size());
        try{
            Csv.Reader reader = new Csv.Reader(new FileReader("filename1.csv"));
            inp = reader.readLine();
            System.out.println(inp);
            if(inp != null) {
                for (String h : inp) {
                    System.out.println(h);
                }
            }
            reader.close();
        }catch (IOException ex) {
            ex.printStackTrace();
        }
        Csv.Writer writer = new Csv.Writer("filename1.csv");
        if(inp == null){
            inp.add(email);
        }else{
            inp.add(inp.size(), email);
        }
        inp.add(inp.size(), password);
        inp.add(inp.size(), person.getInformation());
        for(String h : inp){
            writer.value(h);
            //System.out.println(h);
        }
        writer.close();









//        MailDataBase dataBase = MailDataBase.getInstance("dataBase.csv");
//        System.out.println(dataBase.dataBase);
//        try(FileWriter fw = new FileWriter(dataBase.dataBase)){
//            fw.append(email);
//            fw.append(",");
//            fw.append(password);
//            fw.append(",");
//            fw.append(person.getInformation());
//            fw.append('\n');
//
//        }catch (IOException ex) {
//            ex.printStackTrace();
//        }
//
//        try(FileReader fr = new FileReader(dataBase.dataBase)){
//            while (fr.read() != -1){
//                System.out.println((char)fr.read());
//            }
//        }catch (IOException ex) {
//            ex.printStackTrace();
//        }
//


    }

    @Override
    public void removeAccount(String email, String password) {

    }

    @Override
    public boolean hasAccount(String email) {
        return false;
    }

    @Override
    public Person getPerson(String email, String password) throws TooManyLoginAttemptsException {
        return null;
    }

    @Override
    public int numOfAccounts() {
        return 0;
    }
}
