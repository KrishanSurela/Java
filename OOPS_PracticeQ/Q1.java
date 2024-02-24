package OOPS_PracticeQ;

public class Q1 {
    public static void main(String[] args) {
        Vehicle obj1 = new Car();
        obj1.print();// Derived Class

        Vehicle obj2 = new Vehicle();
        obj2.print(); // Base Class
    }
}
class Vehicle{
    void print(){
        System.out.println("Base class");
    }
}
class Car extends Vehicle{
    void print(){
        System.out.println("Derived Class");
    }
}