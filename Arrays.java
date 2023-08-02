import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // 1st way of creating an array --> first declaration & then initialization then print
        // int [] marks = new int[3];
        // marks[0] = 97;
        // marks[1] = 93;
        // marks[2] = 94;

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);

        // 2nd way of creating an array --> declaration & initialization at the same line
        // int marks[] = {92,90,87};
        // for(int i=0; i<marks.length; i++){
        //     System.out.println(marks[i]);
        // } 

        // Taking an array as an input and printing its elements
        Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int numbers[] = new int[size];
        
        // System.out.println("Taking Inputs...");
        // for(int i=0; i<size; i++){
        //     numbers[i] = sc.nextInt();
        // }

        // System.out.println("Printing the array elements");
        // for(int i=0; i<size; i++){
        //     System.out.println(numbers[i]);
        // }

        // Homework Problems
        // 1. Take an array of names as input from the user and print them on the screen.
        // 2. Find the maximum & minimum number in an array of integers
        // 3. Take an array of numbers as input and check if it is an array sorted in ascending order.
        // Eg : { 1, 2, 4, 7 } is sorted in ascending order.
            // {3, 4, 6, 2} is not sorted in ascending order
    }
}
