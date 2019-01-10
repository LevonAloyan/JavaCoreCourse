package armen.designpatterns.factory;

public class Main {

    public static void main(String[] args) {
        Reader reader = ReaderFactory.getReader("xml");
        reader.read();

    }
}
