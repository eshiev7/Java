package Lesson_6;

public class Road extends Thread {
    @Override
    public void run() {
        try {
            synchronized (this){
                wait();
                wait(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Сломан");
        }

    }
}
