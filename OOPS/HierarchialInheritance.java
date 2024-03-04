
public class HierarchialInheritance {
   public static void main(String[] args) {
    Fish f = new Fish();
    Mammal m = new Mammal();
    Bird b = new Bird();
    b.fly();
    m.walk();
    f.swim();
    // properties of base class accessing by derived class
    b.eats();
    m.eats();
    f.breathe();

   }
}
class Animal{
    void eats(){
        System.out.println("Can Eats");
    }
    void breathe(){
        System.out.println("Can Breathe");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Can Swim");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("Can Fly");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("Can walk");
    }
}