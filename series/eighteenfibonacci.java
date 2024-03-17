public class eighteenfibonacci {
    public static void main(String[] args) {
        int val1 = 0, val2 = 1   ;
        System.out.print(val1 + " " + val2 + " ");
        for (int i = 3; i <= 10; i++) {
            int val3 = val2 + val1;
            val1=val2;
            val2=val3;
            System.out.print(val3 + " "); 
        }
    }
}
