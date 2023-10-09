// word -> btwi
// reply -> wjuqd
import java.util.Scanner;
class Encryption{
    public static void main(String[] args) {
        Scanner s = new Scanner( System.in);
        System.out.print("Enter the plain text : ");
        String str = s.next();
        String res = "";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)<'u')
                res = res+(char)(str.charAt(i)+5);
            else
                res = res+(char)(str.charAt(i)-'v'+'a');
        }
        System.out.println("Your cipher text is : "+res);
    }
}