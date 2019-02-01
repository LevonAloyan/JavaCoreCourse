package armen.patterns.singletion;

/**
 * Created by Amalia on 01.02.2019.
 */
public class FirstSingleton {
    private FirstSingleton(){}

    private static class NewInstance{
        private static FirstSingleton instance = new FirstSingleton();
    }
    public FirstSingleton getInstance(){
        return NewInstance.instance;
    }
    //multithreading +
    //lazy initialization +
    //exceptions -
}
