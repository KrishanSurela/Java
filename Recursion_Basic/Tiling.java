package Recursion_Basic;

public class Tiling {
    public static int tilingProblem(int n) {
        // Base Casse

        if (n == 0 || n == 1) {
            return 1;
        }

        // Kaam
        // Vertical choice
        int fnm1 = tilingProblem(n - 1);

        // Horizontal Choice

        int fnm2 = tilingProblem(n - 2);

        return fnm1 + fnm2;

    }

    public static void main(String[] args) {
        System.out.println("Totals Ways : "+tilingProblem(5));
    }
}
