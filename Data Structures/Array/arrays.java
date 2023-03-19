class arrays {

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo() {
        int[] myArray = new int[5];

        myArray[0] = 3;
        myArray[1] = 2;
        myArray[3] = 1;
        myArray[4] = 2;
        myArray[1] = 12;
        printArray(myArray);
        System.out.println(myArray.length);
        System.out.println(myArray[myArray.length - 1]);

        int[] arr = { 5, 4, 4, 3, 2, 1 };
        printArray(arr);
    }

    // remove even integer
    public static int[] removeEven(int[] arr) {
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0)
                oddCount++;
        }
        int[] resultArray = new int[oddCount];
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                resultArray[idx] = arr[i];
                idx++;
            }
        }
        return resultArray;
    }

    // reverse an array
    public static void reverseArr(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // find minimum
    public static int minimumInArr(int[] arr) {
        int minimum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minimum)
                minimum = arr[i];
        }
        return minimum;
    }

    // find second max
    public static int secondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
            }

        }
        return secondMax;
    }

    // move all zeroes to end;
    public static void moveZeroes(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[j] == 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0)
                j++;
        }
    }

    // Resizing an array
    public static int[] resizeAnArr(int[] arr, int capacity) {
        int[] temp = new int[capacity];
        for (int i = 0; i < arr.length; i++)
            temp[i] = arr[i];

        return temp;
    }
    //Given an array of n-1 distinct numbers in the range of 1 to n.find the missing number in it
    //find it in O(n);
    //The sum of first n natural number is n*(n+1)/2;
    public static int findMissingNo(int[] arr){
        int n = arr.length+1;
        int sum = n*(n+1)/2;
        for(int num : arr){
            sum = sum-num;
        }
        return sum;
    }
    public static void main(String[] args) {
        arrays objArr = new arrays();
        // arrs.arrayDemo();
        // int[] arr = { 0, 0, 0, 0 };
        // printArray(arr);
        // int[] result = removeEven(arr);
        // printArray(result);
        // reverseArr(arr, 0, arr.length-1);
        // printArray(arr);
        // System.out.println(minimumInArr(arr));
        // System.out.println(secondMax(arr));
        // moveZeroes(arr);
        // printArray(arr);
        // arr = resizeAnArr(arr, 10);
        // printArray(arr);
        // System.out.println(arr.length);
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int resultArray = findMissingNo(arr);
        System.out.println(resultArray);
    }
}