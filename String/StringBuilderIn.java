
public class StringBuilderIn {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(char ch='a';ch<='z';ch++){
            sb.append(ch); // time complexity O(26)
        }
        System.out.println(sb); 
    }
}
// class ka naam stringbuilder nhi rkhna hai yaha
 // toString(); => Convert any object to string
        // int a =10;
        // a.toString() =>error Beacuse toString() method can  only be applied to object. here is variable.

        // Integer a=10;
        // a.toString(); will run without error
        
        // char a ='a';
        // a.toString() =>error Beacuse toString method apply only on object. here is variable.

        // Character a='a';
        // a.toString(); will run without error

