package Bit_Manipulation_Q;
//Convert uppercase characters to lowercase using bits.
public class Ques4 { 
     public static void main(String[] args) {
        // Convert uppercase character to lowercase
        for (char ch = 'A'; ch <= 'Z'; ch++) {
        System.out.print((char)(ch | ' '));
        // prints abcdefghijklmnopqrstuvwxyz
        }
    }
}
  
/*
इस code का लोजिक यह है कि एक for loop का उपयोग करके ‘A’ से ‘Z’ तक के सभी uppercase characters को iterate कर रहे हैं। फिर उन characters को ’ ’ (space) के साथ bitwise OR operation कर रहे हैं। यह operation उन characters के ASCII values को बदल देता है, जिससे वे lowercase में convert हो जाते हैं। फिर उन characters को println() method का उपयोग करके प्रिंट कर रहे हैं।
 */
