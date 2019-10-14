package Lesson_5;

import java.io.*;

public final class MailDataBase {

    private static MailDataBase instance;
    public String dataBaseName;
    public File dataBase;

    private MailDataBase(String dataBaseName) {
        dataBase = new File(dataBaseName);
    }

    public static MailDataBase getInstance(String value) {
        if (instance == null) {
            instance = new MailDataBase(value);
        }
        return instance;
    }
}

//
//    private static MailDataBase ourInstance = new MailDataBase(String dataBaseName );
//
//    public static MailDataBase getInstance() {
//        return ourInstance;
//    }
//
//    private MailDataBase(String dataBaseName) {
//        File dataBase = new File("DataBase.csv");
//    }
//}
