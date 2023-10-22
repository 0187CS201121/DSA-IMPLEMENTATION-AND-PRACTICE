import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class collectionsClass {
    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(22);
        list.add(24);
        list.add(25);
        list.add(25);
        list.add(26);
        list.add(27);

        // to know min max and frequency 
        System.out.println(Collections.min(list));
        System.out.println(Collections.max(list));
        System.out.println(Collections.frequency(list,25));

        Collections.sort(list);

        System.out.println(list);
        Collections.sort(list, Comparator.reverseOrder()); // to get elements in reverse order
        System.out.println(list);

    }
}
