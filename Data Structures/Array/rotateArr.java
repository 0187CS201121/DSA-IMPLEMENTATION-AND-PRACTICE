import java.util.* ;
import java.io.*; 
class rotateArr {
	
	public static void main(String args[]) {
		
		// Write code here
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();
		int k = sc.nextInt();

		rotate(arr,n, k);
		for(int e : arr)
			System.out.println(e+" ");
	}
	public static void rotate(int[]arr,int n, int k){
		reverse(arr, 0, n-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, n-1);
	}
	public static void reverse(int[]arr,int start, int end){
		while(start<end){
		int tmp = arr[start];
		arr[start++] = arr[end];
		arr[end--] = tmp;
		}
	}

}