 
import java.util.Scanner;

public class ArraysCC {
    public static void main(String[] args) { 
        int numbers[] = {5,9,6}; 
        int moreNumbers[] = new int[80]; 
        String fruits[] = {"apple","mango","orange"};

        System.out.println(numbers[1]+" "+moreNumbers[1]+" "+fruits[0]);

        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Array Size :");
        int arraySize = sc.nextInt();

        int marks [] = new int[arraySize];

        for(int i=0;i<arraySize;i++){
            System.out.println("Give a number at position : "+i);
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<arraySize;i++){
            System.out.println("A number at position : "+i+" is "+marks[i]); 
        }

        System.out.println("length of array : "+marks.length);
        sc.close();
    }
}
