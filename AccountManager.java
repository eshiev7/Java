package Lesson_5;

public interface AccountManager {
    void registerNewAccount(String email, String password, Person person);
    void removeAccount(String email, String password);
    boolean hasAccount(String email);
    Person getPerson(String email, String password) throws TooManyLoginAttemptsException;
    int numOfAccounts();

}
