import java.util.*;

public class SwitchCaseCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of 1st Number :");
        int num1 = sc.nextInt();
        System.out.println("Enter Value of 2nd Number :");
        int num2 = sc.nextInt();

        System.out.println("Enter Operator :");

        int Operator = sc.next().charAt(0);

        switch (Operator) {
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1%num2);
                break;
        
            default: System.out.println("Invalid Operator");
                break;
        }

    }
}
