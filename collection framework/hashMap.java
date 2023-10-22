import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class hashMap {
    public static void main(String[] args) {
        // Map<String, Integer> numbers = new HashMap<>();

        // in hashmap order is not preserved

        // but in treeMap order is sorted order
        Map<String, Integer> numbers = new TreeMap<>();

        numbers.put("C", 1);
        // numbers.put("two",2);

        numbers.put("A", 3);
        numbers.put("G", 4);

        // if(!numbers.containsKey("two"))
        // numbers.put("two",24);

        numbers.putIfAbsent("B", 24); // will work same as above if condition works

        // to remove any key or value use remve() method 
        numbers.remove("C");

        System.out.println(numbers);

        // to know whther the value present inside the hashmap use contains value

        System.out.println(numbers.containsValue(4));

        System.out.println(numbers.isEmpty());

        // iterating hashMap
        // for(Map.Entry<String,Integer> e: numbers.entrySet()){
        // System.out.println(e);
        // System.out.println(e.getKey());
        // System.out.println(e.getValue());
        // }

        // we can iterate for keys and values as below
        // for(String key: numbers.keySet())
        // System.out.println(key);

        // for(Integer value : numbers.values())
        // System.out.println(value);
    }
}
