

public class Run{
    //CLASS LINKED LSIT
    public static class Node{ //CLASS NODE
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    } //PORPERTEIS OF MAIN CLASS (LINKED LIST)
    public static  Node head;
    public static  Node tail;
    public static  int size;
    //addFirs() 
    public void addFirst(int data){
        Node newNode = new Node(data);//newNode
        size++;
        
        if(head ==null){
            head = tail = newNode;  
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // method 2 addLast()
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
           head = tail =newNode;
        }
        tail.next = newNode;
        tail = newNode;
    }
    //3 removeFirst
    public int removeFirst(){
        if(head ==null){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if(size ==1){
            head = tail = null;
            size =0;
        
        }
        int val = head.data;
        head = head.next; //delete Node
        size--;
        return val;
    }
    //4 removelast
    public int removeLast(){
        if(head == null){
            System.out.println("LL is Empty");
            return Integer.MAX_VALUE;
        }else if(size ==1){
            int val = head.data;
            head = tail = null;
            size =0;
            return val;

        }
        Node prev = head;
       for(int i=0;i<size-2;i++){
        prev = prev.next;
       }
        int val = prev.next.data;
        prev.next =null;
        tail = prev;
        size--;
        return val;
    }//Prining a linked list
    public void print(){
        if(head == null){
            System.out.println("LL is Empty");
            return;
        }
        Node temp = head;
        while(temp != null){
        System.out.print(temp.data+"--");
      
        temp = temp.next;
        }
         System.out.println("null");
    }
    public static int itrSearch(int key){
        Node temp = head;
        int pos =0;
        while(temp != null){
            if(temp.data == key){
                return pos;
            }
            temp = temp.next;
            pos++;
        }    
        return -1;
    }
    public static  int helper(Node temp,int key){
        if(temp == null){
            return -1;
        }
        if(temp.data ==key){
            return 0;
        }
        int idx= helper(temp.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }
    public static int recSearch(int key){
        return helper(head,5);

    }
    public static void deletNthFromEnd(int n){
        int sz =0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            sz++;
        }
        System.out.println(sz);
        Node prev = head;
        for(int i=0;i<(sz-n)-1;i++){
            prev = prev.next;
        }
        prev.next = prev.next.next;
        return;
    }
    public static void main(String args[]){
        Run ll = new Run();
            ll.addFirst(1);
            ll.addLast(2);
            ll.addLast(3);
            ll.addLast(4);
            ll.addLast(5);
            ll.addLast(6);
            ll.print();
      deletNthFromEnd(3);
      ll.print();

       
    
    
       
    }
}
    

        
        
        
        
        

        
      
