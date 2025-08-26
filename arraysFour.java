package dsajava;
import java.util.*;
public class arraysFour {
    public static int subArraySumEqalsK(int nums[],int k){
        int tct =0;
        for(int i =0;i<nums.length;i++){
            int cSum =0;
            for(int j =0;j<=i;j++){
                cSum +=nums[j];
                if(cSum ==k){
                    tct++;
                    break;
                }
                
            }
        }
        return tct;
    }
    public static int findDuplicate(int nums[]){ 
        int duplicate = -1;
        for(int i =0;i<nums.length;i++){
           
            
            for(int j =0; j<nums.length;j++){
                if(i != j && nums[i]==nums[j]){
                    duplicate =nums[j];

                }
            }
        }
        return duplicate;
    }
    public static int findDuplicat(int nums[]){
        Set<Integer> set = new HashSet<>();
        for(int i =0;i<nums.length;i++){
            int nb =nums[i];
          
          if(set.contains(nb)){
            return nb;
          }
            set.add(nb);
          
        
        }
        return -1;
    
        
    }
    public static boolean searchMatrix(int matrix[][],int target){
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {//August
        //Input: matrix = [[1,4,7,11,15],[2,5,8,12,19],[3,6,9,16,22],[10,13,14,17,24],[18,21,23,26,30]], target = 5
        int matrix[][]= {{1,4,7,11,15},
                          {2,5,8,12,19},
                          {3,6,9,16,22},
                          {10,13,14,17,24},
                          {18,21,23,26,30}};
        int target =5;

        System.out.println(searchMatrix(matrix, target));
      
      

    }
    
}
