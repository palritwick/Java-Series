import java.util.*;

public class JavaExcercise1 {

    public static void printAverage(float a, float b, float c) {
        float avg = (a + b + c) / 3;
        System.out.println("The average of 3 nos is " + avg);
    }

    public static void printOddNos(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println("The total sum is "+sum);
    }

    public static void greaterNo(int a, int b) {
        if (a > b) {
            System.out.println(a + " is greater");
        } else {
            System.out.println(b + " is greater");
        }
    }

    public static int printCircumference(int r) {
        int pi = 22 / 7;
        return 2 * pi * r;
    }

    public static long printPower(int x, int n) {
        // Initialize result by 1
        long pow = 1L;

        // Multiply x for n times
        for (int i = 0; i < n; i++) {
            pow = pow * x;
        }
        return pow;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. Enter 3 numbers from the user & make a function to print their average.
        // float a = sc.nextInt();
        // float b = sc.nextInt();
        // float c = sc.nextInt();
        // printAverage(a, b, c);

        // 2. Write a function to print the sum of all odd numbers from 1 to n.
        int n = sc.nextInt();
        printOddNos(n);

        // 3. Write a function which takes in 2 numbers and returns the greater of those two.
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // greaterNo(a, b);

        // 4. Write a function that takes in the radius as input and returns the circumference of a circle.
        int r = sc.nextInt();
        System.out.println("The circumference is "+printCircumference(r));

        // 6. Write an infinite loop using do while condition.
        // int c = 1;
        // do{
        // System.out.print(c+" ");
        // c++;
        // }while(c>=1);

        // 7. Write a program to enter the numbers till the user wants and at the end it
        // should display the count of positive, negative and zeros entered.

        // 8. Two numbers are entered by the user, x and n. Write a function to find the
        // value of one number raised to the power of another i.e 𝑥^n .
        // int x = sc.nextInt();
        // int n = sc.nextInt();
        // System.out.println(x +" power "+n+" is "+printPower(x, n));

    }
}
