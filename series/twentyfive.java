public class twentyfive {
    public static void main(String[] args) {
        // 0 2 8 14 24 34 
        for(int i=1;i<=7;i++){
            if(i%2==0){
                System.out.print((int)Math.pow(i, 2)-2+" ");
            }else{
                System.out.print((int)Math.pow(i, 2)-1+" ");
            }
        }
    }
}
