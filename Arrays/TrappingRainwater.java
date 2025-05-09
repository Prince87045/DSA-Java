public class TrappingRainwater {
    public static int trappedWater(int height[]){
        int width = 1;
        int n = height.length;
        
        if(n == 1 || n == 2){
            return 0;
        }

        //calculate left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];

        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        //calculate right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];

        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i],rightMax[i+1]);
        }

        int trappedWater = 0;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(leftMax[i],rightMax[i]);
            trappedWater += (waterLevel - height[i]) * width;
        }
        return trappedWater;
    }
    public static void main(String[] args) {
        int ht[] = {4,2,0,6,3,2,5};
        System.out.println(trappedWater(ht));
    }
}
