package armen.patterns.singletion;

/**
 * Created by Amalia on 12.01.2019.
 */
public class SingleObject {

    private static SingleObject instance;

    SingleObject(){}

    public static SingleObject getInstance(){
        if(!instance.equals(null)){
            instance = new SingleObject();
        }
        return instance;
    }

//    public String toString(){
//        return "Single Object.";
//    }
}
