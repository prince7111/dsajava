package dsajava;
import com.sun.net.httpserver.Authenticator;
import java.util.*;
public class LinkedListClass2 {
    //Q.1 check Loop/Cyle lin.list
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            tail = head = newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }
//    public static  boolean isCycle(){
//     Node current = head;
//     while(current != null){ //outerloop
//         Node runner = head;
//         while(runner != current){ // inner loop
//             if(runner == current.next){
//                 return true;
//             }
//             runner = runner.next;

//         }
//         current = current.next;

//     }
//     return false;
//    }
    public static boolean isCycle(){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }
    public static void removeCycle(){
        Node slow =head;
        Node fast = head;
        boolean iscycle = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                iscycle = true;
                break;
            }
        }
        if(iscycle == false){
            System.out.println("ll is not Cycle");
             return;
        }
        slow = head;
        Node prev = null;
        while(slow != fast){
            prev = fast;
            fast = fast.next;//+1
            slow = slow.next;//+1
        }
        prev.next = null;


    }
    public static void main(String[] args) {
          head = new Node(1);
          
          head.next = new Node(2);
          head.next.next = new Node(3);
          Node temp = new Node(4);
          head.next.next.next = temp;
          head.next.next.next.next = new Node(5);
          head.next.next.next.next.next = temp;
         System.err.println(isCycle());
          removeCycle();
         System.err.println(isCycle());

   
    }
    
}
