package armen.multiThread;

public class LegsSynchro {

    public static void main(String[] args) {
        Leg s1 = new Leg("left");
        Leg s2 = new Leg("right");
        Leg.lastStepped = s1;

        new Thread(s1).start();
        new Thread(s2).start();
    }
}
