package armen.threads;

/**
 * Created by Amalia on 12.12.2018.
 */
public class CountByThread extends Thread {

    @Override
    public void run() {
        for(int i = 1; i <= 26; i++){
            System.out.print(i);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
