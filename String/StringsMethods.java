public class StringsMethods {
    public static void main(String[] args) {
        //compareTo => return type int
        String s1 = "Krishan";
        String s2 = "KRISHAN";
        System.out.println(s1.compareTo(s2)); // 32
        System.out.println(s1.compareToIgnoreCase(s2)); //0

        // indexOf => return first index of given character.
        System.out.println(s1.indexOf("s")); //3
        System.out.println(s1.indexOf("H")); //-1
        System.out.println(s2.indexOf("HA")); //4
        System.out.println(s1.indexOf("i",3)); //-1  // index of given character after given index
        System.out.println(s1.indexOf("i",2)); //2
        System.out.println(s1.indexOf("i",1)); //2

        // toCharArray() => convert string to char array. (return type char array)

        char name[] =s1.toCharArray();
        // for(int i=0;i<name.length;i++){
        //     System.out.print(name[i]);
        // }

        for(char /*collection type*/i : name /*collection variable_name*/){
            System.out.print(i);
        }
        System.out.println();

        // split() => to convert a Given String to StringArray, saperate with a given character in method. (retrun type String array)

        String College = "Engineering College Bikaner";
        String c[] = College.split("");

        for(String i : c){
            System.out.print(i);
        }
        System.out.println();
        // substring() => substring method in Java is used to get a part of a string based on the specified index values. (always returns a new String)
        String parts = College.substring(4);
        System.out.println(parts);//neering College Bikaner
        String part2 = College.substring(7,11);
        System.out.println(part2);//ring
        //String part2 = College.substring(11,7); // StringIndexOutOfBoundsException.
        String part3 = College.substring(7,7); 
        System.out.println(part3); // Nothing

        // replace() => to replace a existing character to given character;
        String newString = s2.replace("A", "E");
        System.out.println(newString); // return new string
        String newString2 = s2.replace("A", "*");
        System.out.println(newString2); // return new string

        // concat() => to concate a string to an existing string.

        String concatestring = s1.concat(newString2);
        System.out.println(concatestring);
        
        // Robust features of java =>
        // In java , garbage collector run automatically and remove unused object from memory .

        // startWith()  => return type boolean
        System.out.println(s2.startsWith("K")); //true
        // endsWith()
        System.out.println(s2.endsWith("K")); //false
        //toLowerCase() => convert letters to lowercase. // return new String

        System.out.println(s2.toLowerCase()); //krishan 

        System.out.println(s2.toUpperCase()); // KRISHAN
        System.out.println(s1); //Krishan
        s1=s1.toUpperCase(); 
        System.out.println(s1); //KRISHAN

        // trim() => to remove left and right white space.
        String fullName ="  Krishan  Kumar  Surela  "; 
        System.out.println(fullName.trim().length());//22

        // String.valueOf() =>
        // The java string valueOf() method converts different types of values into string. By the help of string valueOf() method, you can convert int to string, long to string, boolean to string, character to string, float to string, double to string, object to string and char array to string.

        int num=5;
        String numString = String.valueOf(num);
        System.out.println((numString+12).toString()); //512 

        // find datatypes of the variables

        System.out.println(((Object)numString).getClass().getSimpleName()); //String
        System.out.println(((Object)num).getClass().getSimpleName()); //Integer

        // toString() => The toString() method is automatically invoked when an object is printed, concatenated with a string, or passed as an argument to another method that expects a string. 

        //lastIndexOf() => return last index of given string till given index
            //String College = "Engineering College Bikaner";
        System.out.println(College.lastIndexOf("e",10)); //6
        System.out.println(College.lastIndexOf("e",3)); //-1
        System.out.println(College.lastIndexOf("z",3)); //-1
        System.out.println(College.lastIndexOf("E",0)); //0
        System.out.println(College.lastIndexOf("gi",0)); //-1 
        
    }
}
