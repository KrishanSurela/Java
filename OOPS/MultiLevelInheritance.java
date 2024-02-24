
public class MultiLevelInheritance {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.eat();
        d.legs=4;
        System.out.println(d.legs);
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("CAN Eats");
    }
    void breathe(){
        System.out.println("Breathe");
    }
}
class Mammal extends Animal{
    int legs;

}
class Dogs extends Mammal{
    String Bread;
}
