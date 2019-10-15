package Lesson_5;

public class Main {

    public static void main(String[] args) throws DuplicateAccountException, TooManyLoginAttemptsException {
	AccountManager bob = new ImplAccountManager();
	Person p1 = new Person("Иванов", "Иван", "Иванович", "12.12.12");
	Person p2 = new Person("Павлов", "Павел", "Павлович", "11.11.11");
	Person p3 = new Person("Александров", "Александр", "Александрович", "10.10.10");
	bob.registerNewAccount("ivanov@mail.ru", "12345678", p1);
	bob.registerNewAccount("pavlov@mail.ru", "87654321", p2);
	bob.registerNewAccount("aleksandrov@mail.ru", "18273645", p3);
	System.out.println(bob.numOfAccounts());
	bob.removeAccount("aleksandrov@mail.ru","18273645");
	bob.removeAccount("pavlov@mail.ru", "87654321");
	System.out.println(bob.numOfAccounts());
	System.out.println(bob.hasAccount("aleksandrov@mail.ru"));
	System.out.println(bob.hasAccount("pavlov@mail.ru"));

	System.out.println(bob.getPerson("ivanov@mail.ru", "12345678"));
	System.out.println(bob.getPerson("aleksandrov@mail.ru","18273645"));
//	System.out.println(bob.getPerson("ivanov@mail.ru", "123545688"));
//	System.out.println(bob.getPerson("ivanov@mail.ru", "12345688"));
//	System.out.println(bob.getPerson("ivanov@mail.ru", "123545688"));
//	System.out.println(bob.getPerson("ivanov@mail.ru", "123455688"));
//	System.out.println(bob.getPerson("ivanov@mail.ru", "123455688"));

    }
}
