public class twenty {
    // 0 6 10 17 22 30 36
    public static void main(String[] args) {
        int m = 0, d = 6, e = 4;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1) {
                System.out.print(m + " ");
                m = m + d;
                d++;
            } else {
                System.out.print(m + " ");
                m = m + e;
                e++;
            }
        }
    }
}
