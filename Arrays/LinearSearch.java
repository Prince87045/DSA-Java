//Find the index of element in a given array 
public class LinearSearch {
    public static int linSearch(int num[],int key){
        for(int i=0; i<num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1; //return -1 if key not found
    }
    public static void main(String[] args) {
        int num[] = {2,5,10,6,9};
        int key = 4;
        System.out.println(linSearch(num,key));
    }
}
