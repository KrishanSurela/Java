public class twentytwo {
    // 1 3 7 15 31 63 127 255 511 1023
    public static void main(String[] args) {
        int n = 10;
        int previous = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print(2 * previous + 1 + " ");
            previous = 2 * previous + 1;
        }
    }
}
