package armen.multiThread;

public class Leg implements Runnable {

    private final String name;
    private final Object monitor = new Object();
    public static volatile Leg lastStepped;

    Leg(String name){
        this.name = name;
    }

    public void run(){
        try {
            while (true){
                synchronized (monitor){
                    monitor.notifyAll();
                    while (lastStepped == this) {
                        monitor.wait();
                    }
                        lastStepped = this;
                        System.out.println(name);
                }
            }
        }catch (InterruptedException e){}
    }
}
