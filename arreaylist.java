package dsajava;
import java.util.*;
import javax.print.attribute.standard.PrinterLocation;
public class Arreaylist {
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
   public static int stroreWater(ArrayList<Integer>list){
    int maxWater =0;
    int st =0;int end = list.size()-1;
    while(st<end){
        int hight = Math.min(list.get(st), list.get(end));
        int width = end -st;
        int curWater = hight* width;
        maxWater = Math.max(maxWater,curWater);
        if(list.get(end)>list.get(st)){
            st++;
        }else{
            end--;
        }
    }
    return maxWater;
   }
   public static boolean pairSum( ArrayList<Integer> list,int target){
    //brute force
    //two pointer aproch
    int st =0;int end = list.size()-1;
    while(st<end){
        int sum = list.get(st)+list.get(end);
        if(sum==target){
            return true;
            
        }else if(sum<target){
            st++;
        }else{
            end--;
        }
    }
    return false;
    
   }
   public static boolean isMonotonic (ArrayList<Integer> list){
     for(int i =0;i<list.size()-1;i++){
        for(int j =i;j<list.size()-1;j++){
            if(list.get(i)<list.get(j) && list.get(i+1)>list.get(j+1)){                
                return false;
            }else if(list.get(i+1)>list.get(j) && list.get(i+1)<list.get(j+1)){
                return false;
            }       
        }        
    }
    System.err.println("True");
    System.err.println("The list is monotonic");
    return true;
   }
    public static void main(String[] args) {
       //container with most Water(2 pointer apoach)
     ArrayList<Integer>list = new ArrayList<>();
     list.add(1);
     list.add(2);
     list.add(4);
     list.add(5);
     isMonotonic(list);
    
     

     
       
    
     

        

    }
    
}
