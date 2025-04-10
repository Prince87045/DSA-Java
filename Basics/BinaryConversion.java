//Convert number from binary to decimal
//Decimal = Decimal + (Lastdigit * 2ⁿ)
public class BinaryConversion {
    public static int binToDec(int n){
        int decNo = 0;
        int pow = 0;
        while(n > 0){
            int lastDigit = n % 10;
            decNo += lastDigit * Math.pow(2,pow);
            pow++;
            n = n/10;
        }
        return decNo;
    }

    public static void main(String[] args) {
        System.out.println(binToDec(101)); //(101)₂ = 4+0+1 = (5)₁₀
        System.out.println(binToDec(1001));
    }
}
