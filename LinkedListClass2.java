package dsajava;
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
   public static  boolean isCycle(){
    Node current = head;
    while(current != null){ //outerloop
        Node runner = head;
        while(runner != current){ // inner loop
            if(runner == current.next){
                return true;
            }
            runner = runner.next;

        }
        current = current.next;

    }
    return false;
   }
    public static void main(String[] args) {
          head = new Node(1);
          head.next = new Node(2);
          head.next.next = new Node(3);
          head.next.next.next = new Node(4);
          head.next.next.next.next = new Node(5);
          head.next.next.next.next.next = head;
   
          System.out.println(isCycle());
    }
    
}
