//Calculate the sum of diagonal of 2D array
public class DiagonalSum {

    //Brute force approach O(n^2)
    public static int diagonalsum(int arr[][]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(i == j){
                    sum += arr[i][j];
                } else if(i+j == arr.length-1){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    //Optimised Approach
    public static int sum(int arr[][]){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            //pd
            sum += arr[i][i];
            //sd
            if(i != arr.length-1-i)  // to remove the overlapping condition sum
                sum += arr[i][arr.length-1-i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(diagonalsum(arr));

        int matrix[][] = {{0,1,2,3},{3,4,5},{6,7,8}};
        System.out.println(sum(matrix));
    }
}
