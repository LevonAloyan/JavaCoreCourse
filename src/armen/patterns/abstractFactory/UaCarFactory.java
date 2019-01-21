package armen.patterns.abstractFactory;

/**
 * Created by Amalia on 19.01.2019.
 */
public class UaCarFactory implements Factory {
    public Lada getLada() {
        return new UaLada();
    }
    public Ferrari getFerrari() {
        return new UaFerrari();
    }
    public Porshe getPorshe() {
        return new UaPorshe();
    }
}
