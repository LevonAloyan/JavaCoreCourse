package armen.syncThread;

/**
 * Created by Amalia on 16.12.2018.
 */
public class Synch {
    public static void main(String[] rgs){
        CallMy target = new CallMy();
        OtherThread ot = new OtherThread();
        Caller obj1 = new Caller(target, "Welcom");
        Caller obj2 = new Caller(target, "to the");
        Caller obj3 = new Caller(target, "synchronized world!");
        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
    }catch (InterruptedException e){
            System.out.println("Interrupted");
        }
    }
}
