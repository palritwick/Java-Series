import java.util.*;
public class LL1 {
    public static void main(String[] args) {

        //1. Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). Search for the number 7 & display its index.
        
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.add(1, 5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);

        System.out.println(list);
        System.out.println(list.get(1));

        int el = 7;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == el) {
                System.out.println(el+" is found at index "+i);
            }
        }

        // reverse a linked list
        Collections.reverse(list);
        System.out.println(list);

        // 2. Take elements(numbers in the range of 1-50) of a Linked List as input from the user. Delete all nodes which have values greater than 25.
        // LinkedList<Integer> list = new LinkedList<>();
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();

    }
}
