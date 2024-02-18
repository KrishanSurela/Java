import java.util.*;
//Count how many times lowercase vowels occurred in a String entered by the user.
public class Ques1 {
    public static int vowelsOccured(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String str = sc.nextLine();
        System.out.println("Number of vowels in given String : "+vowelsOccured(str));
        sc.close();
        String str1 = "ApnaCollege".replace("l", "");
        System.out.println(str1);
    }
}
