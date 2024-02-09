public class TypePromotion {
    public static void main(String[] args) {
        char a='a';
        char b='b';
        int c =  b-a;

        System.out.println(c);//1


        short d = 5;
        byte e = 24;
        char f = 'c';

        byte bt = (byte) (d+e+f); //-128 
        System.out.println(bt);

        int g =10;
        float h =23.45f;
        long i = 45;
        double j = 50;

        double ans = g+h+i+j;

        System.out.println(ans); //128.4499969482422

                
        // byte k =10;
        // k = k*2 ; can not convert int to byte
        
        byte k =10;
        k =(byte)(k*2) ;

        System.out.println(k);

        int $ = 50;

        System.out.println($);


    }
    
}
