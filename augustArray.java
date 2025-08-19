//19 august || D2 : Array 2||;
package dsajava;

import java.util.*;
public class augustArray{ 
//  public List<List<Integer >> threesum(int nums[]){
//     Set<List<Integer>> tripleHashSet = new HashSet<>();
//     for(int i =0; i<nums.length;i++){
//         int a = -nums[i];
//         Set<Integer> set = new HashSet<>();
//         for(int j =i+1; j<nums.length;j++){
//             int c = a-nums[j];
//             if(set.contains(c)){
//                 List<Integer> list = new ArrayList<>();
//                 list.add(nums[i]);
//                 list.add(nums[j]);
//                 list.add(c);
//                 list.sort(null);
//                 tripleHashSet.add(list);
//             }
//            set.add(nums[j]);
    
//         }
//     }
//     return new ArrayList<>(tripleHashSet);
//  }
//  public List<List<Integer>> threesumOptimal(int nums[]){
//     Arrays.sort(nums);
//     List<List<Integer>> result = new ArrayList<>();
//     for(int i =0; i<nums.length;i++){
//         if(i>0 && nums[i]==nums[i-1])continue;


//         int j =i+1;int k =nums.length-1;
//         while(j<k){
//             int s = nums[i]+nums[j]+nums[k];
//             if(s<0){
//                 j++;
//             }else if(s>0){
//                 k--;

//             }else{
//                 List<Integer> ct = new ArrayList<>();
//                 ct.add(nums[i]);ct.add(nums[j]);ct.add(nums[k]);
//                 result.add(ct);
//                 j++;k--;
//                   while(j<k && nums[j]==nums[j-1]){
//                 j++;
//             }
//             while(j<k && nums[k]==nums[k-1]){
//                 k--;
//             }
//             }
          
//         }
//     }
//     return new ArrayList<>(result);
//  }
 public List<List<Integer>> fourSum(int nums[],int tar){

    Set<List<Integer>> findTriplet = new HashSet<>();
    int n =nums.length;
    for(int i =0;i<n;i++){
        for(int j=i+1;j<n;j++){
            for(int k =j+1;k<n;k++){
                for(int l =k+1;l<n;l++){
                    int s = nums[i]+nums[j]+nums[k]+nums[l];
                    if(s ==0){
                    ArrayList<Integer> cT = new ArrayList<>();
                    cT.add(nums[i]);cT.add(nums[j]);cT.add(nums[k]);cT.add(nums[l]);
                    Collections.sort(cT);
                    findTriplet.add(cT);                    
                }
                    
                }
            }
        }
    }
     List<List<Integer>> result = new ArrayList<>(findTriplet);
    return result;
 }
    public static void main(String args[]){
        augustArray sol = new augustArray();
        int nums[]= {1,0,-1,0,-2,2};int tar =0;
        List<List<Integer>> res=sol.fourSum(nums, tar);
         System.out.println(res);
    }
}

