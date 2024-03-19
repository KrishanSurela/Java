
public class twentythree {
    public static void main(String[] args) {
        int previous = 1, n = 6;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(previous * (-1) + " ");
            } else {
                System.out.print(previous + " ");
            }
            previous = previous + (int) Math.pow(i, 2);
        }
    }
}
