package Task4;

public class ClassesAlter1 extends BaseAlter {


    protected ClassesAlter1(int runNumber) {
        super(runNumber);
    }

    @Override
    void methodToRun() {
        System.out.println("Class 1");
//        try {
//            this.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

    }
}
