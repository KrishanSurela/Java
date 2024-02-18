public class printLargestString {
    public static String largestString(String [] fruits){
        String largest = fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        String fruits[] = {"apple","mango","banana"};
        System.out.println("Largest String is : "+largestString(fruits));

    }

    // time complexity
    // O(X*N)
    // X=> Number of letters in largest string
    // N => length of String;

    
}
