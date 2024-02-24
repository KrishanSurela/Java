 
import java.util.*;
public class Constructors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name : ");
        String name = sc.nextLine();
        System.out.println("Enter Roll Number : ");
        int roll = sc.nextInt();

        System.out.println("Enter Student 2 Roll Number : ");
        int roll2 = sc.nextInt();
        Student s = new Student(name,roll);
        //Student s1 = new Student(); // there is no default constructor in student class , agar koi bhi constructor nhi hota to java automatically default constructor bna deta hai lekin ab nhi bnayega kyuki bahot se constructor pahle se mojood hai
        Student s2 = new Student(roll2);
        System.out.println("Your Name is "+s.getName());
        System.out.println("Your Roll Number is "+s.getRoll());
        System.out.println("Student 2 Roll Number is "+s2.getRoll());
        sc.close();
    }
}
class Student{
    private String name;
    private int roll;
    Student(String name,int roll){
        System.out.println("Constructor is called...");
        this.name= name;
        this.roll=roll;
    }
    Student(int roll){
        System.out.println("Student 2 Constructor is called..."); 
        this.roll=roll;
    }
    String getName(){
        return this.name;
    }
    int getRoll(){
        return this.roll;
    }
}