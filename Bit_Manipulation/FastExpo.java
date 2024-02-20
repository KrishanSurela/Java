package Bit_Manipulation;
import java.util.*;

public class FastExpo {
    public static int power(int Base,int Power){ 
        int answer =1;
        while(Power>0){
            if((Power&1)!=0){ //check LSB (101 & 001 => 1)
                answer = answer * Base;
            }
            Base=Base*Base;
            Power=Power>>1;
        } 
        return answer;
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Base :");
        int base = sc.nextInt();
        System.out.println("Enter power :");
        int power = sc.nextInt();
        System.out.println("Answer : "+power(base, power));
        sc.close();
    }
}
