package Collection_Framwork;

import java.util.*;

public class arraylist {
    // Float , String , Boolean are class and boolean is datatype.
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();
        // Add Element
        list.add(1);
        list.add(2);
        list.add(5);

        System.out.println(list);// [1, 2, 5]

        list.add(4);
        System.out.println(list);// [1, 2, 5, 4]

        // Get Element
        int element = list.get(2);
        System.out.println(element);// 5

        // Remove Element
        list.remove(2);
        System.out.println(list);// [1, 2, 4]

        // Set Element at index.
        list.set(1, 10);
        System.out.println(list);// [1, 10, 4]

        // Contains Element =>
        System.out.println(list.contains(4));// true
        System.out.println(list.contains(8));// false

        // Add element on perticular index without losing existing value of that index.
        list.add(1, 8);
        System.out.println(list);// [1, 8, 10, 4]

        //Size of an ArrayList =>

        System.out.println(list.size());
        
        //Print the arraylist =>

        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }

        
    }
}