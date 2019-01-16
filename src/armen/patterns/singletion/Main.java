package armen.patterns.singletion;

/**
 * Created by Amalia on 12.01.2019.
 */
public class Main {

    public static void main(String[] args) {
        SingleObject singleObject1 = SingleObject.getInstance();
        SingleObject singleObject2 = SingleObject.getInstance();
        System.out.println(singleObject1);
        System.out.println(singleObject2);
    }
}
