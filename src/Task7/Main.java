package Task7;

public class Main {

    public static void main(String[] args) {
        ThreadBlockUnblock1 thrblun1 = new ThreadBlockUnblock1();
        ThreadBlockUnblock2 thrblun2 = new ThreadBlockUnblock2();



        thrblun1.start();
        thrblun2.start();

    }
}
