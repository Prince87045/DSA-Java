public class SelectionSort {
    public static void selectionSort(int arr[]){
        for(int i=0; i<arr.length; i++){//for no of turns
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){//compairing for unsorted array
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        //For printing array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    } 
    public static void main(String[] args) {
        int arr[] = {6,5,2,4,7};
        selectionSort(arr);
    }
}
