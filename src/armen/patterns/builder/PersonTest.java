package armen.patterns.builder;

/**
 * Created by Amalia on 11.01.2019.
 */
public class PersonTest {

    public static void main(String[] args){

        Person person = new Person().personBuilder().setFirstname("Vardan").setLastname("arakelyan").setAge(16).build();
        System.out.println(person);
    }
}
