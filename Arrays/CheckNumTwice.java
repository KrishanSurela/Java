import java.util.Arrays;
public class CheckNumTwice {
    // brute force aproach
    public static boolean checkTwice(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]==numbers[j]){
                    return true;
                } 
            }
        }
        return false;
    }
    // optimize approach
    public static boolean checkTwiceAnotherMethod(int nums[]){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int numbers [] = {1,2,5,3,4,2};
        int nums[] ={5,6,8,7,8,4};
        System.out.println(checkTwice(numbers));
        System.out.println(checkTwiceAnotherMethod(nums));
    }
    
}
