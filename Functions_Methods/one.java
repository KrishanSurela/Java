package Functions_Methods;
import java.util.*;

public class one {

    public static void printHelloKrishan(int i){
        System.out.println("Hello Krishan "+ i);
    }

    public static int calcSum(int a,int b){//parameters
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        // 1st Action
        for(int i =1;i<=10;i++){
            printHelloKrishan(i);
        }
        // 2nd Action
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Parameter");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Parameter");
        int b = sc.nextInt(); 

        int sumOfTwoGivenParams = calcSum(a,b);//arguments

        System.out.println("sum Of Two Given Params is :"+sumOfTwoGivenParams);

        sc.close();
    }
}
