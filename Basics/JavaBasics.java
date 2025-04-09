public class JavaBasics {

    public static int factorial(int n){
        if(n == 1 || n == 0 ){
            return 1;
        }
        return n*factorial(n-1);
    }

    //ncr=n!/r!*(n-r)!
    public static int binomialCoeff(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nminr_fact = factorial(n-r);

        return n_fact/((r_fact)*(nminr_fact));
    }
    public static void main(String[] args) {
        System.out.println(factorial(7));
        int result = binomialCoeff(10, 7);
        System.out.println(result);
    }   
}