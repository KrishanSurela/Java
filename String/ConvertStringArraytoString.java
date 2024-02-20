public class ConvertStringArraytoString{
    public static String StringArrayToString(String [] fruits){
        StringBuilder sb = new StringBuilder("");
        sb.append(fruits[0]);
        for(int i=1;i<fruits.length;i++){
            sb.append(" "+fruits[i]);
        }
        return sb.toString();
    }
    public static void printString(String arr){
        for(int i=0;i<arr.length();i++){
            System.out.print(arr.charAt(i));
        }
        System.out.println();
    }
    public static void printStringArray(String [] fruits){
        for(int i=0;i<fruits.length;i++){
             System.out.print(fruits[i]+" ");
        }
    }
    public static void main(String [] arr){
        String [] fruits ={"apple","banana","grapes"};
        printString(StringArrayToString(fruits));
        printStringArray(fruits);
    }
}