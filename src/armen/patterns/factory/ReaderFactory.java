package armen.patterns.factory;

/**
 * Created by Amalia on 11.01.2019.
 */
public class ReaderFactory {

    public static Reader getReader(String name){
        Reader reader = null;
        if(name.equalsIgnoreCase("Json")){
            reader = new JsonReader();
        }
        if(name.equalsIgnoreCase("Xml")){
            reader = new XmlReader();
        }
        if(name.equalsIgnoreCase("Db")){
            reader = new DbReader();
        }
        return reader;
    }
}
