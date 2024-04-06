package Collection_Framwork;

import java.util.*;

public class MostWaterTwoPointerApproach {

    // optimize solution
    // time complexity is O(n)
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

        // Two Pointer Approach
        int lp = 0;
        int rp = list.size() - 1;
        int maxWater = 0;
        while (lp < rp) {
            // calculate area
            int height = Math.min(list.get(lp), list.get(rp));
            int width = rp - lp;
            int water = height * width;

            // update area
            if (water > maxWater) {
                maxWater = water;
            }

            // update pointer
            if (list.get(lp) < list.get(rp)) {
                lp++;

            } else {
                rp--;

            }

        }
        System.out.println("Maximum Water : " + maxWater);
    }
}
