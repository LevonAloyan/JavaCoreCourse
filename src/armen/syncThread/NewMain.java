package armen.syncThread;

/**
 * Created by Amalia on 17.12.2018.
 */
public class NewMain {

    public static void main(String[] args) {


    Thread mythread = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("Hellow from side thread.");
        }
    });
    mythread.start();
        System.out.println("Hellow from main thread.");
    }
}
