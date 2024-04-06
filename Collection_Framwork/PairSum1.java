package Collection_Framwork;

import java.util.*;

// Pairsum in sorted arraylist
public class PairSum1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5, counter = 0;

        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == 5) {
                    counter++;
                }
            }
        }
        if (counter > 0) {
            System.out.println("Target pair is existed for " + counter + " times");
        } else {
            System.out.println("Target Pair is not Existed");
        }
    }
}
