package armen.mutualBlock;

public class NewThread implements Runnable {
    String threadName;
    Thread t;
    boolean suspendFlag;

    NewThread(String threadName){
        this.threadName = threadName;
        t = new Thread(threadName);
        suspendFlag = false;
        t.start();
    }

    public void run(){
        try {
            synchronized (this){
                    while (suspendFlag) {
                        wait();
                    }
                }
        }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
    }

    synchronized void mySuspend(){
        suspendFlag = true;
    }

    synchronized void myResume(){
        suspendFlag = false;
        notify();
    }
}
