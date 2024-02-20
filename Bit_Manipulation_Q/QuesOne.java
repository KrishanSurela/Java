package Bit_Manipulation_Q;
 

public class QuesOne {
    public static void swap(int i,int j){
         i =i^j;
         j =i^j;
         i =i^j;
        System.out.println("i : "+i);
        System.out.println("j : "+j);
    }
    public static void main(String[] args) {
         swap(5, 4);
    }
}
