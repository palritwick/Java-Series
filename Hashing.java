import java.util.HashSet;
import java.util.Iterator;
import java.util.*;

public class Hashing {
    public static void main(String[] args) {
        // HashSet
        HashSet<Integer> set = new HashSet<>();
        // Insert
        set.add(1);
        set.add(4);
        set.add(4);
        set.add(9);
        System.out.println("Size of the set is " + set.size());
        System.out.println(set);
        set.remove(1); // Remove
        set.add(10);
        System.out.println(set);
        if (set.contains(9)) {
            System.out.println("Element is present");
        }
        if (!set.contains(12)) {
            System.out.println("Element is not present");
        }

        // //Iterator
        Iterator it = set.iterator();
        System.out.println(it.next());
        while (it.hasNext()) {
            System.out.print(it.next() + ", ");
        }
        System.out.println();
        if (!set.isEmpty()) {
            System.out.println("Not Empty");
        }

        // HashMap
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 130);
        map.put("China", 150);
        map.put("US", 50);
        System.out.println(map);

        if (map.containsKey("India")) {
            System.out.println("key Present");
        } else {
            System.out.println("key Absent");
        }

        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));

        // for(int val : set){ ... }
        // Iterator 1
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        // Iterator 2
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + " " + map.get(key));
        }
        map.remove("China");
        System.out.println(map);
    }
}
