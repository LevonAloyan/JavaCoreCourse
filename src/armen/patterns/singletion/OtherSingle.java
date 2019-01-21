package armen.patterns.singletion;

/**
 * Created by Amalia on 18.01.2019.
 */
public class OtherSingle {

    private static volatile OtherSingle instance = null;

    private OtherSingle(){}

    public static synchronized OtherSingle getSingle(){
        if(instance == null){
            synchronized (OtherSingle.class){
                if(instance == null){
                    instance = new OtherSingle();
                }
            }
        }
        return instance;
    }
}
