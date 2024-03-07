
public class TernaryOp {
    public static void main(String[] args) {
        int a = 10, b = 25, c = 15, d = 20;

        int max = (a > b) ? ((a > c) ? ((a > d) ? a : d)
                                     : ((c > d) ? c : d)
                            )
                          : ((b > c) ? ((b > d) ? b : d)
                                     : ((c > d) ? c : d)
                            );

        System.out.println("Largest number among " + a + ", " + b + ", " + c + ", and " + d + " is " + max + ".");
    }
}