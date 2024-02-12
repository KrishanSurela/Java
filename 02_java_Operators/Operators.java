 
public class Operators {
    public static void main(String[] args) {
        int A=10;
        int B=5;
        //Relational Operators

        System.out.println(A!=B);//true
        System.out.println(A==B);//false
        System.out.println(A>B);//true
        System.out.println(A<B);//false 
        System.out.println(A>=B);//true
        System.out.println(A<=B);//false

        // Unary Arithmetic Operators
        

        // pre increment

        int G = 10;
        int H = ++G;
        System.out.println(G);//11
        System.out.println(H);//11

        // pre decrement

        int I = 10;
        int J = --I;
        System.out.println(I);//9
        System.out.println(J);//9


        //post increment 

        int C = 10;
        int D = C++;
        System.out.println(C);//11
        System.out.println(D);//10

        // post decrement
        int E = 10;
        int F = E--;
        System.out.println(E);//9
        System.out.println(F);//10



    }
}
