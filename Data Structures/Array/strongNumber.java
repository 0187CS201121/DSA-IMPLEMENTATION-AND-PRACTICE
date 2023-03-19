public class strongNumber {
    
        static int isStrong(int N) {
            // code here
             int temp=N,rem=0,res=0;
    
            while(N!=0){
    
                rem = N%10;
    
                res +=factorial(rem);
    
                N/=10;
    
            }
    
            return res==temp? 1:0;
    
        }
    
        static int factorial(int x){
    
            int f=1;
    
            for(int i=1;i<=x;i++){
    
                f*=i;
    
            }
    
            return f;
    
    
        }
        public static void main(String[] args) {
            int N = 145;
           System.out.println(isStrong(N));

        }
  
}
