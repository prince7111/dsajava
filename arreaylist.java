package dsajava;
import java.util.*;
import javax.print.attribute.standard.PrinterLocation;
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
   public static void twoDArrList( ArrayList<List<Integer>> mainlist){
         ArrayList<Integer> list1 = new ArrayList<>();
       ArrayList <Integer> list2 = new ArrayList<>();
       ArrayList <Integer> list3 = new ArrayList<>();
       for(int i =1;i<=5;i++){
        list1.add(i*1);
        list2.add(i*2);
        list3.add(i*3);
       }
      
       mainlist.add(list1);
       mainlist.add(list2);
       mainlist.add(list3);
       System.out.println(mainlist);
   }
    public static void main(String[] args) {
       ArrayList<List<Integer>> mainlist = new ArrayList<>();
       twoDArrList(mainlist);
     
       
    
     

        

    }
    
}
