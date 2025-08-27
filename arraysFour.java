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
    public static boolean searchMatrixOptimal(int[][] matrix, int target) {
    int row = matrix.length-1,col =0;
    while(row>=0 && col<=matrix[0].length-1){
        if(matrix[row][col]==target){
            return true;
        }else if(matrix[row][col]> target){
            row--;
        }else{
            col++;
        }
        
    }
    return false;
    }
public static void spiralMatrix(int matrix[][]){
    int stRow =0;int endRow = matrix.length;
    int stCol =0;int endCol =matrix[0].length;
    while(stRow <=endRow && stCol<=endCol){
        int row =stRow;
        for(int j =stCol;j<endCol;j++){
            System.out.print(matrix[row][j]+" ");
        }
        int col = endCol-1;
        for(int i =stRow+1;i<endRow;i++){
            System.out.print(matrix[i][col]+" ");

        }
         row =endRow-1;
        for(int j =endCol-2;j>=stCol;j--){
            System.out.print(matrix[row][j]+" ");
        }
        col =stCol;
        for(int i=endRow-2; i >=stRow+1; i--){
            System.out.print(matrix[i][col]+" ");
        }
         stRow++;endRow--;stCol++;endCol--;
    }            
    
}
public static void spiralMatDry(int matrix[][]){
    int str =0;int endr =matrix.length-1;int endc =matrix[0].length-1;int stc =0;
    while(str<=endr && stc<=endc){
        //top boundry
        for(int j =stc;j<=endc;j++){
            System.out.print(matrix[str][j]+" ");
        }
        for(int i =str+1; i<=endr;i++){
            System.out.print(matrix[i][endc]+" ");
        }
        //BoTtom boundry
        for(int j =endc-1;j>=stc;j--){
            System.out.print(matrix[endr][j]+" ");
            // if(str ==endr){
            //     break;
            // }
        }
        for(int i =endr-1;i>=str+1;i--){
            System.out.print(matrix[i][stc]+" ");
        //       if(stc ==endc){
        //         break;
        // }
       
    } stc++;
        str++;
        endc--;
        endr--;
    
}
}
    public static void main(String[] args) {
    int matrix[][]= {{1,2,3,1,2}, 
                     {4,5,6,7,8,},
                     {7,8,9,3,3,},
                    { 2,3,6,5,2},
                     {2,3,4,3,2}};
      spiralMatDry(matrix);
    }
    
}
