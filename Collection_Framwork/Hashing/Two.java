package Collection_Framwork.Hashing;

import java.util.*;

public class Two {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();

        hm.put("India", 100);
        hm.put("China", 300);
        hm.put("USA", 50);
        hm.put("England", 10);
        hm.put("Poland", 20);

        // Iteration

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        System.out.println(hm.entrySet());// [USA=50, China=300, England=10, Poland=20, India=100]

        System.out.println(hm);// {USA=50, China=300, England=10, Poland=20, India=100}
        // foreach
        int max = Integer.MIN_VALUE;
        for (String str : keys) {
            if (max < hm.get(str)) {
                max = hm.get(str);
            }
            System.out.println("Key = " + str + ", Value = " + hm.get(str) + " ");
        }
        System.out.println("Maximum Value : " + max);
    }
}
