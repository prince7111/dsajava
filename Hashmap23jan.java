import java.util.HashMap;
public class Hashmap23jan {
    public static void main(String args[]){
        System.out.println("Hello World");
        HashMap<String,Integer> hsmap = new HashMap<>();
        //add\put O(n)
        hsmap.put("A",1);
        hsmap.put("B",2);
        hsmap.put("C", 3);
        System.out.println(hsmap);
        System.out.println(hsmap.get("A"));
        System.out.println(hsmap.containsKey("B"));
         System.out.println(hsmap.containsKey("D"));
         hsmap.clear();
         System.out.println("isEmpty:"+hsmap.isEmpty());


    }    
}
