package armen.mutualBlock;

/**
 * Created by Amalia on 29.12.2018.
 */
public class NewThreadMain {
    public static void main(String[] args) throws InterruptedException{
        NewThread obj1 = new NewThread("One");
        NewThread obj2 = new NewThread("Two");

        try {
            Thread.sleep(1000);
            obj1.mySuspend();
            System.out.println("Suspension thread " + obj1.threadName);
            Thread.sleep(1000);
            obj1.myResume();
            System.out.println("Resumption thread " + obj1.threadName);
            Thread.sleep(1000);
            obj2.mySuspend();
            System.out.println("Suspension thread " + obj2.threadName);
            Thread.sleep(1000);
            obj2.myResume();
            System.out.println("Resumption thread " + obj2.threadName);
        }catch (InterruptedException e){
            System.out.println("Main thread is interrupted.");
        }
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName() + " thread is completed.");
    }
}
