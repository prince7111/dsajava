public class LinkedList{
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
    public static int size;
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head= tail = newNode;
            return;
        }
        newNode.next = head; //link
        head = newNode;
    }
    public void  addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            tail = head = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }
    public void print(){
        if(head == null){
            System.out.println("ll is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
           System.out.println("null");
    }
        public void add(int idx,int data){
            if(idx ==0){
                addFirst(data);
            }
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i = 0;
            while(i<=idx-2){
                temp = temp.next;
                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        public int removeFirst(){
            int val = head.data;
            head = head.next;
            return val;
        }
    
    public static void main(String args[]){
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.add(2, 5);
        ll.print();//1--2--3--4--5--null
 
        System.err.println(ll.removeFirst());
        ll.print();
    

        
        
         
    }
}
