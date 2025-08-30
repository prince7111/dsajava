package dsajava;

import java.util.Arrays;
import java.util.HashMap;
 public class day1_Array_1 {
//     //Q.2 find missin and repeted values
//     public static int[]  findMissingAndRepeted(int [][]nums){
//         int n = nums.length;
//         int ix =0;
//         int missing =0;int repiting =0;
//         int arr[] = new int [n*n];
//         for(int i =0;i<nums.length;i++){
//             for(int j =0;j<nums[0].length;j++){
//                 arr[ix] = nums[i][j]; ix++;
//             }
//         }
//         //Repeting values
//         for(int i =0;i<arr.length;i++){
//             for(int j =i+1;j<arr.length;j++){
//                 if(arr[i]==arr[j]){
//                     repiting =arr[j];
//                 }
//             }
//         }
//      // misssing number 
//      int expectedNuber =n*n;
//      for(int i =1;i<=expectedNuber;i++){
//         int count =0;
//         for(int j =0;j<arr.length;j++){
//             if(i ==arr[j]){
//                 count++;
//             }
//         }
//         if(count ==0){
//             missing =i;
//         }
//      }

//       return new int[] {repiting,missing};
    
//     }
      public static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n =grid.length;int m =0;int r=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j =0;j<grid[0].length;j++){
                int number =grid[i][j];
                if(map.containsKey(number)){
                    map.put(number, map.get(number)+1);
                }else{
                    map.put(number,1);
                }

            }
        }
        int expNum =n*n;
        for(int i =1;i<=expNum;i++){
            if(map.containsKey(i)){
            if(map.get(i)==2){
                r =i;
            }
            }    if(!map.containsKey(i)){
                m=i;
               

            }
        
        
    }
        System.err.println("rep , mis"+r+","+m);
        return new int[] {r,m};
        
        
    }
    public static void main(String args[]){
    int grid[][] = {{1,3},{2,2}};
    
    System.out.println(Arrays.toString(findMissingAndRepeatedValues(grid)));
 
 
   

    }
}
    

