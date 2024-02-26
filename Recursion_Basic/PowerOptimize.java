package Recursion_Basic;

public class PowerOptimize {
    public static int optimizedPower(int a, int n) {
        if (n == 0) {
            return 1;
        }
        int halfPower = optimizedPower(a, n / 2);
        int halfPowerSq = halfPower * halfPower;

        // n is odd

        if (n % 2 != 0) {
            halfPowerSq = a * halfPowerSq;
        }
        return halfPowerSq;
    }

    public static void main(String[] args) {
        System.out.println(optimizedPower(2, 10));
    }
}

// Time complexity O(log(n))

// Case 1. x^n where n is even
// => x^n/2 * x^n/2
// => 2^10 => 2^10/2 * 2^10/2

// Case 2. x^n where n is odd
// => x * x^n/2 * x^n/2
// => 2^5 => 2* 2^5/2 * 2^5/2 => 2 * 2^2 * 2^2