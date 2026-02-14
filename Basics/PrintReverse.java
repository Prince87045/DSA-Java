import java.util.Scanner;

public class PrintReverse {
    public static void printReverse(int n){
        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n = n/10;
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printReverse(n);
        sc.close();
    }
}
