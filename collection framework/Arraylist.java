import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

class Arraylist{
    public static void main(String[] args) {

        // since both the list are implemented through list class so we cann use all the methods with linkedlist also 

        // ArrayList<String> studentsName = new ArrayList<>();


        List<String> studentsName = new LinkedList<>();

        // size = n 
        //      = n + n/2 + 1
        studentsName.add("Rakesh");
        // System.out.println(studentsName);

        studentsName.add("Mohan");
        studentsName.add("Krishna"); 
        // System.out.println(studentsName);

        // add on index of ur choice 
        studentsName.add(2,"Prince");
        // System.out.println(studentsName);

        List<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(3);
        list.add(4);

        List<Integer> newList = new ArrayList<>();
        newList.add(54); // it will do this in O(1);
        newList.add(54);

        // addAll will add all elements to the list 

        list.addAll(newList);
        // System.out.println(list);

        // System.out.println(list.get(3));

        // remove will remove particular index value 
        list.remove(3);
        // System.out.println(list);

        // valueOf  will delete particular element 
        list.remove(Integer.valueOf(54));
        // System.out.println(list);

        // remove all element 
        // list.clear();


        System.out.println(list);

        // set will set new element to the list 

        list.set(2,40340);
        System.out.println(list);

        // to know whether the lement present in list use contains();

        // list.add(54);
        // System.out.println(list.contains(54));

        // list.size() gives us the size of the arraylist 
        // System.out.println(list);
        // System.out.println(list.size());


        //iterating list
        System.out.println("iterating elements");
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        // we can use foreach loop to iterate the list
        System.out.println("iterating elements through list"); 
        for(Integer e : list)
            System.out.print(e+" ");

        // another way to iterate our list is through iterator 
        // Iterator<Integer>it = list.iterator();
        // while(it.hasNext())
        //     System.out.print(it.next()+" ");

    }
}