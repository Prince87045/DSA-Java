//Print max and min subarray sum -Brute force method
//Time complexity - O(n³)
//Space complexity - O(1)
public class SubarraySum {
    public static void printSubarraySum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){//start
            for(int j=i; j<arr.length; j++){//end
                currSum = 0;
                for(int k=i; k<=j; k++){//from start to end
                    currSum += arr[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("Max subarray sum is "+maxSum);
    }
        public static void main(String[] args) {
            int arr[] = {2,4,6,8,10};
            printSubarraySum(arr);
    }
}
