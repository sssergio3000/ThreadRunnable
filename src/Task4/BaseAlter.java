package Task4;


abstract public class BaseAlter extends Thread {
    private final int runNumber;
    private Thread otherThread;

    protected BaseAlter(int runNumber) {
        this.runNumber = runNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < runNumber; i++) {
            methodToRun();

            switchThread();
        }
    }

    synchronized private void switchThread() {
        synchronized (otherThread) {
            otherThread.notify();
        }
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void setOtherThread(Thread otherThread) {
        this.otherThread = otherThread;
    }

    abstract void methodToRun();
}


