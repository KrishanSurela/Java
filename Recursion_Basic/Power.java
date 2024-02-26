package Recursion_Basic;

import java.util.*;

public class Power {
    public static int getPower(int x, int n) {
        if (n == 0) {
            return 1;
        }

        return x * getPower(x, n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of x : ");
        int x = sc.nextInt();
        System.out.println("Enter value of n : ");
        int n = sc.nextInt();
        sc.close();
        System.out.println(x + " ki Power " + n + " = " + getPower(x, n));
    }
}
