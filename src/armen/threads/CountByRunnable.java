package armen.threads;

/**
 * Created by Amalia on 12.12.2018.
 */
public class CountByRunnable implements Runnable {

    @Override
    public void run() {
        for(char i = 'A'; i <= 'Z'; i++){
            System.out.print(i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
