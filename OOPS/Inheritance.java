
// Single level inheritance
public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}
//Derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("swims in water");
    }
}
