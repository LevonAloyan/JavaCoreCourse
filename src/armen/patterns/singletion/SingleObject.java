package armen.patterns.singletion;

/**
 * Created by Amalia on 12.01.2019.
 */
public class SingleObject {

    private static SingleObject instance;

    private SingleObject(){}

    public static SingleObject getInstance(){
        if(instance==null){
            instance = new SingleObject();
        }
        return instance;
    }
}
