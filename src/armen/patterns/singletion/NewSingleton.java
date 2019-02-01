package armen.patterns.singletion;

public class NewSingleton {
    private static NewSingleton instance;
    private NewSingleton(){}

    public NewSingleton getInstance(){
        return instance;
    }
    //multithreading +
    //lazy initialization -
    //exceptions -
}
