package Task2;

import java.sql.SQLOutput;

public class TestThread extends Thread {

    @Override
    public void run(){

        try {
            Thread.sleep(2000);
            System.out.println("Finished: "+Thread.currentThread().getName());


        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
class Main{
    public static void main(String[] args) {
        Thread thr1 = new Thread(new TestThread());
        thr1.setName("main");
        Thread thr2 = new Thread(new TestThread());
        thr2.setName("first");
        Thread thr3 = new Thread(new TestThread());
        thr3.setName("second");
        thr1.start();
        thr2.start();
        thr3.start();




    }

}
