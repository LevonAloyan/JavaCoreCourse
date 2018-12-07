package armen.collections.compare;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class PersonTest {

    public static void main(String[] args) {
        Person p1= new Person(25,"Vacho");
        Person p2= new Person(20,"Xacho");
        Person p3= new Person(2,"Hracho");
        Person p4= new Person(0,"Beno");
        Person p5= new Person(11,"Vardan");

        PersonComparator personComparator = new PersonComparator();

        Set<Person> set = new TreeSet<>(personComparator);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);

        Iterator<Person> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
