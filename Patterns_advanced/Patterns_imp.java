package Patterns_advanced;
public class Patterns_imp {
    public static void numberIncreasingPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();

        }
    }

    public static void numberIncreasingReversePyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void numberTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
    public static void reverseLeftHalfPyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i-1;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void kpattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void reverseNumberTriangle(int n){ 
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // print numbers
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        } 
    }
    public static void mirrorImageTriangle(int n){
        //1st part
        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // print numbers
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        } 
        //2nd Part
        for (int i = n-1; i >= 1; i--) {
            // print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            // print numbers
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        } 
    }
    public static void hollowTriangle(int n){
        for(int i =1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                if(i==n || j==1 || j==(2*i)-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void hollowHourglass(int n){
        // 1st part

        for(int i =n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                if(i==n || j==1 || j==(2*i)-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        // 2nd part
        
        for(int i =2;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                if(i==n || j==1 || j==(2*i)-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
    public static void hollowDiamondPyramid(int n){
        //1st part
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                if(j==1 || j==(2*i)-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        //2nd Part

        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                if(j==1 || j==(2*i)-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void rightPascalTriangle(int n){
        for (int i = 1; i <= n; i++) {
            // inner loop to print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
 
            System.out.println();
        }
 
        // outer loop to handle lower part
        for (int i = n-1; i >= 1; i--) {
            // inner loop to print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
 
            System.out.println();
        }
    }
    public static void pascalTriangle(int n)
    {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= n - i; j++) {
 
            // for left spacing
                System.out.print(" ");
            }
 
            // used to represent x(i, k)
            int x = 1;
            for (int k = 1; k <= i; k++) {
 
                // The first value in a line is always 1
                System.out.print(x + " ");
                x = x * (i - k) / k;
            }
            System.out.println();
        }
    }
    public static void main (String []args){
        numberIncreasingPyramid(4);
        numberIncreasingReversePyramid(4);
        numberTriangle(4);
        reverseLeftHalfPyramid(5);
        kpattern(4);
        reverseNumberTriangle(4);
        mirrorImageTriangle(4);
        hollowTriangle(5);
        hollowHourglass(4);
        hollowDiamondPyramid(4);
        rightPascalTriangle(4);
        pascalTriangle(4);
    }
}
