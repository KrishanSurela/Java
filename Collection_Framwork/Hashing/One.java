package Collection_Framwork.Hashing;

import java.util.HashMap;

public class One {
    public static void main(String[] args) {
        // Create Hashmap
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert
        hm.put("India", 100);
        hm.put("China", 200);
        hm.put("Indonesia", 10);
        hm.put("Nepal", 6);
        System.out.println(hm);

        // Get
        int population = hm.get("India");
        System.out.println(population);// 100

        System.out.println(hm.get("Russia")); // null

        // containsKey return type boolean

        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Italy"));

        // Remove Operation return (value)

        System.out.println(hm.remove("China"));// 200
        System.out.println(hm.remove("England"));// null

        System.out.println(hm);

        // Size
        System.out.println(hm.size());

        // clear() => remove all element from hashmap
        hm.clear();

        // Is Empty
        System.out.println(hm.isEmpty());// true

    }
}
