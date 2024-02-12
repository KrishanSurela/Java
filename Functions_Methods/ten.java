package Functions_Methods;
import java.util.*;
public class ten {
    public static void decToBin(int num){
        int originalNum =num;
        int bin=0;
        int rem;
        int pow=0;
        while(num>0){
            rem=num%2;
            bin = bin + (rem*(int)Math.pow(10,pow));
            num=num/2;
            pow++;
        }
        System.out.println("Binary Number of \""+originalNum+"\" is "+bin);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Decimal Number :");
        int num = sc.nextInt();
        decToBin(num);
        sc.close();
    }
    
}
