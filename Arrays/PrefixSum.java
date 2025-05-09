//Calculate the max subarray sum (Prefix Sum)
//SC - O(n) , TC - O(n²)
public class PrefixSum {
    public static int maxSum(int arr[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for(int i=1; i<prefix.length; i++){//start
            for(int j=i; j<arr.length; j++){//end
                prefix[j] = currSum + prefix[i-1];
            }
            if(prefix[i] > maxSum){
                maxSum = prefix[i];
            }
        }
        return maxSum;

    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        System.out.println(maxSum(arr));
    }
}
