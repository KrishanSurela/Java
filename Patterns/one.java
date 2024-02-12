package Patterns;

public class one {
    public static void main(String[] args) {
        for(int rows=0;rows<4;rows++){
            for(int cols=0;cols<=rows;cols++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // n-i+1
        // ****
        // ***
        // **
        // *
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //OR

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1;i<5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        System.out.println();
        char ch='A';
        for(int rows=1;rows<=4;rows++){
            for(int cols=1;cols<=4-rows+1;cols++){
                System.out.print(ch++);
            }
            System.out.println();
        }

        System.out.println();

        
        char ch1='a';
        for(int rows=1;rows<=4;rows++){
            for(int cols=1;cols<=rows;cols++){
                System.out.print(ch1++);
            }
            System.out.println();
        }
    }
}
