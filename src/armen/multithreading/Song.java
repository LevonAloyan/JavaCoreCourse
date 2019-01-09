package armen.multithreading;

public class Song implements Runnable {

    private Thread thread;
    public Song (){
        thread = new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
        Thread.currentThread().setName("song");
        System.out.println(Thread.currentThread()+" Run method Song thread");
    }

}
