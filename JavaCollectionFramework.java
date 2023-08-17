import java.util.*;

public class JavaCollectionFramework {
    public static void main(String[] args) {
        // Package
        // Interface
        // Class
        // Wrapper Class
        // Generics
        // Objects
        // Iterator
        // Collection
        // Arrays
        // Comparator

        // list + ArrayList --> ArrayList inherit all the properties of List
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(2, 25);
        System.out.println(list);

        // LinkedList
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(10);
        ll.add(20);
        ll.add(1, 15);
        System.out.println(ll);

        // Vector
        Vector<String> vector = new Vector<>();
        vector.add("20");
        vector.add("20");
        vector.add(1, "25");
        System.out.println("Vector = " + vector);
        vector.clear();
        System.out.println(vector);

        // Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(16);
        stack.push(10);
        stack.push(10);
        stack.push(15);
        System.out.println("Stack = " + stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());

        // Set --> it doesn't maintain ordering and it doesnot allow duplicate values
        // also
        // HashSet
        HashSet<Integer> set = new HashSet<>();
        set.add(16);
        set.add(15);
        set.add(10);
        set.add(10);
        set.add(5);
        System.out.println(set);

        // LinkedHashSet
        LinkedHashSet<Integer> llset = new LinkedHashSet<>();
        llset.add(2);
        llset.add(4);
        llset.add(4);
        llset.add(12);
        llset.add(6);
        System.out.println(llset);

        // TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(7);
        treeSet.add(11);
        treeSet.add(6);
        treeSet.add(6);
        System.out.println("TreeSet = " + treeSet);

        // Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.add(7);
        queue.add(12);
        queue.offer(10);
        System.out.println("Queue =" + queue);
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.peek());

        // ArrayDeque
        Deque<Integer> adq = new ArrayDeque<>();
        adq.offer(12);
        adq.offer(8);
        adq.addLast(125);
        adq.add(10);
        adq.offerLast(8);
        adq.addFirst(40);
        System.out.println("ArrayDeque =" + adq);
        System.out.println("ArrayDeque peek = " + adq.peek());
        System.out.println("ArrayDeque poll = " + adq.poll());
        System.out.println("ArrayDeque polllast = " + adq.pollLast());
        System.out.println("ArrayDeque =" + adq);
        System.out.println("ArrayDeque peekfirst = " + adq.peekFirst());
        System.out.println("ArrayDeque peeklast = " + adq.peekLast());

        // Priority Queue
        // PriorityQueue<Integer> pq = new PriorityQueue<>(); //--> priority queue is
        // created bydefault in min heap format.
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // --> its create the queue in max heap format
        pq.add(5);
        pq.add(2);
        pq.add(1);
        pq.add(3);
        pq.offer(3);
        System.out.println("Priority queue = " + pq);
        System.out.println("Priority queue peek = " + pq.peek());
        // pq.poll();
        System.out.println("Priority queue poll = " + pq.poll());
        System.out.println("Priority queue = " + pq);

        System.out.println("-----------------------------------------------");

        // HashMap
        HashMap<String, String> map = new HashMap<>();
        map.put("2", "two");
        map.put("1", "one");
        map.put("3", "three");
        System.out.println("HashMap = " + map);

        // TreeMap
        TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
        tmap.put(2, "two");
        tmap.put(1, "one");
        tmap.put(3, "three");
        System.out.println("TreeMap = " + tmap);
    }
}