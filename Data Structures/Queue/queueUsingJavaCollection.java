import java.util.*;
public class queueUsingJavaCollection {
    public static void main(String[] args) {

        // Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q = new ArrayDeque<>();// this is double ended queue;
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q);
    }
    
}
