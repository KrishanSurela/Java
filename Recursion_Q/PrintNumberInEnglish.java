package Recursion_Q;

public class PrintNumberInEnglish {
    public static void NumberInEnglish(int number) {

        String English[] = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" };

        if (number == 0) {
            return;
        }

        int lastDigit = number % 10;

        NumberInEnglish(number / 10);

        System.out.print(English[lastDigit] + " ");
    }

    public static void main(String[] args) {
        NumberInEnglish(564575);
    }
}
