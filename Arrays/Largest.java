//Find the largest in a given array
public class Largest {
    public static int findLargest(int num[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<num.length; i++){
            if(num[i] > largest){
                largest = num[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int num[] = {1,2,6,3,15};
        System.out.println(findLargest(num));
    }
}
