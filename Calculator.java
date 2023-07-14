import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integer values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Calculate me! A calculator made by me..");
        System.out.println("Press 1 for addition, 2 for substraction, 3 for multiplication, 4 for division and 5 for modulo operation\n");
        int key = sc.nextInt();
        int sum = a+b;
        int diff = a-b;
        int mul = a*b;
        float div = a/b;
        int rem = a%b;

        switch (key) {
            case 1: System.out.println("sum is = "+sum);
            break;
            case 2: System.out.println("difference is = "+diff);
            break;
            case 3: System.out.println("multiplication = "+mul);
            break;
            case 4: System.out.println("division of two "+div);
            break;
            case 5: System.out.println("The remainder is "+rem);
            break;
            default: System.out.println("Invalid option");
            break;
        }
    }
}
