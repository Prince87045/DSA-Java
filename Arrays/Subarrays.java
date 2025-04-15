//Print subarray(continuous part of array)
public class Subarrays {
    public static void printSubarray(int arr[]){
        int ts = 0; //total subarrays
        for(int i=0; i<arr.length; i++){//start
            for(int j=i; j<arr.length; j++){//end
                for(int k=i; k<j; k++){
                    System.out.print(arr[k]+ " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays are "+ts);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printSubarray(arr);
    }
}
