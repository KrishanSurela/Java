package Bit_Manipulation;
import java.util.*;
public class clearLastNBits{
    public static int clearLastNbit(int number , int pos){
        int bitmask = ~0<<pos;
        return number & bitmask;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Number :");
        int number = sc.nextInt();
        System.out.println("Enter Position : ");
        int pos = sc.nextInt();
        System.out.println("After Clear Last "+pos+" Bit , Number is :"+ clearLastNbit(number, pos));
        sc.close();
    }
}
