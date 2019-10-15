package Lesson_5;

import java.io.*;

public final class MailDataBase {

    private static MailDataBase instance;
    public String dataBaseName;
    public File dataBase;
    private static int counter = 0;

    private MailDataBase(String dataBaseName) {
        dataBase = new File(dataBaseName);
    }

    public static MailDataBase getInstance(String value) {
        if (instance == null) {
            instance = new MailDataBase(value);
        }
        return instance;
    }

    public int getCounter() {
        return counter;
    }

    public void appCounter() {
        counter++;
    }
    public void setCounter(int counter1) {
        counter = counter1;
    }
}
