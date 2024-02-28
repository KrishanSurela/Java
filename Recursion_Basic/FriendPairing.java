package Recursion_Basic;

public class FriendPairing {
    public static int friendPairing(int n){
        //base case
        if(n==0 || n==1){
            return n;
        }
        // kaam
        int fnm1 = friendPairing(n-1);
        int fnm2 = friendPairing(n-2);
        int pairs = fnm2*(n-1);

        return pairs+fnm1;
    }
    public static void main(String [] arg){
       System.out.println(friendPairing(1));
    }
}
