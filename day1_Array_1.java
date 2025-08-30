package dsajava;

import java.util.Arrays;

public class day1_Array_1 {
    //Q.2 find missin and repeted values
    public static int[]  findMissingAndRepeted(int [][]nums){
        int n = nums.length;
        int ix =0;
        int missing =0;int repiting =0;
        int arr[] = new int [n*n];
        for(int i =0;i<nums.length;i++){
            for(int j =0;j<nums[0].length;j++){
                arr[ix] = nums[i][j]; ix++;
            }
        }
        //Repeting values
        for(int i =0;i<arr.length;i++){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    repiting =arr[j];
                }
            }
        }
     // misssing number 
     int expectedNuber =n*n;
     for(int i =1;i<=expectedNuber;i++){
        int count =0;
        for(int j =0;j<arr.length;j++){
            if(i ==arr[j]){
                count++;
            }
        }
        if(count ==0){
            missing =i;
        }
     }

      return new int[] {repiting,missing};
    
    }
    public static void main(String args[]){
    int nums[][] = {{1,3},{2,2}};
   // System.out.println(Arrays.deepToString(nums));
    System.out.println(Arrays.toString(findMissingAndRepeted(nums)));
 
   

    }
}
    

