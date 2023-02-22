package Task7;



public class ThreadBlockUnblock1 extends Thread{
    ThreadBlockUnblock1(){
        System.out.println("ThreadBlockUnblock1 created" );
    }
    @Override
    public void run() {
        synchronized (ThreadBlockUnblock1.class){
            System.out.println("ThreadBlockUnblock1: blocked by ThreadBlockUnblock1");

            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("ThreadBlockUnblock1: Trying to block ThreadBlockUnblock2 ");
            synchronized (ThreadBlockUnblock2.class){

                System.out.println("ThreadBlockUnblock1: blocked ThreadBlockUnblock1 and ThreadBlockUnblock2");

            }


        }




    }
}
