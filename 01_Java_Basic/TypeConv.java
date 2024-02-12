public class TypeConv {
    public static void main(String[] args) {
        int b= 9;
        float a =b;

        char ch ='a';
        int number =ch;

        char ch2 ='A';
        int number2 =ch2;

        char ch3 ='z';
        int number3 =ch3;

        char ch4 ='Z';
        int number4 =ch4;

        char ch5 = '0'; 
        int number5 = ch5;

        char ch6 ='9';
        int number6 =ch6;

        System.out.println(number5);//48
        System.out.println(number6);//57
        System.out.println(number);//97 
        System.out.println(number3);//122
        System.out.println(number2);//65
        System.out.println(number4);//90
        System.out.println(a);//9.0
    }
    
}
