class sorting {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        /*
         * So basically bubbleSort takes the biggest element and put it to the last in
         * the array.
         */
        int i = 0, j = 0, temp = 0;
        for (i = 0; i < arr.length - 1; i++) // n-1
            for (j = 0; j < arr.length - i - 1; j++)
                // Swapping
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

    }

    public static void selectionSort(int[] arr) {
        /*
         * Selection sort selects the element and put that element to its currect
         * possition in the array
         */
        int i = 0, j = 0, temp = 0, smallest = 0;
        for (; i < arr.length - 1; i++) {
            smallest = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j])
                    smallest = j;
            }
            temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;

        }
    }

    public static void insertionSort(int[] arr) {
        /*
         * Insertion sort divide the array in two part from one part it takes the
         * element and put it
         * in second part until it get sorted.
         */
        int i = 0, j = 0, current = 0;
        for (i = 1; i < arr.length; i++) {
            current = arr[i];
            j = i - 1;
            while (j >= 0 && current < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = -1;
        for (int j = 0; j < high; j++)
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);

            quickSort(arr, low, pidx - 1);
            quickSort(arr, pidx + 1, high);
        }
        // TIME COMPLEXITY :WORST CASE O(N^2);
        // AVERAGE CASE: O(nlogn);

    }

    public static void mergeSort(int[] arr,int start, int end){
        if(start < end) {
            int mid = start + (end - start)/2;
            
            mergeSort(arr, start, mid);
            mergeSort(arr, mid+1, end);
            merge(arr,start,mid,end);
        }
    }
    public static void merge(int[] arr, int start, int mid, int end){
        int p = start, q = mid+1;
        int[] newArr = new int[end-start+1];
        int k = 0;
        for(int i = 0; i<=end; i++){
            if(p>mid) newArr[k++] = arr[q++]; // will checkt first part to end
            else if(q>end) newArr[k++] = arr[p++]; // check whether second part come to end;
            else if(arr[p]<arr[q]) newArr[k++] = arr[p++]; //compare which part has smaller element;
            else newArr[k++] = arr[q++];
        }
        // System.arraycopy(newArr, 0, arr, start, end);
        for(int j = 0; j<k; j++)
            arr[start++] = newArr[j];
    }

    public static void main(String[] args) {
        int[] arr = { -8, -7, -5, 4, 3, 2, 1 };
        // bubbleSort(arr);
        // selectionSort(arr);
        // insertionSort(arr);
        // quickSort(arr, 0, arr.length - 1);
        // printArray(arr);
        mergeSort(arr, 0, arr.length-1);

    }
}