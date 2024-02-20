package Bit_Manipulation;
import java.util.*;
public class ClearRangeOFBits {
    public static int clearRangeBits(int number , int spos,int epos){
        int a = (~0)<<(epos+1);
        int b = (1<<spos)-1;
        int bitmask = a|b; 
        return number & bitmask;
    }
    public static void main(String [] arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number = sc.nextInt();
        System.out.println("Enter Starting Position : ");
        int spos = sc.nextInt();
        System.out.println("Enter Endining Position : ");
        int epos = sc.nextInt();
        System.out.println("After clear range of bit : "+clearRangeBits(number, spos, epos)); 
        sc.close();
    }
}
