
public class QueueB{
    static class Queue{
        static int arr[];
        static int size;
        static int rear;
        Queue(int n){
            size = n;
            arr = new int[size];
            rear = -1;

        } 
        public static boolean isEmpty(){
            return rear==-1;
        }
        public static void add(int data) {
            if(rear == size-1){
                System.err.println("queue is full(overFlow)");
                return;
            }
            rear = rear+1; //-1idx==> 0 idx
            arr[rear] = data;
        }
        public static int remove (){
            if(isEmpty()){
                System.out.println("Queue is empty(underFlow)");
                return -1;
            }
            int rmvFront = arr[0];
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear = rear-1;
            return rmvFront;
        }
        public static int peek(){
            if(isEmpty()){
                System.err.println("Queue is empty(underFlow)");
                return -1;
            }
            return arr[0];
        }
    }
    public static void main(String args[]){
        Queue q = new Queue(8);
        q.add(2);
        q.add(4);
        q.add(6);
        q.add(8);
        q.add(10);
        q.add(12);
        q.add(14);
        q.add(16);
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        System.out.println("Array base normal queue");

    }
}
