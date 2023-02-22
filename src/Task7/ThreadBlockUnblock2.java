package Task7;


public class ThreadBlockUnblock2 extends Thread{
    ThreadBlockUnblock2(){
        System.out.println("ThreadBlockUnblock2 created" );
    }
    @Override
    public void run() {
        synchronized (ThreadBlockUnblock1.class){
            System.out.println("ThreadBlockUnblock1: blocked by ThreadBlockUnblock2");

            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("ThreadBlockUnblock2: Trying to block ThreadBlockUnblock1 ");
            synchronized (ThreadBlockUnblock2.class){

                System.out.println("ThreadBlockUnblock2: blocked ThreadBlockUnblock1 and ThreadBlockUnblock2");

            }


        }




    }
}