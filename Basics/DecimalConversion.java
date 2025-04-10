//Convert from decimal to binary number
public class DecimalConversion {
    public static int decToBinary(int n){
        int binary = 0;
        int pow = 0;
        while(n>0){
            int rem = n % 2;
            n = n/2;
            binary += Math.pow(10, pow) * rem;
            pow++;
        }
        return binary;
    }
    public static void main(String[] args) {
        System.out.println(decToBinary(50)); //(7)₁₀=4+2+1=(111)₂
    }
}
