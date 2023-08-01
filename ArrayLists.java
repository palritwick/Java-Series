import java.util.*;
public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<String> list2 = new ArrayList<>();
        
        //add elements
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //to get an element
        int el = list.get(0);
        System.out.println(el);

        //add element in between
        list.add(1,5);
        System.out.println(list);

        //set element
        list.set(0,0);
        System.out.println(list);

        //remove/delete element
        list.remove(3);
        System.out.println(list);

        //calculate length or size of the list
        int size = list.size();
        System.out.println(size);

        //Loops on lists
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //Sorting the list
        Collections.sort(list);
        System.out.println(list);
    }
}
