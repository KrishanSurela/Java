public class nineteen {
    public static void main(String[] args) {
        int num1=-1,num2=4,d=6;
        for(int i=1;i<=10;i++){
            if(i%2==1){
                System.out.print(num1+" ");
                num1=num1-d;
            }else{
                System.out.print(num2+" ");
                num2=num2+d;
            }
        }
    }
}
