import java.util.*;
public class Heaps{
    static class heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data){
            arr.add(data);
            int x = arr.size()-1;//child index
            int per = (x-1)/2;
            while(arr.get(x) < arr.get(per)){
                int temp = arr.get(x);
                arr.set(x, arr.get(per));
                arr.set(per, temp);
            }
        }
        public int peek(){
            return arr.get(0);
        }

    }
    public static void main(String args[]){
        heap h = new heap();
        h.add(1);
        h.add(4);
    System.out.println(h.peek());

    }
}
