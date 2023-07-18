import java.util.HashSet;

public class Recursion2 {
    public static void TowerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("Transfer " + n + " disk from " + src + " to " + dest);
            return;
        }

        // tranfer n-1 disks from src to helper
        TowerOfHanoi(n - 1, src, dest, helper);

        // print transfer nth disk from src to dest
        System.out.println("Transfer " + n + " disk from " + src + " to " + dest);

        // transfer n-1 disks from helper to dest with the help of src as a helper
        TowerOfHanoi(n - 1, helper, src, dest);
    }

    public static String revString(String str) {
        if (str.length() == 1) {
            return str;
        }

        char currChar = str.charAt(0);
        String revStr = revString(str.substring(1));
        return revStr + currChar;
    }

    public static int first = -1;
    public static int last = -1;

    public static void occurrence(String str, char el, int idx) {
        if (idx == str.length()) {
            return;
        }

        if (str.charAt(idx) == el) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        occurrence(str, el, idx + 1);
    }

    public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (!isSorted(arr, idx + 1)) {
            return false;
        }
        return arr[idx] < arr[idx + 1];
    }

    public static void moveAllX(String str, int idx, int count, String newStr) {
        if (idx == str.length()) {
            for (int i = 0; i < count; i++) {
                newStr += 'x';
            }
            System.out.println(newStr);
            return;
        }

        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count++;
            moveAllX(str, idx + 1, count, newStr);
        } else {
            newStr += currChar;
            moveAllX(str, idx + 1, count, newStr);
        }
    }

    public static boolean[] map = new boolean[26];

    public static void removeDuplicates(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }

        char currChar = str.charAt(idx);
        if (map[currChar - 'a'] == true) {
            removeDuplicates(str, idx + 1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx + 1, newString);
        }
    }

    public static void subsequences(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        // to be
        subsequences(str, idx + 1, newString + currChar);

        // or not to be
        subsequences(str, idx + 1, newString);
    }

    public static void UniqueSubsequences(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            }
            set.add(newString);
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        // to be
        UniqueSubsequences(str, idx + 1, newString + currChar, set);

        // or not to be
        UniqueSubsequences(str, idx + 1, newString, set);
    }

    public static String keypad[] = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs",
            "tu", "vwx", "yz" };

    public static void printKeypadCombination(String number, int idx, String res) {
        if (idx == number.length()) {
            System.out.println(res);
            return;
        }
        for (int i = 0; i < keypad[number.charAt(idx) - '0'].length(); i++) {
            char curr = keypad[number.charAt(idx) - '0'].charAt(i);
            printKeypadCombination(number, idx + 1, res + curr);
        }
    }

    public static void main(String[] args) {
        // Q1. Tower of Hanoi - Transfer n disks from source to destination over 3
        // towers
        // int n = 4;
        // TowerOfHanoi(n, "S", "H", "D");

        // Q2. Print a string in reverse
        // String str = "ABCDE";
        // String revStr = revString(str);
        // System.out.println(revStr);

        // Q3. Find the occurrence of the first and last occurrence of an element using
        // recursion.
        // String str = "tabcdfghijakkk";
        // char el = 'a';
        // occurrence(str, el, 0);
        // System.out.println("First occurence : " + first);
        // System.out.println("Last occurence : " + last);

        // Q4. Check if an array is sorted (strictly increasing). - O(n)
        // int arr[] = {1,3,5,7,9};
        // System.out.println(isSorted(arr, 0));

        // Q5. Move all ‘x’ to the end of the string. - O(n)
        // String str = "axbcxxd";
        // moveAllX(str, 0, 0, "");

        // Q6. Remove duplicates in a string.
        // String str = "abbccda";
        // removeDuplicates(str, 0, "");

        // Q7. Print all the subsequences of a string
        // String str = "abc";
        // subsequences(str, 0, "");

        // Q8. Print all unique subsequences of a string.
        // String str = "aaa";
        // HashSet<String> set = new HashSet<>();
        // UniqueSubsequences(str, 0, "", set);

        // Q9. Print keypad combination
        // ( 0 -> .;
        // 1 -> abc
        // 2 -> def
        // 3 -> ghi
        // 4 -> jkl
        // 5 -> mno
        // 6 -> pqrs
        // 7 -> tu
        // 8 -> vwx
        // 9 -> yz )

        String number = "23";
        printKeypadCombination(number, 0, "");
    }
}
