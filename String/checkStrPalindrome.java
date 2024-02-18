public class checkStrPalindrome {
    public static void printLetters(String str){
        String rev="";
        for(int i=str.length()-1;i>=0;i--){
             rev = rev+str.charAt(i); 
        }
        if(rev.equals(str)){
            System.out.println("Given String is Pallindrome");
        }
        else{
            System.out.println("Given String is Not Pallindrome");
        }
    }
    public static void main(String[] args) {
        
        String fullName ="MADAM";
        printLetters(fullName);
    }
}
