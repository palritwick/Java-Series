public class stringBuilder {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("hello");
        // sb.append("Brother");
        // System.out.println(sb);
        // System.out.println(sb.length());
        // System.out.println(sb.charAt(0));
        // // System.out.println(sb.setCharAt(0, "H"));
     
        // sb.delete(2, 4);
        // System.out.println(sb);

        //Quiz : Reverse a string 
        StringBuilder sb = new StringBuilder("hello");
        for(int i=0; i<sb.length()/2; i++){
            int front = i;
            int back = sb.length()- 1-i;
            char frontChar = sb.charAt(front);
            char backChar = sb.charAt(back);

            sb.setCharAt(back, frontChar);
            sb.setCharAt(front, backChar);
        }
        System.out.println(sb);
    }
}
