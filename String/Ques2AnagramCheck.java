import java.util.Arrays;

public class Ques2AnagramCheck {
    public static void bubbleSort(char[] ch){
        for(int i=0;i<ch.length-1;i++){
            for(int j=0;j<ch.length-i-1;j++){
                if(ch[j]>ch[j+1]){
                    char temp = ch[j];
                    ch[j]=ch[j+1];
                    ch[j+1]=temp;
                }
            }
        } 
    }
    public static void checkAnagram(String str1,String str2){
        str1 =str1.toLowerCase();
        str2 =str2.toLowerCase();
        int m = str1.length();
        int n = str2.length();

        if(m==n){
            char [] ch1 = str1.toCharArray();
            char [] ch2 = str2.toCharArray();
                
            bubbleSort(ch1);
            bubbleSort(ch2);
            // array call by reference hota hai ese aur ese return nhi kr skte ye reference me direct change hota hai

            Boolean result = Arrays.equals(ch1,ch2);

            // to compare a array we use Arrays.equals() method
            if(result){
                System.out.println("Given String is Anagram");
            }
            else{
                System.out.println("Given String are not Anagram");
            }
        }
        else{
            System.out.println("Given String are not Anagram");
        }
    }
    public static void main(String[] args) {
        String str1 ="Earth";
        String str2 ="Hetrt";
        checkAnagram(str1, str2);
    }
}

//  In Java, the StringBuffer class is used to create mutable (modifiable) string objects

// intern() =>
// String str = new String("Welcome to JavaTpoint").intern(); // statement - 1  
// String str1 = new String("Welcome to JavaTpoint").intern(); // statement - 2  
// System.out.println(str1 == str); // prints true  

//In the above code snippet, the intern() method is invoked on the String objects. Therefore, the memory is allocated in the SCP. For the second statement, no new string object is created as the content of str and str1 are the same. Therefore, the reference of the object created in the first statement is returned for str1. Thus, str and str1 both point to the same memory. Hence, the print statement prints true.