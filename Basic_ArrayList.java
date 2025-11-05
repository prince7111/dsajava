package dsajava;
import java.util.ArrayList;
public class Basic_ArrayList {
    public static void main(String args[]){
        ArrayList <Integer> list = new ArrayList<>();
        ArrayList <Float> floatList = new ArrayList<>();
        ArrayList <String>strList = new ArrayList<>();

        //add Opearation
        System.out.print(("add operation"));
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        // list.add(5);
      System.out.println(list);
      System.err.println(""+list.get(3));
      System.out.println(list.contains(0));
      
    
        


    }
    
}
