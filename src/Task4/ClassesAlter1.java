package Task4;

public class ClassesAlter1 extends Thread {

    boolean flag = true;
    String s = "Class: ClassesAlter1" ;


    @Override
   public void run() {


        for(int i=0;i<100;i++){
            if (flag){
                System.out.println(s);

                try {
                    sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }



        }
    }
}
