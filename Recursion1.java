import java.util.Scanner;

public class Recursion1 {
    public static void printNum(int n){
        if (n == 0) {
            return;
        }
        System.out.print(n+" ");
        printNum(n-1);
    }
    public static int printSum(int n){
        if (n == 0) {
            return 0;
        }
        int sum = 0;
        sum = n + printSum(n-1);
        return sum;
    }
    public static int printFact(int n){
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact = 1;
        fact = n * printFact(n-1);
        return fact;
    }
    public static void printFib(int a, int b, int n){
        if (n == 0) {
            return;
        }
        System.out.print(a+" ");
        // System.out.println(b);
        printFib(b,a+b,n-1);
    }
    public static int printPower(int x, int n){
        if (x == 0) {
            return 0;
        }
        if (n == 1) {
            return x;
        }
        int xPnm1 = printPower(x, n-1);
        int xPn = x*xPnm1;
        return xPn;
    }
    public static int printPow(int x, int n){
        if (n == 0) {
            return 1;
        }
        if(n %2 == 0){ //n is even
            return printPow(x, n/2) * printPow(x, n/2);
        }else{ // n is odd
            return printPow(x, n/2) * printPow(x, n/2) * x;
        }
    }
    public static void main(String[] args) {
        // Q1. Print numbers from 5 to 1.
        // int n =5;
        // printNum(n);

        // Q3. Print the sum of first n natural numbers.
        // System.out.println("Enter the value of n : ");
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // int ans = printSum(n);
        // System.out.println("Sum of first "+n+" natural numbers is "+ans);

        // Q4. Print factorial of a number n.
        int m = 5;
        // int fact = printFact(m);
        // System.out.println("Factorial of "+m+" is "+fact);

        // Q5. Print the fibonacci sequence till nth term.
        // printFib(0,1,8);

        // Q6. Print x^n (with stack height = n)
        // int power = printPower(2,5);
        // System.out.println("Answer: "+power);

        // Q7. Print x^n (with stack height = logn)
        int x = sc.nextInt();
        int n = sc.nextInt();
        int output = printPow(x,n);
        System.out.println(output);
    }
}
