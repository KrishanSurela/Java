public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.schoolName="ATSBansur";

        //Student.schoolName="RCI";

        // static mathods aur properties ko class name se bhi access and modify kr skte hai.
        s1.setName("Krishan");
        s1.setRoll(42);
        int percentage = s1.returnPercentage(92, 88, 71);

        System.out.println(percentage);
        // s1 object se schoolName intialize kiya gya
        Student s2 = new Student();

        // lekin ham s2 object se schoolName access kr pa rhe hai . ye static keyword ke karan hi hua hai. kyuki schooName variable static hai.
        System.out.println(s2.schoolName);// ATSBansur

        int percentage1 = s2.returnPercentage(92, 88, 71);
        
        System.out.println(percentage1);

        Student s3 = new Student();
        s3.schoolName="SMSBANSUR";

        System.out.println(s1.schoolName); // SMSBANSUR
        System.out.println(s2.schoolName);// SMSBANSUR
        System.out.println(s3.schoolName);// SMSBANSUR
    }
}
class Student{
    static int returnPercentage(int math,int phy,int chem){
        return ((math+phy+chem)*100/300);
    }

    String name;
    int roll;
    static String schoolName;

    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
    void setRoll(int roll){
        this.roll=roll;
    }
    int getRoll(){
        return this.roll;
    }
}
