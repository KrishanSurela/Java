package Collection_Framwork;

import java.util.*;

public class SortArrayListUsingBubbleSort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(7);
        list.add(2);
        list.add(3);
        int counter = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - i - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                    counter++;
                }
            }
        }
        if (counter == 0) {
            System.out.println("ArrayList is already sorted");
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
