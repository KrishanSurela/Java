public class nine {

    public static void main(String[] args) {
        int n = 23;
        int sum = 0;

        for (int i = 5; i <= n; i = i + 5) {
            sum = sum + (i * i);
        }
        System.out.println(sum);
    }
}
