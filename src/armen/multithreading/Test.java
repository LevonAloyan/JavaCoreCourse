package armen.multithreading;

public class Test {
    public static void main(String[] args) {
        Thread sing = new Sing();
        sing.start();
        System.out.println(Thread.currentThread()+" Hello");

        Song song = new Song();
//        Thread thread = new Thread(song);
//        thread.start();
    }
}
