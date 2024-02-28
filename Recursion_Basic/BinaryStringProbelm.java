package Recursion_Basic;

public class BinaryStringProbelm {
    public static void binaryStringProblem(int n, int lastPlace, String str) {
        // base case

        if (n == 0) {
            System.out.println(str);
            return;
        }
        // if (lastPlace == '0') {
        //     binaryStringProblem(n - 1, 0, str + "0");
        //     binaryStringProblem(n - 1, 1, str + "1");
        // } else {
        //     binaryStringProblem(n - 1, 0, str + "0");
        // }

        binaryStringProblem(n - 1, 0, str + "0");
        if (lastPlace == '0') {
           binaryStringProblem(n - 1, 1, str + "1");
        }
    }

    public static void main(String[] args) {
        binaryStringProblem(3, 0, "");
    }
}
