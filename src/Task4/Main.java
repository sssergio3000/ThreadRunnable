package Task4;

public class Main {
    public static void main(String[] args) {

       Thread thr1 = new Thread(new ClassesAlter1());
       Thread thr2 = new Thread(new ClassesAlter2());
//
            thr1.start();

            thr2.start();
//        

    }
}
