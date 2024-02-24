package Recursion_Basic;

public class PrintNthFibonacciNumber {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fnm1 = fibonacci(n - 1);
        int fnm2 = fibonacci(n - 2);
        int fn = fnm1 + fnm2;
        return fn;
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(fibonacci(n));
    }
}

// Space Complexity => O(n)
// Time Complexity => O(n2)

// Aage Jaake Dynamic Programing me Time Complexity ko O(n) kr denge