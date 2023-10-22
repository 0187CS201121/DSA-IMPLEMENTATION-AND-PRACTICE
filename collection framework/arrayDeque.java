import java.util.ArrayDeque;

public class arrayDeque {
    
    public static void main(String[] args) {
        
        // by using arraydeque  we are able to insert or remove the element from both the ends

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(1);
        adq.offer(5);
        adq.offer(3);
        adq.offerFirst(23);
        adq.offerLast(43);

        System.out.println(adq);

        System.out.println(adq.peekFirst());
        
        System.out.println(adq.peekLast());

        System.out.println(adq.pollFirst());

        System.out.println(adq.pollLast());

        System.out.println(adq);
    }
}
