package dsajava;

import java.util.Arrays;
import java.util.Collections;

public class arraysThree {
            public static void nextPermutation (int nums[],int n){
            // 1 2 3 6 5 4
            int piv =-1;
            for(int i=n-2;i>=0;i--){
                if(nums[i]<nums[i+1]){
                    piv =i; 
                    break;
                }
            }
            if(piv>0){
            for(int i= n-1;i>=0;i--){
                if(nums[i]>nums[piv]){
                    int temp = nums[piv];
                    nums[piv] =nums[i];
                    nums[i] = temp;
                    break;
                }
               
            }
        }else{
            
            Collections.reverse(Arrays.asList(nums));
        }
        Arrays.sort(nums,piv+1,n);
            
     
    }
    public static void main(String args[]){
        int nums[] = {1,2,3,6,5,4};
        int n = nums.length;
                for(int i =0;i<n;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println();
            nextPermutation(nums, n);
        for(int i =0;i<n;i++){
            System.out.print(nums[i]+" ");
        
            
        }
        }
    }
    


  
    

