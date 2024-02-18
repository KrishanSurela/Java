public class StringCompare {
    public static void main(String[] args) {
        String s1 = "Krishan";
        String s2 = "Krishan";
        String s3 = new String("Krishan");

        if(s1==s2){ //true
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        if(s1==s3){ //false
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        // Jab bhi 2 strings ki value ka compare krna ho to == use nhi krenge .equals method use krenge.
        if(s1.equals(s3)){ //true
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

    }
}
