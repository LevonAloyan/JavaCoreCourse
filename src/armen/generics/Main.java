package armen.generics;

import sun.plugin.util.UserProfile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("sd");
        list.add(new Integer("56"));
        list.add(new Character('a'));
        list.add('s');

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Map<String, String> map = new HashMap<>();


    }
}
