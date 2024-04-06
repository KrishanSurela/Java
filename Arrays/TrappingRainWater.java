class TrappingRainWater{
    public static int trappedRainwater(int height[]){ //O(n)
        int n = height.length;
        //calculate left max boundary - array ki form me
        int leftMax[]=new int[n];
        leftMax[0] = height[0];

        for(int i=1;i<n;i++){
            leftMax[i] = Math.max(height[i],leftMax[i-1]);
        }
        //calcualte right max boundary = array ki form me
        int rightMax[]=new int[n];
        rightMax[n-1] = height[n-1];

        for(int i=n-2;i>=0;i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }
        // loop => Jis bhi bar pr mai hu uska rain water kitna aayega
        int trappedWater=0;
        for(int i=0 ; i<n;i++){ 
        // waterlevel =min(left max bound,rightmax bound) 
           int  waterlevel = Math.min(leftMax[i],rightMax[i]); 
        // trapped water = waterlevel -height[i]
           trappedWater = trappedWater+waterlevel-height[i];
        }
        return trappedWater;

    }
    public static void main(String[] args) {
        //int height[] = {4,2,0,3,2,5};
        int height[] = {6,8,5,10,3,5,99,15};
        int trappedwater =trappedRainwater(height);
        System.out.println("Trapped Water is : "+trappedwater); 
    }
}