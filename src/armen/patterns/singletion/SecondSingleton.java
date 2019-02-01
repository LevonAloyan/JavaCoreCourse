package armen.patterns.singletion;

/**
 * Created by Amalia on 01.02.2019.
 */
public class SecondSingleton {

    private static SecondSingleton instance;

    private SecondSingleton(){}

    public static synchronized SecondSingleton getInstance(){
        if(instance==null){
            instance = new SecondSingleton();
        }
        return instance;
    }
    //multithreading +
    //lazy initialization +
    //exceptions +
    //low speed
}
