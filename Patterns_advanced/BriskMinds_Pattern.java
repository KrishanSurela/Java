public class BriskMinds_Pattern {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                if ((i == 4 && j == 3) || (i == 4 && j == 2) || (i == 3 && j == 2)) {
                    System.out.print("  ");
                } else {
                      System.out.print(j + " ");
                }
            }
            for (int k = 0; k < 2 * (5 - i) - 1; k++) {
                System.out.print("  ");
            }
            for (int l = (i == 5) ? 2 : 1; l <= i; l++) {
                if ((i == 4 && l == 3) || (i == 4 && l == 2) || (i == 3 && l == 2)) {
                    System.out.print("  ");
                } else {
                    System.out.print(l + " ");
                }
            }

            System.out.println();
        }
    }
}
