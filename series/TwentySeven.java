public class TwentySeven {
    public static void main(String[] args) {
        for (int i = 1; i <= 8; i++) {
            if (i % 2 == 0) {
                System.out.print(2 * (int) Math.pow(i, 2) + 1 + " ");
            } else {
                System.out.print(2 * (int) Math.pow(i, 2) - 1 + " ");
            }
        }
    }
}
