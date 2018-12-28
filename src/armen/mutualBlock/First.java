package armen.mutualBlock;

import armen.syncThread.Synch;

/**
 * Created by Amalia on 28.12.2018.
 */
public class First {

    synchronized void foo(Second second){
        String name = Thread.currentThread().getName();
        System.out.println(name + " enter to First.foo().");

        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            System.out.println("Class First is interrupted.");
        }
        System.out.println(name + " try to call Second.last().");
        second.last();
    }
    synchronized void last(){
        System.out.println("In the metod First.last().");
    }
}
