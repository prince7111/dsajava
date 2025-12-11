
import javax.rmi.ssl.SslRMIClientSocketFactory;


public class QueueB{
    //array based normal queue
    // static class Queue{
    //     static int arr[];
    //     static int size;
    //     static int rear;
    //     Queue(int n){
    //         size = n;
    //         arr = new int[size];
    //         rear = -1;

    //     } 
    //     public static boolean isEmpty(){
    //         return rear==-1;
    //     }
    //     public static void add(int data) {
    //         if(rear == size-1){
    //             System.err.println("queue is full(overFlow)");
    //             return;
    //         }
    //         rear = rear+1; //-1idx==> 0 idx
    //         arr[rear] = data;
    //     }
    //     public static int remove (){
    //         if(isEmpty()){
    //             System.out.println("Queue is empty(underFlow)");
    //             return -1;
    //         }
    //         int rmvFront = arr[0];
    //         for(int i=0;i<rear;i++){
    //             arr[i] = arr[i+1];
    //         }
    //         rear = rear-1;
    //         return rmvFront;
    //     }
    //     public static int peek(){
    //         if(isEmpty()){
    //             System.err.println("Queue is empty(underFlow)");
    //             return -1;
    //         }
    //         return arr[0];
    //     }
    // }
    //circular Queue
    static class Queue{
       static  int arr[];
       static  int capacity;
       static  int rear;
       static  int front;
        Queue(int size){
            arr = new int[size];
            capacity = size;
            rear = -1;
            front = -1;
        }
        //empty
        public static boolean isEmpty(){
            return front ==-1 || rear==-1;
        }
        //full
        public static boolean isFull(){
            return ((rear+1)%capacity)==front;
        }
        //add
        public static void add(int data){
            if(isFull()){
                System.out.println("Queue is full (Overflow)");
                return;
            }
            if(front ==-1){
                front =0;
            }
            rear = (rear+1)%capacity;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("queue is empty (underflow");
                return -1;
            }
            int removeFront = arr[front];
            if(front == rear){
                rear = front = -1;
            }else{
                front = (front+1)% capacity;
            }
            return removeFront;
        }
        public static int peek(){
           if(isEmpty()){
            System.out.println("queue is empty(underflow)");
            return -1;
           }
           return arr[front];
        }
    }
    public static void main(String args[]){
       Queue q = new Queue(3);
         System.out.println("The capacity of array to simulate Queue"+q.capacity);
       q.add(1);
       q.add(2);
       q.add(3);
       System.out.println(q.remove());
       q.add(4);
       System.out.println(q.remove());
       q.add(5);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        System.out.println("better Circualr queue");

    }
}
