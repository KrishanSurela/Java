 
import java.util.Scanner;

public class Scan_Calc {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number");
        double num1= input.nextDouble();
        System.out.print("enter second number");
        double num2= input.nextDouble();
        System.out.println("enter any operator-(+,-,*,/)");
        char operator =input.next().charAt(0);
        double result;
        if(operator == '+'){
            result=num1+num2;
            System.out.print(+result);
        }
        else if(operator == '-'){
            result=num1-num2;
            System.out.print(+result);
        }
        else if(operator=='*'){
            result=num1*num2;
            System.out.print(+result);
        }
        else if(operator == '/'){
            result=num1/num2;
            System.out.println(+result);
        } 
        else{
            System.out.println("invalid operator");
        }
    }
}