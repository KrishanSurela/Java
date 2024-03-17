public class thirteen {
    public static void main(String[] args) {
        double sum = 0;
        int n = 12, fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * (i + 1);
            sum = sum + (double) i / fact;
        }
        System.out.println(sum);
    }
}
