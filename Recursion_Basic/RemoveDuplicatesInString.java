
package Recursion_Basic;

public class RemoveDuplicatesInString {
    public static void removeDuplicates(String str, int idx, StringBuilder newString, boolean map[]) {
        // base Case
        if (idx == str.length()) {
            System.out.println(newString);
            return; // ye nhi likhega to code string.length ke liye bhi run ho jayega aur
                    // StringIndexOutOfBoundsException aa jayegi yaha return kuchh nhi hoga program
                    // terminate ho jayega
        }
        // kaam
        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) { // means character is already in map array
            removeDuplicates(str, idx + 1, newString, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newString.append(currChar), map);
        }
    }

    public static void main(String[] args) {
        String str = "appnnacollege";

        removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
    }
}
