package dsajava;
import java.util.*;
public class ArraysTwo {
    public List<List<Integer>> threesumOp(int nums[]){
       HashSet<List<Integer>> st = new HashSet<>();
        HashMap<Integer,Integer> map = new HashMap();
        for(int i =0; i<nums.length;i++){
            int a =-nums[i];
            for(int j =i+1;j<nums.length;j++){
                int b =-nums[j];
                if(map.containsKey(a+b)){
                   ArrayList<Integer> al = new ArrayList<>();
                    al.add(nums[i]);
                    al.add(nums[j]);
                    al.add(nums[a+b]);
                    Collections.sort(al);
                    st.add(al);
                 }else{
                map.put(nums[j],j);
                }

            }
        }
          List<List<Integer>> resList = new ArrayList<>(st);
          return resList;
    }
    public static void main(String args[]){
         ArraysTwo solutions = new ArraysTwo();
        int nums[] = {-1,0,1,2,-1,4};
        
         List<List<Integer>> threesumOp = solutions.threesumOp(nums);
        System.out.println("triplet sum"+threesumOp);
    }
    
}
