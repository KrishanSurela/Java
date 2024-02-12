package Loops_java;
import java.util.*;
public class Facto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the Number : ");
        int num = sc.nextInt();
        int facto=1;;

        if(num==1 || num==0){
            System.out.println("Factorial Value  :"+num);
        }
        
        else{
            while(num>0){
                facto =num*facto;
                num--;
            }
            System.out.println("factorial value  :"+facto);
        }
        sc.close();
       
    }
}
