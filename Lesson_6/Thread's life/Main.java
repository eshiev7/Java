package Lesson_6;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Thread road1 =  new Road();
        System.out.println("Road1: "+road1.getState());

        road1.start();
        System.out.println("Road1: "+road1.getState());

        synchronized (road1){
            Thread.sleep(2000);
            System.out.println("Road1: "+road1.getState());
            road1.notify();
        }
        System.out.println("Road1: "+road1.getState());

        Thread.sleep(1000);
        System.out.println("Road1: "+road1.getState());

        Thread.sleep(2000);
        System.out.println("Road1: "+road1.getState());

    }
}
