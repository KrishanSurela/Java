
public class HybridInheritance {
    public static void main(String[] args) {
        Shark s = new Shark();
        Peacock p = new Peacock();
        Dogs d = new Dogs();
        Cat c = new Cat();

        s.swim();;
        p.fly();
        d.Breathe();
        d.bark();
        c.Breathe();
        c.meau();
        
    }
}
class Animal{
    void eats(){
        System.out.println("eats");
    }
    void Breathe(){
        System.out.println("breathe");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("Swim");
    }
}
class Shark extends Fish{
    void haveLongTeeth(){
        System.out.println("Yes , shark have long teeth");
    }
}
class Bird extends Animal{
    void fly(){
        System.out.println("fly");
    }
}
class Peacock extends Bird{
    void beautyful(){
        System.out.println("Beautiful");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("yes an walk");
    }
}
class Dogs extends Mammal{
    void bark(){
        System.out.println("bark");
    }
}
class Cat extends Mammal{
    void meau(){
        System.out.println("Meau");
    }
}