import java.util.*;

public class CircleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give the Radius of Circle :");

        float r = sc.nextFloat();

        float pi = 3.14f;

        float area = pi*r*r;

        System.out.println("Area of Circle is : "+area);

        sc.close(); 

    }
}
