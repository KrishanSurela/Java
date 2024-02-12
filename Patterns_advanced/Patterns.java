package Patterns_advanced;

import javax.sound.midi.Soundbank;

public class Patterns {
    public static void hollow_Rect(int rows,int cols){
        //outer loop
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=cols;j++){
                if(i==1 || i==rows || j==1 || j==cols){//boundary cells
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
 

    public static void rotatedPyramid(int rows,int cols){
        for(int i=1;i<=rows;i++){
            //spaces
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            // *
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void invertedHalfPyramid(int rows,int cols){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=6-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void floydsTriangle(int rows,int cols){
        int counter=1;
        for(int i=1; i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void zeroOneTriangle(int rows,int cols){
        for(int i =1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
     
    
    public static void butterFly(int n){
        //1st half
        for(int i=1;i<=n;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            };
            //Spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  "); 
            };
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            };
            System.out.println();
        }
        //2nd half
        for(int i=n;i>=1;i--){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            };
            //Spaces
            for(int j=1;j<=2*(n-i);j++){
                System.out.print("  "); 
            };
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            };
            System.out.println();
        }
    }
    public static void solidRhomnus(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void hollowRhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
               
            }
            System.out.println();
        }
    }
    public static void  diamondPattern(int n){
        // 1st half
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            } 
            System.out.println();
        }
        
        //2nd half
        for (int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            } 
            System.out.println();
        } 
    }
    public static void numberPyramid(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print(i);
            } 
            System.out.println();
        }
    } 

    public static void palindromicPyramid(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            } 
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
       hollow_Rect(4,4);
       rotatedPyramid(4,4);
       invertedHalfPyramid(5,5);
       floydsTriangle(5,5);
       zeroOneTriangle(5,5);
       butterFly(4); 
       solidRhomnus(5);
       hollowRhombus(5);
       diamondPattern(4);
       numberPyramid(5);
       palindromicPyramid(5);
    }
}

/*
  
****
*  *
*  *
****
   *
  **
 ***
****
1 2 3 4 5 
1 2 3 4
1 2 3
1 2
1
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1
*             *
* *         * *
* * *     * * *
* * * * * * * *
* * * * * * * *
* * *     * * *
* *         * *
*             *
     ******
    ******
   ******
  ******
 ******
     *****
    *   *
   *   *
  *   *
 *****
   *
  ***
 *****
*******
*******
 *****
  ***
   *
    1
   222
  33333
 4444444
555555555
    1
   212
  32123
 4321234
543212345
 */