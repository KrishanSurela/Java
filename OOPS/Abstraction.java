 
public class Abstraction {
    public static void main(String[] args) {

        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.Color);

        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.Color);

        //Animal a = new Animal(); can not create object of abstract class
    }
}
abstract class Animal{
    String Color;

    Animal(){
        Color="brown";
        System.out.println("Animal Constructor Called");
    }
    void eat(){
        System.out.println("animal Eats");
    }
    abstract void walk(); // abstract method does not have their definition or implementation.
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse Constructor Called");
    }
    void changeColor(){
        Color="Dark Brown";
    }
    void walk(){
        System.out.println("Walks on 4 legs");
    }
}
class Chicken extends Animal{
    Chicken(){
        System.out.println("Chicken Constructor called");
    }
    void changeColor(){
        Color="Yellow";
    }
    void walk(){
        System.out.println("Walk on 2 legs");
    }
}