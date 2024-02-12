package Functions_Methods;
import java.util.*;

public class eleven {
    
public static boolean isPalindrome(int n){
    int lastDigit;
    int ori = n;
    int rev=0;
    while(n>0){
        lastDigit = n%10;
        rev = (rev*10)+lastDigit;
        n=n/10;
    }
    if(ori==rev){
        return true;
    }else{
        return false;
    }
}

   public static void main(String[] args) {
    System.out.println("Enter Your Number :");

    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

    boolean isPalindrome =isPalindrome(num);

    if(isPalindrome){
        System.out.println("Given Number is Palindrome");
    }
    else{
        System.out.println("Given Number is not Palindrome");
    }
    sc.close();
   }
}
