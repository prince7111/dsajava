package dsajava;

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
    }
    Node temp = head;
    while(temp.next.next!= null){
        temp = temp.next;
    }
    int removedVal = temp.next.data;
    temp.next = null;
    return removedVal;

   }
   public void add(int idx,int val){
     Node newNode = new Node(val);
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
    public static void main(String args[]){
        LinkedListRevision ll = new LinkedListRevision();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
       ll.add(2, 4);
       System.err.println("the key is at position in ll is = "+ll.itrSearch(4));
       ll.print();
        

    }

    
}
