import java.util.*;

public class Input_Output_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        // name=sc.next(); // it take only one word
        name=sc.nextLine();
        System.out.println(name);
        sc.close();
    }
}
