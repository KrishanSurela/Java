package Some_concepts;

public class F{
    public static void main(String[] args) {
       Demo d= new Demo();
       d.display();
    }
}


class Demo {
    void display(){
        System.out.println("Display 1");
    }
}

// Ek file me ek hi class public ho skti hai , jo class public hai usi class ke name pe file ka name hoga

// hmesha public class ko sabse upper likhe fir uske niche baaki class agar aeisa nhi krenge to main method not found ki error aayegi
