import java.util.*;

public class Strings {
    public static void main(String[] args) {
        // String s = "Tony";
        // Scanner sc = new Scanner(System.in);
        // String name = sc.nextLine();
        // System.out.println("Your name is "+name);

        // concatenation
        // String firstName = "Ritwick";
        // String lastName = "Pal";
        // String fullName = firstName+" "+lastName;
        // System.out.println(fullName);
        // System.out.println(fullName.length());
        // // System.out.println(fullName.charAt(0));

        // for(int i=0; i<fullName.length(); i++){
        // System.out.print(fullName.charAt(i) + " ");
        // }

        // string compare
        // String name1 = "Tony";
        // String name2 = "Tony";

        // if (name1.equals(name2)) {
        // System.out.println("They are the same string");
        // } else {
        // System.out.println("They are different strings");
        // }

        // // DO NOT USE == to check for string equality
        // // Gives correct answer here
        // if (name1 == name2) {
        // System.out.println("They are the same string");
        // } else {
        // System.out.println("They are different strings");
        // }

        // // Gives incorrect answer here
        // if (new String("Tony") == new String("Tony")) {
        // System.out.println("They are the same string");
        // } else {
        // System.out.println("They are different strings");
        // }

        // String name = "RitwickPal";
        // System.out.println(name.substring(0, 5));

        // String str = "123";
        // int number = Integer.parseInt(str); // string to integer conversion
        // System.out.println(number);

        // int number = 123;
        // String str = Integer.toString(number);
        // System.out.println(str);
        // System.out.println(str.length());

        // 1. Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
        
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];
        int totLength = 0;
        for (int i = 0; i < size; i++) {
            array[i] = sc.next();
            totLength += array[i].length();
        }
        System.out.println(totLength);
    }
}
