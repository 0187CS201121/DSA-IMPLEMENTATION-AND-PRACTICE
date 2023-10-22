import java.util.LinkedList;
import java.util.Queue;

public class queueAndLinkedList {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        
        // to add elements in queue we use offer() method 

        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        queue.offer(6);
        queue.offer(7);


        System.out.println(queue);

        // to remove the element from the frontend in the queue we use poll() method 
        System.out.println(queue.poll());

        System.out.println(queue);

        // to know next element that will be our polled element we use peek() method 
        System.out.println(queue.peek());
    }
}
