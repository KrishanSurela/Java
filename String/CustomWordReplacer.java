import java.util.Scanner;

public class CustomWordReplacer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        String output = processSentence(input);
        System.out.println("Output: " + output);
        scanner.close();
    }

    public static String processSentence(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char firstChar = word.charAt(0);

            if (isVowel(firstChar)) {
                result.append(word).append("ma");
                for (int j = 0; j < i + 1; j++) {
                    result.append("a");
                }
            } else {
                result.append(word.substring(1)).append(firstChar).append("ma");
                for (int j = 0; j < i + 1; j++) {
                    result.append("a");
                }
            }

            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
