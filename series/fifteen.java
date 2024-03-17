public class fifteen {
    public static void main(String[] args) {
        int sum = 0, totalSum=0, n = 4;
        for (int i = 1; i <= n; i++) {
            sum = sum * 10 + 3;
            totalSum = totalSum+sum;
        }
        System.out.println(totalSum);
    }
}
