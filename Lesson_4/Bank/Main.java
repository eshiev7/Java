package Lesson4;

import java.util.concurrent.Callable;

public class Main {

    public static void main(String[] args) throws WrongName {
        Client cl1 = new Client("Ешиев Антон Тимурович");
        Client cl2 = new Client("Ешиев Антон Тимурович");
        Client cl3 = new Client("Ешиев Антон Тимурович");
//        Client cl4 = new Client("Козловский Андрей Сергеевич");
//        Client cl5 = new Client("Ешиева Антон Тимуровича");
//        Client cl6 = new Client("Ерроооо Антон");

        BankManager bob = new BankManager();
        bob.registerNewClient(cl1);
        bob.registerNewClient(cl2);
        bob.registerNewClient(cl3);
//        bob.registerNewClient(cl4);
//        bob.registerNewClient(cl5);
//        bob.registerNewClient(cl6);
        System.out.println(bob.getUniqueNameCount());
        System.out.println(bob.getClientQueue());
        bob.expireClients(1);
        System.out.println(bob.getUniqueNameCount());
        System.out.println(bob.getClientQueue());

        BankManager john = new BankManager();

        System.out.println(john.getUniqueNameCount());
    }
}
