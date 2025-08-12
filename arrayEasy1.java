package dsajava;

import java.util.*;

public class arrayEasy1 {
    // public static int majorityElementOp(int nums[]){ // optimized
    //     int maj = nums[0];
    //     int count = 1;
    //     for(int i =1; i<nums.length; i++){
    //         if(nums[i]==maj){
    //             count++;
    //         }else if(count<=0){
    //             maj=nums[i];count=1;
    //         }else{
    //             count--;
    //         }
    //     }
    //     return maj;
    // }
    // public static int majorityElement(int nums[]){ // brute force
    //     int maj = nums.length/2;
    //     Arrays.sort(nums);
    //     return nums[maj];
    //     }
    // public static void merge(int nums1[],int m,int nums2[],int n){
    //     int i =m-1;
    //     int j = n-1;
    //     int idx = (m+n)-1;
    //     while(i>=0 & j>=0){
    //         if(nums2[j]>nums1[i]){
    //             nums1[idx--] = nums2[j--];
                
    //         }else{
    //             nums1[idx--]= nums1[i--];
    //         }
    //     }
    //     while(j>=0){
    //          nums1[idx--] = nums2[j--];

    //     }
      
    // }
    public static int singleNUm(int nums[]){//brute force 
        HashMap <Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0)+1);
            
            }
             for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;
            


        }
        public static int singleNumberOP(int nums[]){
            int res =0;
            for(int n : nums){
                res= res^n;
            }
            return res;

        }
        public static int buyAndSellStocks(int price[]){
            int buyPrice = Integer.MAX_VALUE;
            int maxProfit = 0;
            for(int i =0; i<price.length;i++){
                if(buyPrice < price[i]){
                    int profit = price[i]-buyPrice;
                    maxProfit = Math.max(profit, maxProfit);
                }else{
                    buyPrice = price[i];
                }

            }
            return maxProfit;
        }
        public static int[] findValue(int grid[][]){
            int row = grid.length;
            int col = grid[0].length;
            HashMap<Integer,Integer> map = new  HashMap<>();
          for(int i =0; i<row;i++){
            for(int j =0; j<col;j++){
                int num = grid[i][j];
                map.put(num, map.getOrDefault(num, 0)+1);
            }
          }
          int totEl = row*col;
          int repeating = -1;
          int missing = -1;
          for(int i =1; i<=totEl;i++){
            if(map.containsKey(i)){
                if(map.get(i)==2){
                    repeating =i;
                }
            }else{
                missing =i;
            }
          }
          return new int[] {repeating,missing};
        }
    public static void main(String args[]){
     int grid [][]= {{1,3},{2,2}};
     int result[] = findValue(grid);
     System.out.println(Arrays.toString(result));
     
     

       


      
        
   
    }    
}
