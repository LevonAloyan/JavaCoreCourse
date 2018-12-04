package armen.generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Courier {

    public static void wrapGift(List<? super Gift> list) {
//        list.add(new Object());
        list.add(new Book());
        list.add(new Phone());
        list.add(new Gift());
        for (Object item : list) {
            System.out.println("GiftWrap - " + item);
        }
    }

    public static void main(String[] args) {
        List<Object> bookList = new ArrayList<Object>();
        bookList.add(new Object());
        bookList.add(new Book("Java"));

        wrapGift(bookList);

//        List<String> stringList = new ArrayList<String>();
//        stringList.add("Paul");
//        stringList.add("Shreya");
//        wrapGift(stringList);


    }

}
