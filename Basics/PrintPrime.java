//Print all prime number in given range
public class PrintPrime {
    public static void printPrime(int n){
        for(int i=2; i<n; i++){
            if(Prime.checkPrime(i)){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        printPrime(100);
    }
}
