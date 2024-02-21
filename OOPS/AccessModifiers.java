package OOPS;
class MyAddress{
    public String name;  // public type ke data member apne package me access kr skte hai sath ki sath dusre package me bhi access kr skte hai
    int number; // default
    // data member by default , default type ke hote hai matlab en data member ko apne package ke ander sab jagah se access kr skte hai lekin another package me nhi.

    protected int accountNumber; 

    // protected type ke data member ko ,apne package me access kr skte hai lekin dusre package se subclass me access kr skte hai.

    private String password="1234";

    // private data member ko usi class se access kr skte hai jis class me defined hai uski sb class ya non sub class se bhi access nhi kr skte . dusre package ki to socho hi mt 

    // means that a private member cannot be accessed from outside the class, not even from subclasses or classes in the same package. The private modifier is the most restrictive access level in Java. 

}
public class AccessModifiers {
    public static void main(String[] args) {
        MyAddress ma = new MyAddress();
        ma.name = "Bansur";
        ma.number=1234;
        ma.accountNumber=362492;
 
    }
}
