package armen.homework.compare;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by Amalia on 08.12.2018.
 */
public class Main {

    public static void main(String[] args) {

    SortedByAge byAge = new SortedByAge();
    TreeSet<Student> people = new TreeSet<>(byAge);
        people.add(new Student("Tom", "Li", 35));
        people.add(new Student("Jim", "Croce", 30));
        people.add(new Student("Vrdo", "Sahakyan", 15));
        people.add(new Student("Beno", "Khazaryan", 42));
        people.add(new Student("Sem", "Su", 6));
        people.add(new Student("Kira", "Naitly", 27));

        Iterator<Student> iter = people.iterator();

        while (iter.hasNext()){
            System.out.println(iter.next());
        }
   }
}
