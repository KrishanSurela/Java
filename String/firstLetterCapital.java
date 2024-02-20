public class firstLetterCapital {
    public static String firstCapital(String name){
        char ch =Character.toUpperCase(name.charAt(0));
        String newName = "";
        newName=newName+ch; //(String+char => String)
        for(int i=1;i<name.length();i++){
           if(name.charAt(i)==' ' && i<name.length()-1){
            newName=newName+name.charAt(i);
            i++;
            newName=newName+Character.toUpperCase(name.charAt(i));
           }else{
            newName=newName+name.charAt(i);
           }
        }
        return newName;
    }
    public static void main(String[] args) {
        String name ="hi, this is krishan surela";
        System.out.println(firstCapital(name));
    }
}
