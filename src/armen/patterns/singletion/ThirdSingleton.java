package armen.patterns.singletion;

/**
 * Created by Amalia on 01.02.2019.
 */
public class ThirdSingleton {

    private static volatile ThirdSingleton instance;
    private ThirdSingleton(){}

    public ThirdSingleton getInstance(){
        if(instance==null){
            synchronized (ThirdSingleton.class){
                if (instance==null){
                    instance = new ThirdSingleton();
                }
            }
        }
        return instance;
    }
    //multithreading +
    //lazy initialization +
    //exceptions +
    //high speed
}
