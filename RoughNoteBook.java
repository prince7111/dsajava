package dsajava;
import java.util.*;
public class RoughNoteBook{
    public static void swap(ArrayList<Integer>saarni,int idx1,int idx2){
        int temp = saarni.get(idx1);
        saarni.set(idx1, saarni.get(idx2));
        saarni.set(idx2, temp);
        System.out.println(saarni);

    }
  
    public static void main (String args[]){
    //     System.out.println("WE  learn -ArrayList");
    //     //maulti -Diamentional arraylist
    //     ArrayList< ArrayList<Integer>>  Mlist = new ArrayList<>();    //mlist >list
    //                //List one:
    //     ArrayList<Integer> list1 = new ArrayList<>();
    //     //initialization
    //     list1.add(1);
    //     list1.add(2);
    //     Mlist.add(list1);///
    //               //List two:
    //     ArrayList<Integer> list2 = new ArrayList<>();     
    //     list2.add(4); 
    //     list2.add(5) ;
    //     Mlist.add(list2);///
    //     //printin loopps
    //     for(int i =0; i<Mlist.size();i++){
    //         ArrayList<Integer> currList = Mlist.get(i);
    //         for(int j =0; j<currList.size();j++){
    //             System.out.print(currList.get(j)+" ");
    //         }
    //         System.out.println();
    //     }
    //    System.out.println(Mlist);
    ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
    ArrayList <Integer> list1 = new ArrayList<>();
    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.add(4);
    list1.add(5);
    mainList.add(list1);
    ArrayList <Integer> list2 = new ArrayList<>();
    list2.add(2);
    list2.add(4);
    list2.add(6);
    list2.add(8);
    list2.add(10);
    mainList.add(list2);
    ArrayList <Integer> list3 = new ArrayList<>();
    list3.add(3);
     list3.add(6);
      list3.add(9);
       list3.add(12);
        list3.add(15);
    mainList.add(list3);
    System.out.println("pirnt her::::");
    System.out.println(mainList);



           


         

       
      
   
       
      


        
      
        
    }
}