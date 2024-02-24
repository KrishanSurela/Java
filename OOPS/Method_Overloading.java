 
public class Method_Overloading{
    public static void main(String[] args) {
        Clac K = new Clac();
        System.out.println(K.sum(4,6));
        System.out.println(K.sum(5.6f,8.9f));
       // System.out.println(K.sum((float)5.6,(float)8.9) );
        System.out.println(K.sum(9.6,5.3));
        System.out.println(K.sum(3,5,8));
    }
}

class Clac{
    int sum(int a,int b){
        int sum = a+b;
        return sum;
    }
    float sum(float a,float b){
        float sum = a+b;
        return sum;
    }
    double sum(double a,double b){
        double sum = a+b;
        return sum;
    }
    int sum(int a,int b, int c){
        int sum = a+b+c;
        return sum;
    }
}