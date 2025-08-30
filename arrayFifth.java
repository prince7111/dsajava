package dsajava;

import java.util.ArrayList;

public class arrayFifth {
     public static int trapedHard(int h[] ){
         int water =0;
        int n = h.length;
//    left maximum bar array
        int lm[] =new int [n];
        lm[0]=h[0];
        for(int i =1;i<n;i++){
            lm[i] = Math.max(lm[i-1],h[i]);
        }
//    Right maximum bar / baoundry
        int rm[] = new int [n];
        rm[n-1] = h[n-1];
        for(int j =n-2; j>=0;j--){
            rm[j] = Math.max(rm[j+1],h[j]);
        }
// calculate trapping rain woater
         for(int i =0; i<n;i++){
            int wL = Math.min(lm[i],rm[i]);
            water+= wL-h[i];
         }

        return water; 
    }
    public static void  slidingWindowMaxiMum(int arr[]){
    ArrayList<Integer> list = new ArrayList<>();  
        //3,3,5,5,6,7
        int idx =0;int k=3;
        while(k<=arr.length){
            int largest =0;
            for(int i =idx;i<k;i++){
                largest =Math.max(largest, arr[i]);
            

            }
            list.add(largest);
         idx++;k++;

        }
       System.out.print(list);
   

    }

   
    
     public static  int reversePairs(int[] nums) {
        int numberOfReversePairs=0;
        for(int i =0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(nums[i]> 2*nums[j]){
                    numberOfReversePairs++;
                }
            }
        }
    return numberOfReversePairs;  
    }
     public static int largestRectangleArea(int[] heights) {// int heights[] = {2,1,5,6,2,3};
        int largeRA =0;
        for(int i =0;i<heights.length;i++){
            int h =heights[i];
            int w =1;
           int curRA =h*w;
            largeRA = Math.max(largeRA,curRA);
             //
             int j =i;
             while(j>0){
              int  h2 = Math.min(heights[j],heights[j-1]);
              int  w2 =2;
              int  curRA2= h2*w2;
                  
                   largeRA = Math.max(largeRA,curRA2);
                   j--;w++;
             }
        }
        return largeRA;
        
    }
    public static void findMisingAndRepetedValues(int grid[][]){
        int rep =-1;
        int missing =0;
        int n =grid.length;
        int idx =0;
        int gridNew[] = new int [n*n];
        
        //2d to 1d array
        for(int i =0;i<n;i++){
            for(int j =0;j<grid[0].length;j++){
                gridNew[idx] = grid[i][j];
                idx++;
                if(i>n){
                    break;
                }

            }
        }
            // for(int s =0;s<gridNew.length;s++){
            //     System.out.print(gridNew[s]+",");
            // }
            // System.out.println();
            //find repeted
            for(int k =0;k<gridNew.length;k++){
                for(int l =k+1;l<gridNew.length;l++){
                    if(gridNew[k]==gridNew[l]){
                        rep =gridNew[l];
                        System.out.println("our rep. no is:"+ rep);
                    }
                    
                }
            
            }
            //mising
            for(int m =1;m<=n*n;m++){
                for(int x =0;x<gridNew.length;x++){
                    if(m==gridNew[x]){
                    break;

                }else{
                    missing =m;
                    System.out.println("missing ="+missing);
                }
            }

        }
    
    }
    

    public static void main(String args[]){
        int grid[][] = {{1,3},{2,2}};
        findMisingAndRepetedValues(grid);



    }
}
