package armen.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Gift gift = new Book();
        gift = new Phone();



//        List<Gift> wishList = new ArrayList<Book>();  //won't compile

        List<?> wishList = new ArrayList<Book>();  //? refers to an unknown type
        wishList = new ArrayList<Phone>();
//        wishList.add(new Book());
//        wishList.add(new Phone());


        List<? extends Gift> myList1 = new ArrayList<Gift>();
        List<? extends Gift> myList2 = new ArrayList<Book>();
        List<? extends Gift> myList3 = new ArrayList<Phone>();

    }
}
