//Pick an element from unsorted part and place it in the right pos in sorted part
public class InsertionSort {
    public static void insertionSort(int arr[]){

        for(int i=1; i<arr.length; i++){//for no of turns
            int curr = arr[i];
            int prev = i-1;
            //finding the correct pos to insert
            while(prev >=0 && arr[prev] > curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }

        //For printing array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,4,1,3,2};
        insertionSort(arr);
    }
}
