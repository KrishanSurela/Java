package Loops_java;

import java.util.*;
public class MultipleTable {
    public static void main(String[] args) {
        Scanner dsc = new Scanner(System.in);
        System.out.println("Give Number");
        int num = dsc.nextInt();
        System.out.println("The Table of "+num);
        for(int i=1;i<=10;i++){
            System.out.println(num*i);
        }
        dsc.close();

    }
}
