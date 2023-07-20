import java.util.*;

public class Recursion3 {
    public static void printPermutations(String str, String perm) {
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newstr = str.substring(0, i) + str.substring(i + 1);
            printPermutations(newstr, perm + currChar);
        }
    }

    public static int countPathMaze(int i, int j, int n, int m) {
        if (i == n || j == m) {
            return 0;
        }
        if (i == n - 1 && j == m - 1) {
            return 1;
        }
        // move downwards
        int moveDown = countPathMaze(i + 1, j, n, m);
        // move rightwards
        int moveRight = countPathMaze(i, j + 1, n, m);

        return moveDown + moveRight;
    }

    public static int placeTiles(int n, int m) {
        if (n < m) {
            return 1;
        } else if (n == m) {
            return 2;
        }

        // horizontal placement
        int hr = placeTiles(n - 1, m);
        // vertical placement
        int vr = placeTiles(n - m, m);

        return hr + vr;
    }

    public static int callFriend(int n) {
        if (n <= 1) {
            return 1;
        }
        int ways1 = callFriend(n - 1);
        int ways2 = (n - 1) * callFriend(n - 2);

        return ways1 + ways2;
    }

    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0; i<subset.size(); i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findSubsets(int n, ArrayList<Integer> subset) {

        if(n == 0){
            printSubset(subset);
            return;
        }

        // add hoga
        subset.add(n);
        findSubsets(n - 1, subset);
        // add nahi hoga
        subset.remove(subset.size() - 1);
        findSubsets(n - 1, subset);

    }

    public static void main(String[] args) {
        // Q1. Print all the permutations of a string - "abc"
        // String str = "abc";
        // printPermutations(str, "");

        // Q2. CountPathMaze (0,0) to (3,3)
        // int n = 3, m = 3;
        // int total = countPathMaze(0, 0, n, m);
        // System.out.println(total);

        // Q3. Tiling problem - Given (1 x m) tiles to fit in (n x m) dimention
        // int n = 4, m= 2;
        // int total= placeTiles(n, m);
        // System.out.println(total);

        // Q4. Friends pairing problem
        // int n = 4;
        // System.out.println(callFriend(n));

        // Q5. Subsets of a set of first n natural numbers
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }
}
