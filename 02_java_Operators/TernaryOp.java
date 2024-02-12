import java.util.*;

public class TernaryOp {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Math m kitna number aaya tere likh chupchap :");
        int marksub1 = sc.nextInt();
        System.out.println("Ab English wala likh :");
        int marksub2 = sc.nextInt();
        System.out.println("Science ka bhi likh de yaar :");
        int marksub3 = sc.nextInt();
        System.out.println("Social science ko kon likhgo tero kako :");
        int marksub4 = sc.nextInt();
        System.out.println("Sankrit ka number likh de jyada soch mt :");
        int marksub5 = sc.nextInt();
        System.out.println("Ab konsi Subject bach ri s hmmmm.... Ha Hindi bach gi eska bhi likh de");
        int marksub6 = sc.nextInt();
        sc.close();
        int totalmarks = 600;
        int obtainedmarks= marksub1+marksub2+marksub3+marksub4+marksub5+marksub6;
        double percentage = (obtainedmarks/totalmarks)*100;
        
        String pass = (percentage >= 90) ? "Sabash mere sher " + percentage + " bna liyo" : 
        (percentage >= 75) ? "Aur padh Bhosdika Bs " + percentage + " hi bani s" : 
        (percentage >= 60) ? "majo na aayo " + percentage + " ki ummid na thi" : 
        (percentage >= 40) ? "Gaandu s ke padhyo ku konya " + percentage + " s ke gand taati howgi" : 
        "Chhorichod naam badnam krwa diyo mero fail hogo tu";

        System.out.println("Result: " + pass);
 

        // String type = ((number%2)==0)?"Even":"Odd";
        // System.out.println(type);
    }
}