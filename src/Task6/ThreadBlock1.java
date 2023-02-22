package Task6;

public class ThreadBlock1 extends Thread{

    ThreadBlock1(){
        System.out.println("ThreadBlock1 created" );
    }
    @Override
    public void run() {
            synchronized (ThreadBlock1.class){
                System.out.println("ThreadBlock1: blocked by ThreadBlock1");

                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("ThreadBlock1: Trying to block ThreadBlock2 ");
                synchronized (ThreadBlock2.class){

                    System.out.println("ThreadBlock1: blocked ThreadBlock1 and ThreadBlock2");

                }


            }




    }
}
