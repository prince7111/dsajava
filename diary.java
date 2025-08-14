package dsajava;

import java.util.Arrays;

public class diary {
    // public static boolean  searchKey(int mat[][],int key){
    //       for(int i =0;i<mat.length;i++ ){
    //             for(int j =0; j<mat[0].length;j++){
    //             if(mat[i][j]==key){
                
    //                 System.out.println("the key is at index:"+i+","+j);  
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    
    // }
    // public static int min(int mat[][]){
    //     int mini = Integer.MAX_VALUE;
    //     for(int i =0; i<mat.length;i++){
    //         for(int j =0; j<mat[0].length;j++){
    //             if(mini > mat[i][j]){
    //                 mini = mat[i][j];
    //             }

                
    //         }
    //     }
    //     return mini;
    // }
    public static int[] findmissingAndRepetead(int grid[][]){
        int row =grid.length;
        int col =grid[0].length;
        int totalnum =row*col;
      
        int arr2[] = new int [totalnum];
        int index=0;
       for(int i  =0 ;i<row;i++){
        for(int j =0; j<col;j++){
            arr2[index] = grid[i][j];
            index++;
        }
    }
    int miss=-1;
    int rep =-1;
    for(int i =1; i<=totalnum;i++){
        int count =0;
        for(int j =1 ;j<=totalnum;j++){
            if(arr2[i]==arr2[j]){
                count++;
                if(count>1){
                    rep =arr2[j];

                }else if(count<0){
                    miss =i;
                }
            }
        }
    }
      
        return  new int []{miss,rep};

        

    }
    public static void main(String args[]){
          int grid[][] = {{1,3},{2,2}};
            int[] result = findmissingAndRepetead(grid); // फंक्शन को कॉल करके रिजल्ट को एक एरे में स्टोर करें

    // सही तरीके से एरे को प्रिंट करें
    System.out.println(Arrays.toString(result));
}

          

    }
    

