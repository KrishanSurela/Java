package Recursion_Basic;
import java.util.*;
public class PrintSumOfNaturalNum {
    public static int sum(int num){
        if(num==1){
            return 1;
        }
         return num+sum(num-1);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of Natural Number : ");
        int num = sc.nextInt();
        System.out.println("Sum of first "+num+ " Natural number is "+sum(num));
        sc.close();
    }
}
