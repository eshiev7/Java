package Lesson_5;

public class Main {

    public static void main(String[] args) {
	AccountManager bob = new ImplAccountManager();
	Person p1 = new Person("Иванов", "Иван", "Иванович", "12.12.12");
	Person p2 = new Person("Павлов", "Павел", "Павлович", "11.11.11");
	Person p3 = new Person("Александров", "Александр", "Александрович", "10.10.10");
	bob.registerNewAccount("ivanov@mail.ru", "12345678", p1);
	bob.registerNewAccount("pavlov@mail.ru", "87654321", p2);
	bob.registerNewAccount("aleksandrov@mail.ru", "18273645", p3);

    }
}
