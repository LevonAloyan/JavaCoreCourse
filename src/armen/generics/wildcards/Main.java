package armen.generics.wildcards;

import com.sun.org.apache.xerces.internal.xs.StringList;
import com.sun.org.apache.xerces.internal.xs.datatypes.ObjectList;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gift gift = new Book();
        gift = new Phone();



//        List<Gift> wishList = new ArrayList<Phone>();  //won't compile

        List<?> wishList = new ArrayList<Book>();  //? refers to an unknown type
//        wishList = new ArrayList<Phone>();
//        wishList.add(new Book());
//        wishList.add(new Phone());
//        wishList.add(new Object());


        List<? extends Gift> myList1 = new ArrayList<Gift>();
//        myList1.add(new Gift());
//        myList1.add(new Phone());
//        myList1.add(new Book());
        List<? extends Gift> myList2 = new ArrayList<Book>();
        List<? extends Gift> myList3 = new ArrayList<Phone>();

        List<? super Gift> myList4 = new ArrayList<Gift>();
        myList4.add(new Book());
        myList4.add(new Phone());
        myList4.add(new Gift());
//        myList4.add(new Object());

        List myList5 = new ArrayList<Gift>();
        myList5.add(new Phone());
        Phone o = (Phone) myList5.get(0);


    }
}
