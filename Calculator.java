import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("***** Calculate me! A calculator made by me *****\n");
        System.out.println("Press 1 for addition, 2 for substraction, 3 for multiplication, 4 for division and 5 for modulo operation..");
        int key = sc.nextInt();
        int sum = a+b;
        int diff = a-b;
        int mul = a*b;
        float div = a/b;
        int rem = a%b;

        switch (key) {
            case 1: System.out.println("Sum is = "+sum);
            break;
            case 2: System.out.println("Difference is = "+diff);
            break;
            case 3: System.out.println("Multiplication = "+mul);
            break;
            case 4: System.out.println(a+" divided by "+b+" is = "+div);
            break;
            case 5: System.out.println("The remainder after a%b is "+rem);
            break;
            default: System.out.println("Invalid option");
            break;
        }
    }
}
