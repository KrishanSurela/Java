public class seven {
    public static int power(int i, int j) {
        int result = 1;
        while (j != 0) {
            result = result * i;
            j--;
        }

        // System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        int n = 4, fact = 1;
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
            sum = sum + (double)power(i, i) / fact;
        }
        System.out.println(sum);
    }
}
