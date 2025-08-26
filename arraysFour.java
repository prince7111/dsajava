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

    public static void main(String[] args) {//August
        //Q1 subArry sum eqals K       %
        //Q2 Find Duplicate            %
        //Q3 Spiral Matrix 
        //Q4 Search in Sorted matrix II
        //Q6 Search in Sorted matrix II
        System.out.println("Arrays 4 : Q.4 || search in sorted matrix");
      
      

    }
    
}
