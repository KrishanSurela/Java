package Collection_Framwork;

import java.util.*;

public class ContainerWithMostWater {
    public static int storeWater(ArrayList<Integer> list) {
        int maxWater = 0;
        for (int i = 0; i <= list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                int height = Math.min(list.get(i), list.get(j));
                int width = j - i;
                int water = height * width;
                if (water > maxWater) {
                    maxWater = water;
                }
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        // FInd Maximum Water Level

        System.out.println("Maximum Water : " + storeWater(list));

    }
}
