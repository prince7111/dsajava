import java.util.*;
public class QueueB{                   //Princemeena (Main class)
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
    //circular Queue           Prince Meena (cicular queue)
    // static class Queue{
    //    static  int arr[];
    //    static  int capacity;
    //    static  int rear;
    //    static  int front;
    //     Queue(int size){
    //         arr = new int[size];
    //         capacity = size;
    //         rear = -1;
    //         front = -1;
    //     }
    //     //empty
    //     public static boolean isEmpty(){
    //         return front ==-1 || rear==-1;
    //     }
    //     //full
    //     public static boolean isFull(){
    //         return ((rear+1)%capacity)==front;
    //     }
    //     //add
    //     public static void add(int data){
    //         if(isFull()){
    //             System.out.println("Queue is full (Overflow)");
    //             return;
    //         }
    //         if(front ==-1){
    //             front =0;
    //         }
    //         rear = (rear+1)%capacity;
    //         arr[rear] = data;
    //     }
    //     public static int remove(){
    //         if(isEmpty()){
    //             System.out.println("queue is empty (underflow");
    //             return -1;
    //         }
    //         int removeFront = arr[front];
    //         if(front == rear){
    //             rear = front = -1;
    //         }else{
    //             front = (front+1)% capacity;
    //         }
    //         return removeFront;
    //     }
    //     public static int peek(){
    //        if(isEmpty()){
    //         System.out.println("queue is empty(underflow)");
    //         return -1;
    //        }
    //        return arr[front];
    //     }
    // }
   ////QUEUE USING LINKEDLIST              Prince Meena 
    // static class Node{
    //     int data;
    //     Node next;
    //     public Node(int data){
    //         this.data = data;
    //         this.next = null;
    //     }
    // }
    //     public static Node head;
    //     public static Node tail;
    //     //Empty
    //     public static  boolean isEmpty(){
    //         return head ==null;
    //     }
    //     //add
    //     public static void add(int data){
    //         Node newNode = new Node(data);
    //         if(head == null){
    //             head = tail = newNode;
    //             return;
    //         }
    //         tail.next =newNode;
    //         tail =newNode;
    //     }
    //     public static  int remove(){
    //         if(isEmpty()){
    //             System.err.println("Queue(ll) empty");
    //             return Integer.MIN_VALUE;
    //         }
    //         int val = head.data;
    //         head = head.next;
    //         return val;
    //     }
    //     public static  int peek(){
    //         if(isEmpty()){
    //             System.out.println("Queue(ll) empty");
    //             return Integer.MAX_VALUE;
    //         }
    //         return head.data;
    //     }
    ////Prince Meena Queues Using Two Stacks
    // static class Queue{
    //   static Stack<Integer> s1 = new Stack<>();
    //   static Stack<Integer> s2 = new Stack<>();

    //   public static boolean isEmpty() {
    //     return s1.isEmpty();
    //   }
    //   //add
    //   public static void add/*Enque( */(int data){
    //     while (!s1.isEmpty()) {
    //         s2.push(s1.pop());
    //     }
    //     s1.push(data);
    //     while(!s2.isEmpty()){
    //       s1.push(s2.peek());
    //       s2.pop();
    //     }
    //   }
    //   //remove 
    //   public static int remove/*Dequeue*/(){
    //     if(isEmpty()){
    //       System.out.println("Queue is empty");
    //       return -1;
    //     }
    //     return s1.pop();
    //   }
    //   //peek
    //   public static int peek(){
    //     if(isEmpty()){
    //       System.out.println("Queue is empty");
    //       return -1;
    //     }
    //     return s1.peek();
    //   }
    // }
  ////Queue using two stack part -II
    // static class Queue{
    //     static Stack<Integer> s1 = new Stack<>();
    //     static Stack<Integer> s2 = new Stack<>();
    //     public void Enque(int data){
            
    //         s1.push(data);
    //     }
    //     public static boolean isEmpt(){
    //         return s1.isEmpty() && s2.isEmpty();
    //     }
    //     public static int remove(){
    //         if(isEmpt()){
    //             System.out.println("Queue is empty");
    //             return -1;
    //         }
    //         if(s2.isEmpty()){
    //         while(!s1.isEmpty()){
    //             s2.push(s1.pop());
    //         }
    //     }
    //         return s2.pop();
    //     }
    //     public static int peek(){
    //         if(isEmpt()){
    //             System.out.println("Queue is empty");
    //             return -1;
    //         }
    //         if(s2.isEmpty()){
    //              while(!s1.isEmpty()){
    //             s2.push(s1.pop());
    //         }

    //         }
        
    //         return s2.peek();
    //     }
    // }
    // //Stack using two Queue part 1 (push O(1))
    // static class Stack{
    //     static Queue<Integer> q1 = new LinkedList<>();
    //     static Queue<Integer> q2 = new LinkedList<>();

    //     public static boolean haKhaali(){
    //         return q1.isEmpty() && q2.isEmpty();
    //     }
    //     //add
    //     public static void push(int data){
    //         while(!q1.isEmpty()){
    // //             q2.add(q1.remove());
    // //         }
    // //         q1.add(data);
    // //         while(!q2.isEmpty()){
    // //             q1.add(q2.remove());
    // //         }
    // //     }
    // //     //remove
    // //     public static int pop(){
    // //         if(haKhaali()){
    // //             System.out.println("Stack is empty");
    // //             return -1;
    // //         }
    // //         return q1.remove();
    // //     }
    // //     //peek
    // //     public static int peek(){
    // //         if(haKhaali()){
    // //             System.out.println("Stack is empty");
    // //             return -1;
    // //         }
    // //         return q1.peek();
    // //     }
    // // }
    // //Stack using two Queue part 2 (push O(1))
    //   public static void findNonRep( String str){
    //     int frec[] = new int[26];
    //     Queue<Character> q = new LinkedList<>();
    //     for(int i=0;i<str.length();i++){
    //       char c = str.charAt(i);
    //       int idx = c-'a';
    //       q.add(c);
    //       frec[idx]++;
    //       while(!q.isEmpty()&& frec[idx]>1){
    //         q.remove();
    //       }
    //       if(q.isEmpty()){
    //         System.out.print(-1+" ");
    //       }else{
    //         System.out.print(q.peek()+" ");
    //       }
    //     }
    //     System.out.println();
    //   }
  
    public static void interleaveTwoHalves(Queue<Integer> queue){
      Queue<Integer> q2 = new LinkedList<>();
        int qSize=0;
      while(!queue.isEmpty()){
        q2.add(queue.remove());
        qSize++;
      }
      int newArr[] = new int[qSize];//[0,0,0,0......0,0,0]
      int idx =0;
      while(!q2.isEmpty()){
        newArr[idx++] = q2.remove();
      }
      idx =0;int mid =qSize/2;
      while(mid<=qSize-1){
        queue.add(newArr[idx++]);
        queue.add(newArr[mid++]);
      }
      System.out.println("Output Queue:"+queue);

    }
    public static void main(String args[]){
      Queue<Integer> q1 = new LinkedList<>();
      q1.add(1);
      q1.add(2);
      q1.add(3);
      q1.add(4);
      q1.add(5);
      q1.add(6);
      q1.add(7);
      q1.add(8);
      q1.add(9);
      q1.add(10);
      System.out.println("Input Queue:"+q1);
      interleaveTwoHalves(q1);
      
    


      
      
    }
}
