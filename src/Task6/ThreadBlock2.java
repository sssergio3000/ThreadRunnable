package Task6;

public class ThreadBlock2 extends Thread{
    ThreadBlock2(){
        System.out.println("ThreadBlock2 created" );
    }

    @Override
    public void run() {
        synchronized (ThreadBlock2.class){
            System.out.println("ThreadBlock2: blocked by ThreadBlock2");

            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("ThreadBlock2: Trying to block ThreadBlock1 ");
            synchronized (ThreadBlock1.class){

                System.out.println("ThreadBlock2: blocked ThreadBlock1 and ThreadBlock2");

            }


        }




    }
}
