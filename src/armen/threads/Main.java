package armen.threads;

/**
 * Created by Amalia on 12.12.2018.
 */
public class Main {

    public static void main(String[] args){
        CountByThread lets = new CountByThread();
        Thread nums = new Thread(new CountByRunnable());
        lets.start();
        nums.start();
        for(int i = 0; i < 26; i++){
            System.out.print(" * ");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
