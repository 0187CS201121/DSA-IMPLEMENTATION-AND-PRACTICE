public class circularQueueUsingArray {
    static class circularQueue {
        static int arr[];
        static int size;
        static int rear = -1;
        static int front = -1;

        circularQueue(int n) {
            arr = new int[n];
            this.size = n;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }
        public static boolean isFull() {
            return (rear+1) % size == front;
        }


        public static void enqueue(int data) {
            if (isFull()) {
                System.out.println("queue is full");
                return;
            }
            if(front == -1) front = 0;
            rear = (rear+1) % size;
            arr[rear] = data;
        }
        // dequeue O(1);
        public static int dequeue() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            int result = arr[front];
            // singel element condition 
            if(rear == front){
                rear = front = -1;
            }else{
                front = (front + 1) % size;
            }
            
            return result;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }

    }

    public static void main(String[] args) {

        circularQueue q = new circularQueue(7);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        System.out.println("the removed element is "+ q.dequeue());
        q.enqueue(55);
        System.out.println("the removed element is "+ q.dequeue());
        q.enqueue(56);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.dequeue();
        }

    }
}
