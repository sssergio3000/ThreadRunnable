package Task4;

public class ClassesAlter2 extends BaseAlter{

    protected ClassesAlter2(int runNumber) {
        super(runNumber);
    }

    @Override
    void methodToRun() {
        System.out.println("Class 2");
//        try {
//            this.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }
}
