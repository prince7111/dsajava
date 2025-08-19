//19 august || D2 : Array 2||;
package dsajava;

import java.util.*;
public class augustArray{ 
 public List<List<Integer >> threesum(int nums[]){
    Set<List<Integer>> tripleHashSet = new HashSet<>();
    for(int i =0; i<nums.length;i++){
        int a = -nums[i];
        Set<Integer> set = new HashSet<>();
        for(int j =i+1; j<nums.length;j++){
            int c = a-nums[j];
            if(set.contains(c)){
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[j]);
                list.add(c);
                list.sort(null);
                tripleHashSet.add(list);
            }
           set.add(nums[j]);
    
        }
    }
    return new ArrayList<>(tripleHashSet);
 }
    public static void main(String args[]){
        augustArray sol = new augustArray();
        int nums []= {-1,0,1,2,-1,4};
        List<List<Integer>> res=sol.threesum(nums);
        System.out.println(res);
    }
}

