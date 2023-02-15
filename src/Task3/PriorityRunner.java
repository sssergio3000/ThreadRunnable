package Task3;

public class PriorityRunner implements Runnable{
    @Override
    public void run() {
        for (int i = 1 ; i < 51; i++) {

            System.out.println(i+" "+ Thread.currentThread().getName());

        }
    }
}
