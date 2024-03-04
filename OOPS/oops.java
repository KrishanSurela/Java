
public class oops {
    public static void main(String[] args) {
        Pen p1 = new Pen(); //created a pen object called p1
        
        p1.setColor("Blue"); 
        System.out.println(p1.color);

        p1.color="Red";
        System.out.println(p1.color);

        p1.setTip(5);
        System.out.println(p1.tip);
    }
}
class Pen{
    //properties+function
    int tip;
    String color; 

    protected void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip=newTip;
    }
} 
class Student{
    String name;
    int age;
    float percentage;

    void calcPercentage(int phy ,int chem, int math){
        //code
    }
}