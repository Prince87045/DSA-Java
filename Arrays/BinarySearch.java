//Find the index of element in a given array
//prerequisite - sorted array
public class BinarySearch {
    public static int binSearch(int num[],int key){
        int strIdx = 0;
        int endIdx = num.length-1;
        while(strIdx <= endIdx){
            int mid = (strIdx + endIdx)/2;
            if(key == num[mid]){ //key found
                return mid;
            } else if(key < num[mid]){ //left
                endIdx = mid-1;
            }else { //right
                strIdx = mid+1;
            }
        }
        return -1; //return -1 if key not found
    }
    public static void main(String[] args) {
        int num[] = {2,5,6,8,9};
        int key = 9;
        System.out.println(binSearch(num, key));
    }
}
