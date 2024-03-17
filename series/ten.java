public class ten {
    public static void main(String[] args) {
        int n = 5, sum = 0;
        for (int i = 1; i <= n; i++) {
            int j = i;
            while (j != 0) {
                sum = sum + (2 * j - 1);
                j--;
            }
        }
        System.out.println(sum);
    }
}
