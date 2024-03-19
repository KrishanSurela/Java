public class twentyone {
    // 6 9 14 21 30 41 54
    public static void main(String[] args) {
        int m = 6, d = 3;
        for (int i = 1; i <= 10; i++) {
            System.out.print(m + " ");
            m = m + d;
            d = d + 2;
        }
    }
}
