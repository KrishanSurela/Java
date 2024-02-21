package OOPS;

public class CopyConstructor {
    public static void main(String[] args) {
        System.out.println("-----There is Normal constructor -----");
        Student s1 = new Student(12,"Krishan"); 
        s1.address ="bansur"; 
        s1.marks[0] = 10;
        s1.marks[1] = 20;
        s1.marks[2] = 30;
        s1.marks[3] = 40; 
        System.out.println(s1.name+" "+s1.roll+" "+s1.address);


        System.out.println("-----There is copy constructor -----");
        Student s2 = new Student(s1);
        s2.address="Jaipur";

        //s1 ko s2 ke ander copy krne ke baad hmne s1 me change kiya hai to idealy s2 me change nhi aana chahiye lekin change aata hai.
        s1.marks[3]=69;

    
        System.out.println(s2.name+" "+s2.roll+" "+s2.address);

        for(int i= 0;i<4;i++){
            System.out.println(s1.marks[i]);
        }
    }
}
class Student{
    int roll;
    String name;
    String address;
    int marks[] = new int[4];

    Student(int roll,String name){
        this.roll=roll;
        this.name=name;
    }

    Student(Student s1){
        this.name=s1.name;
        this.roll=s1.roll;
        this.address=s1.address;
        this.marks=s1.marks;//s1.marks is a reference of array esliye  s2 ke ander s1 ko copy krne ke baad s1 me change krte hai to s2 me bhi change ho jata hai.
    }
}
