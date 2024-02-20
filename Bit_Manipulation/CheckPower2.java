package Bit_Manipulation;
import java.util.*;
// check if a number is power of 2 or not
public class CheckPower2 {
   public static boolean isPowerOfTwo(int number){
     return (number & (number-1))==0;
   }
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter Number ");
    int number = sc.nextInt(); 
    if(isPowerOfTwo(number)){
        System.out.println("Given number is a power of two");
    }
    else{
        System.out.println("Given number is not a power of two");
    }
    sc.close();
   }
}
