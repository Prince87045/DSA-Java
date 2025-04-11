//Reverse the given array
// SC - O(1) , TC - O(n)
public class ReverseArray {
    public static void revArray(int num[]){
        int first = 0;
        int last = num.length-1;
        //swapping
        while(first <= last){
            int temp = num[first];
            num[first] = num[last];
            num[last] = temp;
            first++;
            last--;
        }
    }
        public static void printArray(int num[]){
            for(int i=0; i<num.length; i++){
                System.out.print(num[i]+" ");
            }
        }
    public static void main(String[] args) {
        int num[] = {1,8,5,7,9};
        revArray(num);
        printArray(num);
    }
}
