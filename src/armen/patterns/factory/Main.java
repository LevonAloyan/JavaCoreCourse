package armen.patterns.factory;

/**
 * Created by Amalia on 11.01.2019.
 */
public class Main {

    public static void main(String[] args) {
        Reader reader = ReaderFactory.getReader("xml");
        reader.read();
    }
}
