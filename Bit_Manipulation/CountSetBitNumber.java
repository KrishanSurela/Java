package Bit_Manipulation;
// count of set bits in a number or occurance of 1 bit 
import java.util.*;
public class CountSetBitNumber {
    public static int countSet(int number){
        int counter=0;
        while(number>0){
            if((number&1)!=0){ //Check Least Significant Bit 1 or 0 
                counter++;
            }
            number =number>>1; 
        }
        return counter;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int number = sc.nextInt();
        System.out.println("Number of set bit is "+countSet(number));
        sc.close();
    }
}
