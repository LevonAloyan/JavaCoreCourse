package armen.patterns.abstractFactory;

/**
 * Created by Amalia on 19.01.2019.
 */
public class RuCarFactory implements Factory {
    public Lada getLada() {
        return new RuLada();
    }
    public Ferrari getFerrari() {
        return new RuFerrari();
    }
    public Porshe getPorshe() {
        return new RuPorshe();
    }
}
