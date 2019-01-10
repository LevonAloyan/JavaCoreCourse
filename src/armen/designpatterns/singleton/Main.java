package armen.designpatterns.singleton;

public class Main {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        SingleObject singleObject1 = SingleObject.getInstance();


        System.out.println(singleObject);
        System.out.println(singleObject1);
    }
}
