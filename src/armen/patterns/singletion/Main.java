package armen.patterns.singletion;

/**
 * Created by Amalia on 12.01.2019.
 */
public class Main {

    public static void main(String[] args) {
        SingleObject singleObject1 = new SingleObject();
        SingleObject singleObject2 = new SingleObject();
        System.out.println(singleObject1);
        System.out.println(singleObject2);
    }
}
