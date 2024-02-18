public class charAt {
    public static void printLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
    public static void main(String[] args) {
        String firstName = "Krishan";
        String lastName ="Surela";
        String fullName = firstName+" "+lastName;
        printLetters(fullName);
    }
}
