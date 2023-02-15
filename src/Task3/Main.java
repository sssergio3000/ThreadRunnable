package Task3;

public class Main {

    public static void main(String[] args) {
        Thread thr1 = new Thread(new PriorityThread());
        Thread thr2 = new Thread(new PriorityRunner());
        Thread thr3 = new Thread(new PriorityThread());
        thr1.setPriority(Thread.MIN_PRIORITY);
        thr2.setPriority(Thread.MAX_PRIORITY);
        thr3.setPriority(Thread.NORM_PRIORITY);

        thr1.setName("thr1");
        thr2.setName("thr2");
        thr3.setName("thr3");


        thr1.start();
        thr2.start();
        thr3.start();

        for (int i = 1; i <= 50; i++) {

            System.out.println(i+" "+ Thread.currentThread().getName());

        }
    }
}
