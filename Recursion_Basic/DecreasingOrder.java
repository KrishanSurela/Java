package Recursion_Basic;

import java.util.Scanner;

public class DecreasingOrder {
    
    public static void DecreasingOrderNumber(int num){
        // System.out.print(num+" ");
        // if(num>1){ 
        //     DecreasingOrderNumber(num-1);
        // }

        if(num==1){
            System.out.print(num);
            return;
        }
        System.out.print(num+" ");
        DecreasingOrderNumber(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of n : ");
        int n = sc.nextInt();
        DecreasingOrderNumber(n);
        sc.close();
    }
} 