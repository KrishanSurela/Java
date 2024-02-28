package Recursion_Q;

public class Stringlength {
    public static int length(String str) {
        if (str.isEmpty()) {
            return 0;
        }

        return 1 + length(str.substring(1));

        // 1+ "rishan Kumar Surela"
        // 1+1+ "ishan Kumar Surela"
        // 1+1+1+ "shan Kumar Surela"
        // 1+1+1+1+ "han Kumar Surela"
        // 1+1+1+1+1+ "an Kumar Surela"
        // 1+1+1+1+1+1+ "n Kumar Surela"
        // 1+1+1+1+1+1+1+ " Kumar Surela"
        // 1+1+1+1+1+1+1+1+ "Kumar Surela"
        // 1+1+1+1+1+1+1+1+1+ "umar Surela"
        // 1+1+1+1+1+1+1+1+1+1+ "mar Surela"
        // 1+1+1+1+1+1+1+1+1+1+1+ "ar Surela"
        // 1+1+1+1+1+1+1+1+1+1+1+1+ "r Surela"
        // 1+1+1+1+1+1+1+1+1+1+1+1+1+ " Surela"
        // 1+1+1+1+1+1+1+1+1+1+1+1+1+1+ "Surela"
        // 1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+ "urela"
        // 1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+ "rela"
        // 1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+ "ela"
        // 1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+ "la"
        // 1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+ "a"
        // 1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+ "" =20

    }

    public static void main(String[] args) {
        String str = "Krishan Kumar Surela";
        System.out.println("Length of String : " + length(str));
    }
}