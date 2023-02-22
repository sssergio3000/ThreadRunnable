package Task4;

public class Main {
    public static void main(String[] args) {

        BaseAlter ba1 = new ClassesAlter1(5);
        BaseAlter ba2 = new ClassesAlter2(5);

//        Thread thr1 = new Thread(ba1);
//        Thread thr2 = new Thread(ba2);

        ba1.setOtherThread(ba2);
        ba2.setOtherThread(ba1);

//        thr1.start();
//        thr2.start();
        ba2.start();
        ba1.start();


    }
}
