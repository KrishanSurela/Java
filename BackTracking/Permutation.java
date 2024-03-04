public class Permutation {
    public static void findPermutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // recursion O(n*n!)
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abcde" => "ab"+"de" = "abde" //remove character c
            // str = str.substring(0, i) + str.substring(i + 1, str.length());
            String newstr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(newstr, ans + curr);
        }
    }

    public static void main(String Args[]) {
        String str = "abc";
        findPermutation(str, "");
    }
}
// abc
// acb
// bac
// bca
// cab
// cba