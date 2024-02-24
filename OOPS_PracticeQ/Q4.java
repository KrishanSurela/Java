package OOPS_PracticeQ;

public class Q4 {
    public static void main(String[] args) {
        Test t = new Test();
        t.set_marks(99);
        System.out.println(Test.marks);//99
    }
}
class Test{
    static int marks;
    void set_marks(int marks){
        this.marks = marks;
    }
}
