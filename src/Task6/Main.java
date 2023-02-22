package Task6;

public class Main {

    public static void main(String[] args) {
        ThreadBlock1 thrblck1 = new ThreadBlock1();
        ThreadBlock2 thrblck2 = new ThreadBlock2();

        Thread thr1 = new Thread(thrblck1);
        Thread thr2 = new Thread(thrblck2);

        thr1.start();
        thr2.start();


    }
}
