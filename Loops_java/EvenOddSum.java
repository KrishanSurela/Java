package Loops_java;
import java.util.*;

public class EvenOddSum {
    public static void main(String[] args) {
        int oddSum=0;
        int evenSum=0;
        int number;
        char choice;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("Enter Number :");
            
            number = sc.nextInt();

            if(number % 2 ==0){
                evenSum = evenSum+number;
            }
            else{
                oddSum = oddSum+number;
            }

            System.out.println("Do you want to continue? (Y/N)");

            choice = sc.next().charAt(0);
        }while(choice == 'Y' || choice == 'y');

        System.out.println("Sum of Odd Number :"+ oddSum);
        System.out.println("Sum of Even Number :"+ evenSum);

        sc.close();
    }
}
