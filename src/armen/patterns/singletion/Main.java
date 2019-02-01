package armen.patterns.singletion;

/**
 * Created by Amalia on 12.01.2019.
 */
public class Main {

    public static void main(String[] args) {
        SingleObject x = SingleObject.getInstance();
        SingleObject y = SingleObject.getInstance();
        SingleObject z = SingleObject.getInstance();
        x.s = (x.s).toUpperCase();
        System.out.println(x.s);
        System.out.println(y.s);
        System.out.println(z.s);
        x.s = (z.s).toLowerCase();
        System.out.println(x.s);
        System.out.println(y.s);
        System.out.println(z.s);
    }
}
