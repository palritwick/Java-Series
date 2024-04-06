public class valid_palindrome_string {
    static boolean checkPalindrome(String s) {
        s = s.replaceAll("[^0-9A-Za-z]", "");
        s = s.toLowerCase();
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) == s.charAt(n - 1 - i))
                continue;
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String strParam = "A man, a plan, a canal: Panama";
        System.out.println(checkPalindrome(strParam));
    }
}
/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.
 */