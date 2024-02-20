package Bit_Manipulation;
import java.util.*;
public class getIthBit {
    public static int getBit(int num , int position){
        int bitmask = 1<<position;
        if((num&bitmask)==0){
            return 0;
        }else{
            return 1;
        } 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int num = sc.nextInt();
        System.out.print("Enter Position of bit ,What do you want to Know : ");
        int position = sc.nextInt();
        System.out.println("Bit is "+getBit(num, position)+" at position "+position);
        sc.close();
    }
}
