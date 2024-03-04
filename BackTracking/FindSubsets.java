package BackTracking;

public class FindSubsets {
    public static void findSubset(String str, int index, String ans) {
        if (index == str.length()) {
            if (ans.length() == 0) {
                System.out.println("NULL");
            } else {
                System.out.println(ans);
            }
            return;
        }
        findSubset(str, index + 1, ans + str.charAt(index)); // Choise yes
        findSubset(str, index + 1, ans); // Choice No
    }

    public static void main(String[] args) {
        String str = "ABC";
        findSubset(str, 0, "");
    }
}
// Output =>
// abc
// ab
// ac
// a
// bc
// b
// c
// NULL