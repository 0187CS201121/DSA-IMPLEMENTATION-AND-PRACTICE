import java.util.ArrayList;
import java.util.Arrays;

import javax.xml.transform.Source;

public class recursion_by_kunal {

    // 1
    static int fibo(int n){
        if(n<2) return n;

        return fibo(n-1) + fibo(n-2);
    }

    static void printNto1(int n){
        if(n==0) return;

        System.out.println(n);
        printNto1(n-1);
        System.out.println(n);


    }

    static int factorial(int n){
        if(n <=1) return 1;
        return n * factorial(n-1);
    }

    // Binary Search using recursion
    static int search(int[] arr,int target,int s,int e){
        if(s > e) return -1;
        int mid = s + (e-s)/2;
        if(arr[mid] == target) return mid;
        else if(target < arr[mid])
            return search(arr, target, s, mid-1);
        else return search(arr, target, mid+1, e);
    }

    // digit sum using recursion
    static int digitSum(int n){
        if(n==0) return 0;

        return (n%10)+digitSum(n/10);
    }

    // digit product using recursion
    static int digitProduct(int n){
        if(n%10==n) return n;

        return (n%10) * digitProduct(n/10);
    }

    // concept
    static void printNTo1(int n){
        if(n==0) return;
        System.out.println(n);
        // printNTo1(n--); // will be stack overflow;
        printNTo1(--n); // it won't give stack overflow;
    }
    // static int sum = 0;
    // static void reverseNumber(int n){
    //     if(n == 0) return;
    //     int remainder = n%10;
    //     sum = sum*10+remainder;
    //     reverseNumber(n/10);
    // }
    static int reverse2(int n){
        int digits = (int)(Math.log10(n)) + 1;
        return helper(n,digits);
    }
    private static int helper(int n, int digits){
        if(n%10 == n) return n;
        int remainder = n%10;
        return remainder *(int)Math.pow(10,digits-1) + helper(n/10,digits-1);
    }
    static boolean palindrome(int n){
        return n==reverse2(n)?true:false;
    }

    public static int countZero(int n){
        return helper1(n, 0);
    }
    private static int helper1(int n, int count){
        if(n == 0) return count;
        if(n%10 == 0) return helper1(n/10, count+1);
        return helper1(n/10, count);
    }
    public static int numberOfSteps(int num){
        return helper3(num,0);
    }
    private static int helper3(int num, int steps){
        if(num == 0) return steps;
        if(num % 2 == 0) return helper3(num/2, steps+1);
        return helper3(num-1, steps+1);
    }

    //check whether the array is sorted or not
    public static boolean isSortedArr(int[]arr,int idx){
        if(idx == arr.length-1) return true;

        return arr[idx]<arr[idx+1] && isSortedArr(arr, idx+1);
    }

    // check whether the element is present in the array or not
    public static boolean isElementPresentInArr(int[]arr,int target,int idx){
        if(idx == arr.length) return false;

        return arr[idx]==target || isElementPresentInArr(arr, target, idx+1);
    }

    // return idx of  the element that is present in the array 
    public static int isElementPresentInArr2(int[]arr,int target,int idx){
        if(idx == arr.length) return -1;

        if(arr[idx] == target) return idx;

        return isElementPresentInArr2(arr, target, idx+1);
    }

    // return idx of  the element from the last of array that is present in the array 
    public static int isElementPresentInArr3(int[]arr,int target,int idx){
        if(idx == -1) return -1;

        if(arr[idx] == target) return idx;

        return isElementPresentInArr3(arr, target, idx-1);
    }

    // return all idxes of  the element that is present in the array 
    public static ArrayList<Integer> isElementPresentInArr4(int[]arr,int target,int idx,ArrayList<Integer>list){
        if(idx == arr.length) return list;

        if(arr[idx] == target) list.add(idx);

        return isElementPresentInArr4(arr, target, idx+1,list);
    }

    // return all idxes of  the element that is present in the array but the arralist not be provided in the parameter
    public static ArrayList<Integer> isElementPresentInArr5(int[]arr,int target,int idx){

        ArrayList<Integer> list = new ArrayList<>();

        if(idx == arr.length) return list;

        if(arr[idx] == target) list.add(idx);

        ArrayList<Integer> ansFromBelowFunctionCalls = isElementPresentInArr5(arr,target,idx+1);

        list.addAll(ansFromBelowFunctionCalls);

        return list;
    }

    public static int rotatedBinarySearch(int[] arr, int target,int s,int end){
        if(s > end) return -1;
        int mid = s + (end - s)/2;

        if(arr[mid]==target) return mid;

        if(arr[s] <= arr[mid])
            if(target >= arr[s] && target <= arr[mid])
                return rotatedBinarySearch(arr, target, s, mid-1);
        else return rotatedBinarySearch(arr, target, mid+1, end);

        if(target >= arr[mid] && target <= arr[end]) return rotatedBinarySearch(arr, target, mid+1, end);
        
        return rotatedBinarySearch(arr, target, s, mid-1);
    }

    public static void reverseStarPattern(int r, int c){
        if(r==0) return;

        if(c<r) {
            System.out.print("* ");
            reverseStarPattern(r, c+1);
        }else{
            System.out.println();
            reverseStarPattern(r-1, 0);
        }
    }

    public static void triangleStarPattern(int r, int c){
        if(r==0) return;

        if(c<r) {
            triangleStarPattern(r, c+1);
            System.out.print("* ");
        }else{
            triangleStarPattern(r-1, 0);
            System.out.println();
        }
    }

    public static void bubbleSort(int[] arr, int r, int c){
        if(r==0) return;
        if(c < r){

            if(arr[c] > arr[c+1]){
                int tmp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = tmp;
            } bubbleSort(arr, r, c+1);
        }else{
            bubbleSort(arr, r-1, 0);
        }
    }

    public static void selectionSort(int[] arr, int r, int c, int max){
        if(r==0) return;

        if(c<r){
            if(arr[c] > arr[max])
                selectionSort(arr, r, c+1, c);
            else selectionSort(arr, r, c+1, max);
        }else{
            int tmp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = tmp;
            selectionSort(arr, r-1, 0, 0);
        }
    }

    public static int[] mergeSort(int[] arr){
        if(arr.length == 1) return arr;

        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left,right);

    }
    static int[] merge(int[]first, int[] second){
        int[] mix = new int[first.length + second.length];
        int i = 0, j = 0, k = 0;

        while(i<first.length && j<second.length){
            if(first[i] < second[j])
                mix[k++] = first[i++];
            else mix[k++] = second[j++];
        }
        while(i < first.length)
            mix[k++] = first[i++];
        
        while(j < second.length)
            mix[k++] = second[j++];
        
        return mix;
    }



    static void mergeSortInPlace(int[]arr , int s , int e){
        if(e-s == 1) return;
        int mid = (s+e)/2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid , e);

    }
    static void mergeInPlace(int[]arr, int s, int m, int e){
        int[] mix = new int[e-s];
        int i = s, j = m, k = 0;

        while(i<m && j<e){
            if(arr[i] < arr[j])
                mix[k++] = arr[i++];
            else mix[k++] = arr[j++];
        }
        while(i < m)
            mix[k++] = arr[i++];
        
        while(j < e)
            mix[k++] = arr[j++];
        
        for(int l = 0; l<mix.length; l++){
            arr[s+l] = mix[l];
        }
    }

    static void quickSort(int[] nums, int low, int hi){
        if(low >= hi) return;

        int s = low;
        int e = hi;
        int mid = s + (e-s)/2;
        int pivot = nums[mid];

        while(s <= e){
            while(nums[s] < pivot) s++;
            while(nums[e] > pivot) e--;

            if(s <= e){
                int tmp = nums[s];
                nums[s++] = nums[e];
                nums[e--] = tmp;

            }
        }

        quickSort(nums, low, e);
        quickSort(nums, s, hi);
    }
    public static void main(String[] args) {
        // int n = 4;
        // System.out.println(fibo(n));
        // int[] arr = {1,3,5,8,19,23};
        // int target = 1;
        // int s = 0, e = arr.length-1;
        // System.out.println(search(arr, target, s, e));
        // int n = 5;
        // printNto1(n);

        // System.out.println(factorial(n));

        // int digit = 54321;
        // System.out.println(digitSum(digit));

        // int digit = 505;
        // System.out.println(digitProduct(digit));

        // int n = 5;
        // printNTo1(n);

        // int n = 1342;
        // reverseNumber(n);
        // System.out.println(sum);

        // int n = 12113;
        // System.out.println(reverse2(n));

        // System.out.println(palindrome(n));

        // int n = 102020101;
        // System.out.println(countZero(n));
        // int n = 14;
        // System.out.println(numberOfSteps(n));

        // int[] arr = {29,40,233};
        // System.out.println(isSortedArr(arr, 0));

        // int[] arr = {29,2,40,233,2,4,20,2};
        // int target = 2;
        // System.out.println(isElementPresentInArr(arr,target, 0));
        // System.out.println(isElementPresentInArr2(arr,target, 0));
        // System.out.println(isElementPresentInArr3(arr,target, arr.length-1));
        // System.out.println(isElementPresentInArr4(arr,target, 0,new ArrayList<>()));
        // System.out.println(isElementPresentInArr5(arr,target, 0));

        // int[] arr = {4,5,6,1,2,3};
        // int target = 6;
        // System.out.println(rotatedBinarySearch(arr, target, 0, arr.length-1));

        // reverseStarPattern(5, 0);
        // triangleStarPattern(5,0);

        // int[] arr = {4,2,12,4};
        // bubbleSort(arr, arr.length-1, 0);
        // System.out.println(Arrays.toString(arr));


        // int[] arr = {4,3,2,1};
        // selectionSort(arr, arr.length, 0,0);
        // System.out.println(Arrays.toString(arr));

        // int[] arr  = {5,4,3,2,1};
        // arr = mergeSort(arr);
        // System.out.println(Arrays.toString(arr));

        // int[] arr  = {5,4,3,2,1};
        // mergeSortInPlace(arr,0,arr.length);
        // System.out.println(Arrays.toString(arr));

        int[] arr = {5,4,3,2,1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));


    }
}
