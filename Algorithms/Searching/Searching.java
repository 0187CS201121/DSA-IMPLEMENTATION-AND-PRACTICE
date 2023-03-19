class Searching{
    public static int iterativeBinarySearch(int[] arr,int key){
        // Time Complexity: O(log n)
        // Auxiliary Space: O(1)
       int start = 0, end = arr.length-1;
        
        int mid = start + (end-start)/2;
        while(start <= end){
            if(arr[mid] == key) return mid;
            else if(key > arr[mid]) start = mid+1;
            else  end = mid-1;
            
            mid = start + (end-start)/2;
        }
        return -1;
    }
    public static int recursiveBinarySearch(int[] arr, int start, int end, int key){
        if(end >= start){
            int mid = start + (end - start)/2;
            if(arr[mid]==key) return mid;
            else if(arr[mid] > key) return recursiveBinarySearch(arr, start, mid-1, key);
            else return recursiveBinarySearch(arr, mid+1, end, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        // System.out.println(iterativeBinarySearch(arr, 12));
        // int result = recursiveBinarySearch(arr, 0, arr.length-1, 6);
        // if(result == -1) System.out.println("element not present");
        // else System.out.println("element present");
        // System.out.println(result);
         
    }
}