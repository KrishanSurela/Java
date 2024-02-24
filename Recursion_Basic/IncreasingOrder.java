package Recursion_Basic;
import java.util.*;
public class IncreasingOrder {
    public static void printInscresingOrder(int num){
         
        if(num==1){
            System.out.print(1+" ");
            return;
        }
        printInscresingOrder(num-1); 
        System.out.print(num+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of Num : ");
        int num = sc.nextInt();
        printInscresingOrder(num);
        sc.close();
    }
}
