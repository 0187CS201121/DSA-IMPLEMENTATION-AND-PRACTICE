import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorityQueue {
    public static void main(String[] args) {
        
        // PriorityQueue<Integer> pq = new PriorityQueue<>
        // (Comparator.reverseOrder());

        // priorityQueue implements queue so we can write queue also in place of priorityQueue

        Queue<Integer> pq = new PriorityQueue<>
        (Comparator.reverseOrder());

        // priorityQueue by default use minheap in its internal part thats by when we see it prints minimum elemet in first place 

        // but by useing Comparator.reverseOrder() we change it maxheap 

        // same methods can be used which we used in Queue 

        pq.offer(15);
        pq.offer(6);
        pq.offer(71);
        pq.offer(8);
        pq.offer(92);

        System.out.println(pq);

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());

    }
}
