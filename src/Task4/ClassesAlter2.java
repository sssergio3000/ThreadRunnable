package Task4;

public class ClassesAlter2 extends Thread{

    boolean flag;
    String s = "Class: ClassesAlter2" ;

    @Override
    public void run() {
        for(int i=0;i<100;i++){

                System.out.println(s);
            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }

    }//run
}
