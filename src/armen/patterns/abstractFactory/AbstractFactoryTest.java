package armen.patterns.abstractFactory;

/**
 * Created by Amalia on 19.01.2019.
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        String country = "UA";
        Factory ifactory = null;
        if(country.equals("UA")) {
            ifactory = new UaCarFactory();
        } else if(country.equals("RU")) {
            ifactory = new RuCarFactory();
        }

        Lada lada = ifactory.getLada();
        System.out.println(lada.getLadaPrice());
    }
}
