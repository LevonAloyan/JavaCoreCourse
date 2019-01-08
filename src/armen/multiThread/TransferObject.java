package armen.multiThread;

/**
 * Created by Amalia on 08.01.2019.
 */
public class TransferObject {

    private int value;
    protected volatile boolean isValuePresent = false;

    public synchronized int get() {
        while (!isValuePresent) {
            try {
                this.wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Got: " + value);
        isValuePresent = false;
        try {
            return value;
        }
        finally {
            notifyAll();
        }
    }

    public synchronized void put(int value) {
        while (isValuePresent) {
            try {
                this.wait();
            } catch (InterruptedException e) {
            }
        }
        this.value = value;
        System.out.println("Put: " + value);
        isValuePresent = true;
        notifyAll();
    }
}
