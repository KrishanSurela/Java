package Bit_Manipulation;

import java.util.Scanner;

// write the code of two number swap without using third variable and (+,-) Operators.
public class SwapValue {
    public static void Swaping(int num1,int num2){
        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;
        System.out.println("After Swapping ->");
        System.out.println("First Number  : "+num1);
        System.out.println("Second Number  : "+num2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number :");
        int num1 = sc.nextInt();
        System.out.print("Enter Second Number :");
        int num12 = sc.nextInt();
        Swaping(num1, num12);
        sc.close();
    }
}
