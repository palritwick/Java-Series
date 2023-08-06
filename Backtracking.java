public class Backtracking {
    public static void permutations(String str, String perm, int idx) {

        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permutations(newStr, perm+currChar, idx + 1);
        }
    }

    public static void main(String[] args) {
        // print all posssible permutations of a string
        String str = "ABC";
        permutations(str, "", 0);
    }
}
