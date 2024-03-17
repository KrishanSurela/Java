public class two {
    public static void main(String[] args) {
        int n = 3;
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum +  (1f / i);
        }
        System.out.println(sum);
    }
}
