package Functions_Methods;

public class five {
    //Function Overloading Using Parameter
    public static int sum(int a,int b){//5,9
        return a+b;
    }
    public static int sum(int a,int b,int c){//5,9,6
        return a+b+c;
    }
    public static float sum(float a,float b){//8.5,9.4
       return a+b;
    }
    public static double sum(double a,double b){//8.5,9.4
        return a+b;
    }
    public static void main(String[] args) {
        System.out.println(sum(5,9));
        System.out.println(sum(5,9,6));
        System.out.println(sum(5.5f,9.9f));
        System.out.println(sum(29.6,99.3));

    }
}
