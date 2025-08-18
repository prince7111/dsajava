package dsajava;
import java.util.*;
public class ArraysTwo {
    // public List<List<Integer>> threesumOp(int nums[]){
    //    HashSet<List<Integer>> st = new HashSet();
    //     HashMap<Integer,Integer> map = new HashMap();
    //     for(int i =0; i<nums.length;i++){
    //         int a =-nums[i];
    //         for(int j =i+1;j<nums.length;j++){
    //             int b =-nums[j];
    //             if(map.containsKey(a+b)){
    //                ArrayList<Integer> al = new ArrayList<>();
    //                 al.add(nums[i]);
    //                 al.add(nums[j]);
    //                 al.add(nums[a+b]);
    //                 Collections.sort(al);
    //                 st.add(al);
    //              }else{
    //             map.put(nums[j],j);
    //             }

    // //         }
    // //     }
    // //       List<List<Integer>> resList = new ArrayList<>(st);
    // //       return resList;
    // // }
    // // public List<List<Integer>> threesum (int nums[]){
    // //    ArrayList< ArrayList<Integer>> findtriplet = new ArrayList<>();
    // //     // two pointer
    // //     Arrays.sort(nums);
    // //     for(int i =0;i<nums.length;i++){
    // //         int st =i+1;
    // //         int end = nums.length-1;
    // //         if(i>0 && nums[i]==nums[i-1])continue;
    // //         while (st<end) {
    // //             int sum =nums[i]+nums[st]+nums[end];
    // //         if(sum >0){
    // //             end--;
    // //         }else if(sum<0){
    // //             st++;
    // //         }else{
    // //            ArrayList<Integer> currTriplet = new ArrayList<>();
    // //            currTriplet.add(nums[i]); currTriplet.add(nums[st]); currTriplet.add(nums[end]);
    // //            findtriplet.add(currTriplet);
    // //            st++;end--;

    // //         }
    // //         while(st<end && nums[st]==nums[st-1]){
    // //             st++;
    // //         }
         
                
    // //         }
    // //     }
        
    // //       List<List<Integer>> res= new ArrayList<>(findtriplet);
    // //       return res;


    // // }
    //  public List<List<Integer>> fourSum(int []nums, int target) {
    //     HashSet<List<Integer>> uniqTriplet =new HashSet<>();
    //     int n =nums.length;
    //     for(int i =0;i<n;i++){
    //         for(int j =i+1;j<n;j++){
    //             for(int k =j+1;k<n;k++){
    //                 for(int l =k+1;l<n;l++){
    //                     int sum = nums[i]+nums[j]+nums[k]+nums[l];
    //                     if(sum ==target){
    //                         ArrayList<Integer> findTriplet =new ArrayList<>();
    //                         findTriplet.add(nums[i]);
    //                         findTriplet.add(nums[j]);
    //                         findTriplet.add(nums[k]);
    //                         findTriplet.add(nums[l]);
    //                         Collections.sort(findTriplet);
    //                         uniqTriplet.add(findTriplet);

    //                     }
    //                 }
    //             }
    //         }
    //     }
     
    //     List<List<Integer>> resultList = new ArrayList<>(uniqTriplet);
    //     return resultList;
    // }
    public List<List<Integer>> foursumH(int nums[],int target){
        ArrayList<ArrayList<Integer>> findiTriplet = new arrayEasy1();

    
      
    public static void main(String args[]){
       int nums[] ={1,0,-1,0,-2,2};
       int target =0;
    }
    
}
