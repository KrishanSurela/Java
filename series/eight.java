public class eight {
    public static void main(String[] args) {
        int n = 3;
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum - (double)i / (i + 1);
            } else {
                sum = sum + (double) i / (i + 1);
            }
        }
        System.out.println(sum);
    }
}
