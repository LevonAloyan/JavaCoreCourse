package armen.syncThread;

/**
 * Created by Amalia on 17.12.2018.
 */
public class EggVoice extends Thread {

    public void run(){
        for(int i = 0; i < 5; i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){}
            System.out.println("Egg!");
        }
    }
}
