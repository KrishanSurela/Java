package OOPS_PracticeQ;

public class Q5 {
    public static void main(String[] args) {
        Test t = new Test();
        t.changeB();
        // OR Test.changeB();
        System.out.println(Test.a+Test.b);//40
    }
}
class Test{
    static int a =10;
    static int b;
    static void changeB(){
        b=a*3;
    }
}
