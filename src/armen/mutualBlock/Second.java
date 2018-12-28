package armen.mutualBlock;

import armen.syncThread.Synch;

/**
 * Created by Amalia on 28.12.2018.
 */
public class Second {

    synchronized void bar(First first){
        String name = Thread.currentThread().getName();
        System.out.println(name + " enter to Second.bar().");
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Class Second is interrupted.");
        }
        System.out.println(name + " try to call First.last().");
        first.last();
    }
    synchronized void last(){
        System.out.println("In the metod Second.last().");
    }
}
