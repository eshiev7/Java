package Lesson_5;

public class Person {
    private String surname;
    private String name;
    private String middleName;
    private String date;

    public Person(String surname, String name, String middleName, String date) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.date = date;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getDate() {
        return date;
    }

    public String getInformation() {
        return surname + " " + name + " " + middleName + " " + date;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Фамилия='" + surname + '\'' +
                ", Имя='" + name + '\'' +
                ", Отчество='" + middleName + '\'' +
                ", дата рождения='" + date + '\'' +
                '}';
    }



}
