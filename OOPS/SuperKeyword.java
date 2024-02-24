public class SuperKeyword {
    public static void main(String[] args) {
        Horse h = new Horse();
        System.out.println(h.Color);
    }
}
class Animal{
    String Color;
    Animal(){
        System.out.println("Animal Constructor called");
    }
}
class Horse extends Animal{
    Horse(){
        super();// na likhe to by default super() hi hota hai
        super.Color= "Brown";
        System.out.println("Horse constructor Called");
    }
}
//output=>
//Animal Constructor called
//Horse constructor Called
//Brown