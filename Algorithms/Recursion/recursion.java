import java.util.ArrayList;

class recursion{

    // Print Name n times
    static void printName(int n){
        if(n<=0) return;
        printName(n-1);
        System.out.println("Prashant");
    }
    static void printLinear(int n){
        if(n<=0) return;
        printLinear(n-1);
        System.out.println(n);
    } 
    static void printLinearly(int i, int n){
        if(i>n) return;
        System.out.println(i);
        printLinearly(i+1, n);

    }
    static void printInReverse(int n){
        if(n<=0) return;
        System.out.println(n);
        printInReverse(n-1);
    }
    static void parameterisedRecursion(int i, int sum){
        if(i<1) { 
            System.out.println(sum);
            return;
        }
        parameterisedRecursion(i-1, sum+i);
    }
    static int functionalRecursion(int n){
        if(n==0) return 0;
        return n + functionalRecursion(n-1);
    }
    // ============================
    // L4.
    // public static int[] arr;
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }
    static void reverseArr(int[] arr, int l, int r){
        if(l>=r) return;
        swap(arr, l, r);
        reverseArr(arr,l+1, r-1);
    }
    // if we want to reduce the parameter then instead of l and r we can use i only see below implementation
    static void reverseArrs(int[] arr,int i){
        int n = arr.length;
        if(i>=n/2) return;
        swap(arr, i, n-i-1);
        reverseArrs(arr, i+1);
    }
    static void printArr(int[] arr){
        for(int e : arr) System.out.print(e + " ");
    }
    // check whether given string is a palindrome
    static boolean checkPalindrome(char[] arr, int i){
        int n = arr.length;
        if(i>=n/2) return true;
        if(arr[i] != arr[n-i-1]) return false;
        return checkPalindrome(arr, i+1);
    }
    //==================================================
    // L5.
    // Multiple Recursion Calls Using Fibonacci Number
    static int fibonacciNumber(int n){
        if(n<=1) return n;
        int last = fibonacciNumber(n-1);
        int sLast = fibonacciNumber(n-2);
        return last + sLast;
    }

    // ================================================
    // L6. Recursion on Subsequences | Printing Subsequences
    /* Subsequence is basically the sequence which follows some order like if have given an arr {3,1,2}
    so 3 should always come before 1 and  1 and 2 should alsways come after 3
    arr[] = {3,1,2}; []empty arr
    f(idx,[]){
        if(idx >= n) print([]) return ;//base case;
        [].add(arr[i]); // take
        f(idx+1,[]);
        [].remove(arr[i]); // not take
    }
    main(){
        arr = {3,1,2};
        f(0,[]);
    }
     */
    static void printSubsequences(int idx,ArrayList<Integer>arr,int subsequenceArr[]){
        if(idx == subsequenceArr.length){
            if(arr.size() == 0 ) System.out.println("{}");
            if(arr.size()>0) {
                System.out.println(arr);
            }
        }
        else{
            arr.add(subsequenceArr[idx]);
            
            printSubsequences(idx+1, arr, subsequenceArr);

            arr.remove(arr.size()-1);
            
            printSubsequences(idx+1, arr, subsequenceArr);
        }
        return;
    }

    //L.7(1)
    //Q. Print subsequences whose sum is equals to given sum
    static void subsequencesWithGivenSum(int idx, ArrayList<Integer> listArr,int[] subsequenceArr, int s,int sum){
        if(idx == subsequenceArr.length){
            if(s == sum) System.out.println(listArr);
            return;
        }else{
            listArr.add(subsequenceArr[idx]);
            s += subsequenceArr[idx];
            subsequencesWithGivenSum(idx+1, listArr, subsequenceArr, s, sum);
            listArr.remove((listArr.size()-1));
            s -= subsequenceArr[idx];
            subsequencesWithGivenSum(idx+1, listArr, subsequenceArr, s, sum);
        }
    }

     //L.7(2)
    // Q. Print any one subsequence whos sum is equal to given sum;

    static boolean oneSubsequencesWithGivenSum(int idx, ArrayList<Integer> listArr,int[] subsequenceArr, int s,int sum){
        if(idx == subsequenceArr.length){
            //condition satisfied
            if(s == sum) {
                System.out.println(listArr);
                return true;
            }else return false;
        }
            listArr.add(subsequenceArr[idx]);
            s += subsequenceArr[idx];
            if(oneSubsequencesWithGivenSum(idx+1, listArr, subsequenceArr, s, sum)==true) return true;
            listArr.remove((listArr.size()-1));
            s -= subsequenceArr[idx];
            if(oneSubsequencesWithGivenSum(idx+1, listArr, subsequenceArr, s, sum)==true) return true;
        return false;
        
    }

      //L.7(3)
    // Q. Print count of subsequences whose sum is equal to given sum;

    static int countSubsequencesWithGivenSum(int idx,int[] subsequenceArr, int s,int sum){
        if(idx == subsequenceArr.length){
            //condition satisfied
            if(s == sum) return 1;
            else return 0;
        }
            
            s += subsequenceArr[idx];

            int l = countSubsequencesWithGivenSum(idx+1, subsequenceArr, s, sum);

            s -= subsequenceArr[idx];

            int r = countSubsequencesWithGivenSum(idx+1, subsequenceArr, s, sum);
        
    return l+r;
        
    }
public static void main(String[] args) {
    // printName(10);
    // printLinear(10);
    // printInReverse(10);
    // printLinearly(1, 10);
    // parameterisedRecursion(3, 0);
    // System.out.println(functionalRecursion(5));
    // int[] arr = {-5,4,3,2,1};
    // reverseArrs(arr, 0);
    // printArr(arr);
    // String palindrome = "MADAM";
    // char[] arr = palindrome.toCharArray();
    // System.out.println(checkPalindrome(arr, 0));
    // System.out.println(fibonacciNumber(4));
    // int[] subsequenceArr = {1,2,3};
    // ArrayList<Integer>arr = new ArrayList<>();
    // printSubsequences(0,arr,subsequenceArr);

     //L.7(1)
    // int[] subsequenceArr = {1,2,1};
    // ArrayList<Integer> listArr = new ArrayList<>();
    // subsequencesWithGivenSum(0, listArr, subsequenceArr, 0, 2);

     //L.7(2)
    // int[] subsequenceArr = {1,2,1};
    // ArrayList<Integer> listArr = new ArrayList<>();
    // oneSubsequencesWithGivenSum(0, listArr, subsequenceArr, 0, 4);

     //L.7(3)
     int[] subsequenceArr = {1,2,1};
     int ans = countSubsequencesWithGivenSum(0, subsequenceArr, 0, 2);
     System.out.println(ans);
}

}