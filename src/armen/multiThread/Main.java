package armen.multiThread;

/**
 * Created by Amalia on 08.01.2019.
 */
public class Main {
    public static void main(String args[]) throws InterruptedException {
        TransferObject transferObject = new TransferObject();
        ProducerTask producerTask = new ProducerTask(transferObject);
        ConsumerTask consumerTask = new ConsumerTask(transferObject);

        Thread.sleep(5000);
        producerTask.stop();
        consumerTask.stop();
    }
}
