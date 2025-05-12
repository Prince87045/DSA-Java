//Bubble Sort TC - O(n²)
public class BubbleSort {
    public static void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-2; i++){//for number of turns
            for(int j=0; j<n-i-1; j++){//inner loop for compairing
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //For printing array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,2,6,3};
        bubbleSort(arr);
    }
}
