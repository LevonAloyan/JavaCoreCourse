package armen.patterns.protoype;

/**
 * Created by Amalia on 19.01.2019.
 */
public class PrototypeTest {
    public static void main(String[] args) {
        ComplicatedObject prototype = new ComplicatedObject();
        ComplicatedObject clone = prototype.copy();
        clone.setType(ComplicatedObject.Type.ONE);
    }
}
