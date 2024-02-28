public class substring {
    public static String subString(String str, int startingIndex, int endingIndex) {
        String substr = "";
        for (int i = startingIndex; i < endingIndex; i++) {
            substr += str.charAt(i);
        }
        return substr;
    }

    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.println(subString(str, 3, 6));

        // Predefined String Function
        System.out.println(str.substring(3, 6));// loW
    }
}
