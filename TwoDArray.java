import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns..");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int matric[][] = new int[rows][cols];
        //Input
        System.out.println("Entering matric elements..");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                matric[i][j]=sc.nextInt();
            }
        }
        // Output 
        // System.out.println("Showing output...");
        // for(int i=0; i<rows; i++){
        //     for(int j=0; j<cols; j++){
        //         System.out.print(matric[i][j]+" ");
        //     }
        //     System.out.println();
        // }
        System.out.println("Enter the key...");
        int x = sc.nextInt();

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                if(matric[i][j] == x){
                    System.out.println("Element found at location ( "+i+", "+j+" )");
                }
            }
        }
    }
}
