import java.util.PriorityQueue;
public class Heaps {
    public static void main(String args[]){
        System.out.println("(Heaps/PrioriyQueues)");
        PriorityQueue <Integer> pq = new PriorityQueue<>();
        pq.add(4); //add O(N)
        pq.add(2);
        pq.add(1);
        pq.add(3);
        while(!pq.isEmpty()){
            System.out.print(pq.remove()+ " ");
        }

    }
    
}
