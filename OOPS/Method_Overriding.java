 
public class Method_Overriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.display(); // Display B
    }
}

class A{
    void display(){
        System.out.println("Display A");
    }
}
class B extends A{
    void display(){
        System.out.println("Display B");
    }
}