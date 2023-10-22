import java.util.*;

public class hashSet {
    public static void main(String[] args) {
        
        // Set<Integer> set = new HashSet<>(); // all the oprations in this are in O(1)

        // Set<Integer> set = new LinkedHashSet<>(); // in this hashset the order of set's element is preserve

        // Set<Integer> set = new TreeSet<>(); // it implements hashset properties along with the sorted order preserved // all the operation in this are in O(logn); becaus of binary search tree;


        // in hashSet the order is not defined as well as repitation is not allowed;
        
        // set.add(3);
        // set.add(1);
        // set.add(6);
        // set.add(67);
        // set.add(3);
        // set.add(1);
        // set.add(6);
        // set.add(67);

        // to remove elements 

        // set.remove(4);

        // System.out.println(set);

        // // to know whether the element is present inside the set use .contains() method 
        // System.out.println(set.contains(5));

        // // to know whether the set isEmpty() method we use 
        // System.out.println(set.isEmpty());

        // // to know the size of the set use set.size() method 
        // System.out.println(set.size());

        // set.clear(); // to clear all the elements from the hashset

        // System.out.println(set);

        Set<Student> studentSet = new HashSet<>();
        studentSet.add(new Student("Mohan",3));
        studentSet.add(new Student("Krishna",3 ));
        studentSet.add(new Student("Gopal",23));
        studentSet.add(new Student("Krishna",3 ));

        System.out.println(studentSet);
    }
}
