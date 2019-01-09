package armen.homework.compare;

import java.util.Comparator;

/**
 * Created by Amalia on 08.12.2018.
 */
public class SortedByAge implements Comparator<Student> {

    public int compare(Student a, Student b){
       return Integer.compare(a.getAge(), b.getAge());
    }
}

