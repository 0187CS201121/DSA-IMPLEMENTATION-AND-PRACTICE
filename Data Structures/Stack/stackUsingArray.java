public class stackUsingArray {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];
    boolean isEmpty(){ return (top < 0); }
    stackUsingArray(){
        top = -1;
    }
    boolean push(int x){
        if(top >= (MAX - 1)){
            System.out.println("Stack Overflow");
            return false;
        }else{
            a[++top] = x;
            System.out.println(x + " pushed into stack");
            return true;
        }
    }
    int pop() {
        if(top < 0){
            System.out.println("Stack underflow");
            return 0;
        }else {
            int x = a[top--];
            return x;
        }
    }
    int peek(){
        if(top<0){ 
            System.out.println("Stack Underflow");
        return 0;
        }
        else {
            int x = a[top];
        return x;
        }
    }

    void print(){
        for(int i = top; i>-1; i--)
            System.out.println(" "+a[i]);
    }
public static void main(String[] args) {
    stackUsingArray s = new stackUsingArray();
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(40);
    System.out.println(s.pop() +" Popped from stack");
    System.out.println("Top element is: " + s.peek());
    System.out.println("Elements present in stack");
    s.print();
}

}
