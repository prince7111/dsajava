package dsajava;

import javax.management.relation.RelationTypeSupport;

                 //LInked list Part 1
public class LinkedListRevision {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;//head of linkelist (bydefould =null)
    public static Node tail;//tail of ll(by defoualt = null)
    public static int size;
    //ADD FIRST() in linkedlist
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
          return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head ==null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    //print function()
    public void print(){
        if(head == null){
            System.err.println("ll is empty");
        }
        Node temp = head ;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        //last node linked to null
        System.out.println("null");
    }
    public int removeFirst(){
        if(head == null){
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        }
        int removedVal = head.data;
        head = head.next;
        size--;
        return removedVal;
    }
 
   public int removeLast(){
    if(head ==  null){
        System.out.println("ll is empty");
        return Integer.MIN_VALUE;
    }else if(size ==1){
        int removedVal = head.data;
        head = tail = null;
        size = 0;
        return removedVal;
        
    }
    Node temp = head;
    while(temp.next.next!= null){
        temp = temp.next;
    }
    int removedVal = temp.next.data;
    temp.next = null;
    size--;
   return removedVal;

   }
   public void add(int idx,int val){
     Node newNode = new Node(val);
     size++;
    if(head == null){
        addFirst(val);
    }
    Node temp = head;
    int i =1;
    while(i<idx){
        temp = temp.next;
        i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;

   }
   public static  int itrSearch(int key){
    int i =0;
    Node temp = head;
    while(temp != null){
        if(temp.data == key){
            return  i;
        }
        temp = temp.next;
        i++;
    }
    return -1;
   }
   public static int helper(Node temp,int key){
    //BaseCase
    if(temp == null){
        return -1;
    }
    if(temp.data == key){
        return 0;
    }
    int idx = helper(temp.next, key);
    if(idx == -1){
        return -1;
    }
    return idx+1;
   }
   public int recSearch(int key){
    return helper(head,key);
   }
   public static void reverseLL(){
    Node prev = null;
    Node curr = head;
    Node next;
    while(curr != null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    head = prev;
   }
    public static void main(String args[]){
        LinkedListRevision ll = new LinkedListRevision();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);//1--2--3--4--null
        ll.addLast(5);//1-->2-->3-->4-->5-->null
        ll.print();
        System.err.println("size of LL :"+size);
        ll.reverseLL();
         ll.print();
        System.err.println("size of LL :"+size);


    
        
       
    
       
        

    }

    
}
