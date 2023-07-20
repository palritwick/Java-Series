import java.util.*;

public class Functions {

    // public static int calculateSum(int a, int b){
    //     int sum = a+b;
    //     return sum;
    // }

    public static void printFactorial(int n){

        if (n < 0) {
            System.out.println("Invalid Number");
            return;
        }
        else if(n == 0 || n== 1){
            System.out.println("The factorial is 1");
            return;
        }

        int fact = 1;
        for(int i=n; i>=1; i--){
            fact = fact*i;
        }
        System.out.println("The factorial of "+n+" is "+fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = calculateSum(a, b);
        // System.out.println("Sum of the two number is "+sum);

        int n = sc.nextInt();
        printFactorial(n);

    }
}