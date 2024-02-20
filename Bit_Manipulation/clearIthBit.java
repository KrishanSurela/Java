package Bit_Manipulation;
import java.util.*; 

public class clearIthBit {
    public static int clearBit(int number,int pos){
        int bitmask = ~(1<<pos);
        return number & bitmask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number = sc.nextInt();
        System.out.println("Enter Position : ");
        int pos = sc.nextInt();
        System.out.println("Number After Remove Bit : "+clearBit(number, pos));
        sc.close();
    }

}
