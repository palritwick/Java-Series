import java.util.*;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int age = sc.nextInt();

        // if (age>18) {
        // System.out.println("Adult");
        // } else {
        // System.out.println("Not Adult");
        // }

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if (a == b) {
        //     System.out.println("Equal");
        // } else if (a > b) {
        //     System.out.println("a is greater");
        // } else {
        //     System.out.println("a is lesser");
        // }

        int x = sc.nextInt();
        switch (x) {
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjour"); 
            break;
            default: System.out.println("Invalid");
            break;
        }
    }
}
