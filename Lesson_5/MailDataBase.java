package Lesson_5;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.opencsv.*;

public final class MailDataBase {

    private static MailDataBase instance;
    public String dataBaseName;
    public static File dataBase;
    private static int counter;

    private MailDataBase(String dataBaseName) throws IOException {
        dataBase = new File(dataBaseName);
    }

    public static MailDataBase getInstance(String value) throws IOException {
        if (instance == null) {
            instance = new MailDataBase(value);
            counter = 0;
            if(!Files.exists(Paths.get(dataBase.getName()))){
                CSVWriter writer = new CSVWriter(new FileWriter(dataBase.getName(), false));
                String[] record = {String.valueOf(0)};
                writer.writeNext(record);
                writer.close();
            }
        }
        return instance;
    }

    public int getCounter() {
        return counter;
    }

    public void appCounter() throws IOException{
        List<String> lines = Files.readAllLines(Paths.get("data.csv"), StandardCharsets.UTF_8);
        counter = Integer.valueOf(lines.get(0).replace("\"",""))+1;
        lines.set(0, "\""+String.valueOf(counter)+"\"");
        CSVWriter writer = new CSVWriter(new FileWriter(dataBase.getName(), false));
        for(String g2 : lines){
            writer.writeNext(g2.replaceAll("\"", "").split(","));
        }
        writer.close();
    }
    public void setCounter(int counter1) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("data.csv"), StandardCharsets.UTF_8);
        lines.set(0, "\""+String.valueOf(0)+"\"");
        CSVWriter writer = new CSVWriter(new FileWriter(dataBase.getName(), false));
        for(String g2 : lines){
            writer.writeNext(g2.replaceAll("\"", "").split(","));
        }
        writer.close();
    }
}
