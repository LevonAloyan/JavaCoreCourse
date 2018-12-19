package armen.syncThread;

/**
 * Created by Amalia on 17.12.2018.
 */
public class ChickenVoice {

    public static void main(String[] args){
        EggVoice eggVoice = new EggVoice();
        System.out.println("Start dispute... \n");
        eggVoice.start();
        for (int i = 0; i < 5; i++){
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){}
            System.out.println("Chicken!");
        }
        if(eggVoice.isAlive()){
            try {
                Thread.sleep(1000);
                eggVoice.join();
            }catch (InterruptedException e){}
            System.out.println("The egg appeared first!");
        }else{
            System.out.println("The chicken appeared first!");
        }
        System.out.println();
        System.out.println("The end of dispute.");
    }
}
