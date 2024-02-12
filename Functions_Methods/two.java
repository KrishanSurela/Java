package Functions_Methods;

public class two {

    public static void swap(int a,int b){
        int temp;

        //swapping
        temp=a;
        a=b;
        b=temp;

        System.out.println("value of a : "+a);
        System.out.println("value of b : "+b);
        System.out.println("value of temp : "+temp);
        
    }
    public static void main(String[] args) {
        int a=3;
        int b=5;

        swap(a,b);

        // There is no change in original value.
        System.out.println("value of a : "+a);
        System.out.println("value of b : "+b);
    }
}
