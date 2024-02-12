package Loops_java;
import java.util.*;
public class loopExamples {
    public static void main(String[] args) {
        //int count =0;
        // while (count<10000000){
        //     System.out.println("Hello Dosto "+ ++count);
        // }

        // while(true){
        //     System.out.println("krishan Kumar"); //infinite
        // }

        for(int i=1;i<=10;i++){
            System.out.println(i+" ");
        }
        System.out.println();

        for(int i=1;i<=4;i++){
            for(int j=1;j<=4;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //Print Reverse a number

        int digit=250404;

        while(digit>0){
            int lastDigit =digit%10; 
            System.out.print(lastDigit); 
            digit = digit/10;
        }
        System.out.println();
        // Reverse a Number From Reference

        int n = 987654321;

        int reversedNum=0;;
        while(n!=0){
            int lastDigit = n%10;

            reversedNum = (reversedNum*10)+lastDigit;

            n=n/10; 
        }

        System.out.println(reversedNum);

        // number which is divisible by 10
        Scanner sc =new Scanner(System.in);

        do{
            System.out.println("Enter Your Number :");
            int m = sc.nextInt();
            if(m%10==0){
                System.out.println("This is right Number : "+m);
                break;
            }
            
            System.out.println("Enter another number which is divisible by 10 :");
            System.out.println("Your Given Number is "+m);
        }while(true);



        
        // Display all numbers enterd by user except multiples of 10.

        // do{
        //     System.out.println("Enter your number :");
        //     int o = sc.nextInt();

        //     if(n%10==0){
        //         continue;
        //     }
        //     System.out.println("Nunber was : "+o); 
        // }while(true);
        sc.close();
       
    }
}
