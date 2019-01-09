package armen.homework.compare;

import java.util.Comparator;

/**
 * Created by Amalia on 09.12.2018.
 */
public class SortedByLastName implements Comparator<Student> {

    public int compare(Student a, Student b){
        return Integer.compare(a.getLastName().length(), b.getLastName().length());
    }
}
