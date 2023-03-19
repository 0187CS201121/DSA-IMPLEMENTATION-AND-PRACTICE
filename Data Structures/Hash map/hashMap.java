/*Few important features of HashMap are: 

HashMap is a part of java.util package.
HashMap extends an abstract class AbstractMap which also provides an incomplete implementation of Map interface.
It also implements Cloneable and Serializable interface. K and V in the above definition represent Key and Value respectively.
HashMap doesn’t allow duplicate keys but allows duplicate values. That means A single key can’t contain more than 1 value but more than 1 key can contain a single value.
HashMap allows null key also but only once and multiple null values.
This class makes no guarantees as to the order of the map; in particular, it does not guarantee that the order will remain constant over time. It is roughly similar to HashTable but is unsynchronized.
 */
import java.util.*;
// import java.util.HashMap;
// import java.util.Map;
// import java.util.Set;
class hashMap{
    public static void main(String[] args) {
        HashMap<String, Integer> population = new HashMap<>();
       
        //1.Insertion Operation

        population.put("India",140);
        population.put("Pakistan",28);
        population.put("America",null);
        population.put("argentina",40);

        
        //2. Changing elements

        // population.put("America",38);
        // System.out.println(population);

        /* HashMap(Map map): It creates an instance of HashMap with the same mappings as the specified map.

        HashMap<K, V> hm = new HashMap<K, V>(Map map);
        */
        // HashMap<String, Integer> crowd = new HashMap<>(population);
        // System.out.println(crowd);

        // contains key
        // if(population.containsKey("India"))
        //     System.out.println("Jai Hind");
        // else System.out.println("Not present");

        //get();
        // System.out.println(population.get("Pakistan"));

        //3. Removing elements
        // population.remove("Pakistan");
        // System.out.println(population);

        //4. Traversal
        // for(Map.Entry<String,Integer> e : population.entrySet())
        //     System.out.println("Key : " + e.getKey() + " Value : "+ e.getValue());


        //5. another way of traversal using keySet;
        Set<String> keys = population.keySet();
        for(String s : keys)
            System.out.println(s+" "+ population.get(s));
    }
}