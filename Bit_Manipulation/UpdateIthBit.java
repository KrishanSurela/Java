package Bit_Manipulation;
import java.util.*;
public class UpdateIthBit {
    public static int clearBit(int number,int pos){
        int bitmask = ~(1<<pos);
        return number & bitmask;
    }
    public static int setBit(int num,int position){
        int bitmask = 1<<position;
        return num | bitmask;
    }
    public static int updateBit(int number,int pos,int newBit){
        if(newBit==0){
            return clearBit(number, pos);
        }else{
            return setBit(number, pos);
        }

        // number = clearBit(number, pos);
        // int bitmask = newBit<<pos;
        // return number | bitmask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number = sc.nextInt();
        System.out.println("Enter position : ");
        int pos = sc.nextInt();
        System.out.println("Write the bit you want to change :");
        int newBit = sc.nextInt();
        System.out.println("Number After Update bit : "+updateBit(number, pos, newBit));
        sc.close();
    }
}
