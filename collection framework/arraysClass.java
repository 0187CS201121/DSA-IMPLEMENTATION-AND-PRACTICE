import java.util.Arrays;

public class arraysClass {
    
    public static void main(String[] args) {
        
        int[] numbers = {2,3,4,50,0,1,6,7,8,9,10};

        // it will returns index of the element present in the array 
        
        // int index = Arrays.binarySearch(numbers,5);

        // to sort the array we can use arrays.sort() method 
        Arrays.sort(numbers); // it uses quick sort to sort the elements

        // System.out.println(index);

        // to fill a particular value we can use following 
        Arrays.fill(numbers,0);

        for(int e:numbers)
            System.out.print(e + " ");
    }
}
