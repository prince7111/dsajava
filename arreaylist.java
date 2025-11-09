package dsajava;
import java.util.*;
public class arreaylist {
   public static void rEverseArrList(ArrayList<Integer>list){
    for(int i=list.size()-1;i>=0;i--){
        System.out.print(list.get(i)+" ");
    }
   }
   public static int findMax(ArrayList<Integer>list){
     int max =0;
       for(int i=0;i<list.size()-1;i++){
        int curValue = list.get(i);
        if(curValue>=max){
        max = curValue;
        }
       }
       return max;
   }
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
       list.add(2);
       list.add(5);
       list.add(9);
       list.add(3);
       list.add(6);
       System.out.println(findMax(list));
    
     

        

    }
    
}
