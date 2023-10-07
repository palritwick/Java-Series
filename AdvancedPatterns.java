public class AdvancedPatterns {
    public static void main(String[] args) {
        
        // 1.Butterfly Pattern 
        // int n = 4;
        // for(int i=0; i<n; i++){
        //     for(int j=0; j<i; j++){
        //         System.out.print("*");
        //     }
        //     int spaces = 2*(n-i);
        //     for(int j=0; j<spaces;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0; j<i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=n; i>=1; i--){
        //     for(int j=0; j<i; j++){
        //         System.out.print("*");
        //     }
        //     int spaces = 2*(n-i);
        //     for(int j=0; j<spaces;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0; j<i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        //}

        // 2.Solid Rombus
        // int n = 5;
        // for(int i=0; i<n; i++){
        //     for(int j=0;j<n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=n;j>=1;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // 3.Numbered pyramid
        int n = 5;
        for(int i=0; i<=n; i++){
            for(int j=0; j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }

        // 4. Palindrome pyramid
        // int n = 5;
        // for(int i=0; i<=n; i++){
        //     for(int j=1; j<=n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=i; j>=1; j--){
        //         System.out.print(j);
        //     }
        //     for(int j=2;j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // 5. Diamond pattern
        // int n=4;
        // for(int i=0; i<=n; i++){
        //     for(int j=0; j<n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0; j<i; j++){
        //         System.out.print("*");
        //     }
        //     for(int j=2; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(int i=n; i>=1; i--){
        //     for(int j=0; j<n-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=0; j<i; j++){
        //         System.out.print("*");
        //     }
        //     for(int j=2; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        
    }
}