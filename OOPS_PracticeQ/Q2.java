package OOPS_PracticeQ;

public class Q2 {
    public static void main(String[] args) {
        Vehicle obj1 = new Vehicle();

        //obj1.print1(); error =>dont recognize print1 method by obj1 beacuse obj1 is a vehicle type reference variable and can access print() method.

        Vehicle obj2 = new Vehicle();
        obj2.print();
    }
}
class Vehicle{
    void print(){
        System.out.println("Parent Class");
    }
} 
class Car extends Vehicle{
    void print1(){
        System.out.println("Derived Class");
    }
}
