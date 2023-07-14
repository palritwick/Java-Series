public class Patterns {
    public static void main(String[] args) {

        // 1.solid rectangle
        // int n = 4;
        // int m = 5;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 2.hollow rectangle
        // int n = 5;
        // int m = 4;
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= m; j++) {
        // if (i == 1 || j == 1 || i == n || j == m) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // 3.half pyramid
        // int n = 5;
        // for(int i=0; i<n; i++){
        // for(int j=0; j<i; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 4.inverted half pyramid
        // int n = 5;
        // for(int i=n; i>=1; i--){
        // for(int j=1; j<i; j++){
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 5. half pyramid(right align)
        // int n = 4;
        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j < i; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 0; j <= n - i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 6. Numbered half pyramid
        // int n = 5;
        // for(int i=1; i<=n; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print(j+" ");
        // }
        // System.out.println();
        // }

        // 7. Inverted numbered half pyramid
        // for(int i=n; i>=1; i--){
        // for(int j=1; j<=i; j++){
        // System.out.print(j+" ");
        // }
        // System.out.println();
        // }

        // 8.
        // int n = 5;
        // int number = 1;
        // for(int i=0; i<=n; i++){
        // for(int j=1; j<=i; j++){
        // System.out.print(number+" ");
        // number++;
        // }
        // System.out.println();
        // }

        // 9. Binary half pyramid
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }
}
