package armen.collections;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
//        LinkedList<String> linkedList = new LinkedList<>();
//        Set<String> set = new TreeSet<>();
//        Map<String, String> map1= new HashMap<>();
//        map1.put(null,"Hello");
//        String s = map1.put(null, "World");
//        System.out.println(s);
//        System.out.println(map1.get(null));

        Set<Short> shorts= new HashSet<>();
        shorts.add(new Short("5"));
        shorts.add(new Short("6"));

        shorts.remove(new Short("5"));

        for (Short aShort : shorts) {
            System.out.println(aShort);
        }

//
//        Map<String, String> map= new HashMap<>();
//
//        map.put("a", "1");
//        map.put("b","2");
//        map.put("c","3");
//        map.put("d","4");

//        Set<String> set1 = map.keySet();
//        for (String s : set1) {
//            System.out.println(map.get(s));
//        }
//
//        Collection<String> values = map.values();
//        for (String value : values) {
//            System.out.println(value);
//        }
//
//        Set<Map.Entry<String, String>> entries = map.entrySet();
//        for (Map.Entry<String, String> entry : entries) {
//            System.out.println(entry);
//        }

    }
}
