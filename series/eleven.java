public class eleven {
    public static void main(String[] args) {
        int sum = 1, n = 6;
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + (i * i);
            } else {
                sum = sum - (i * i);
            }
        }
        System.out.println(sum);
    }
}
