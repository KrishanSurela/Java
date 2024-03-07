import java.util.Scanner;

public class FindJumpingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isJumpingNumber = checkJumpingNumber(num);

        if (isJumpingNumber) {
            System.out.println(num + " is a jumping number.");
        } else {
            System.out.println(num + " is not a jumping number.");
        }
        sc.close();
    }

    public static boolean checkJumpingNumber(int num) {
        int prevDigit = num % 10;
        num /= 10;

        while (num != 0) {
            int currDigit = num % 10;
            if (Math.abs(currDigit - prevDigit) != 1) {
                return false;
            }
            prevDigit = currDigit;
            num /= 10;
        }

        return true;
    }
}
