package armen.syncThread;

/**
 * Created by Amalia on 17.12.2018.
 */
public class NewMain {

    public static void main(String[] args) {

        System.out.println("Hellow from main thread.");
        Thread mythread = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("Hellow from side thread.");
        }
    });
        try {
            mythread.join();
        }catch (InterruptedException e){}
        mythread.start();
        System.out.println("end of main thread.");
    }
}
