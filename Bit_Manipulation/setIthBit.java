package Bit_Manipulation;
import java.util.*;
public class setIthBit {
    public static int setBit(int num,int position){
        int bitmask = 1<<position;
        return num | bitmask;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int num = sc.nextInt();
        System.out.println("Enter position where you want to set bit");
        int position = sc.nextInt();
        System.out.println("Number after set Bit : "+setBit(num, position));
        sc.close();
    }
}
