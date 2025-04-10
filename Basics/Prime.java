//Check whether number is prime or not
public class Prime {

    //Method 1
    //Only for n>=2
    public static boolean checkPrime(int num){
        //Corner Case
        if(num == 2){
            return true;
        }

        for(int i=2; i<num; i++){
            if(num%i == 0){ //completely divided - Composite
                return false;
            }
        }
        return true;
    }

    //Method 2 - Optimised
    public static boolean isPrime(int num){
        for(int i=2; i<=Math.sqrt(num); i++){
            if(num%i == 0){ //completely divided - Composite
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkPrime(5));
        System.out.println(checkPrime(4));
        System.out.println(isPrime(13));       
    }
}
