package dsajava;

public class arrayTwo{
       // System.out.println("Hello world (I)");
       //System.out.println("|| JAVA || dsa Ch.1 || Arrays, part II ||");
        //subarray
    // public static void subArray(int array[]){
        
    //     for(int i =0; i< array.length;i++){
    //         for(int j=i; j<array.length;j++){
    //             for(int k =i;k<=j; k++){
    //                 System.out.print(array[k]+" ");
    //             }
    //             System.out.println(); 
    //         }
    //     }
    // }
    // //Q.1 subarray sum
    // // public static void subArrSum(int array[]){
    // //         for(int i =0; i< array.length;i++){
    // //         for(int j=i; j<array.length;j++){
    // //             int currSum =0;
    // //             for(int k =i;k<=j; k++){
    // //                 System.out.print(array[k]+" ");
    // //                 currSum+= array[k];
    // //             } System.out.println();
    // //             System.out.println("current Sum ="+currSum);
                
    // //         }
    // //     }

    // // }
    
    // //Q.2 MAX SUBARRAY SUM
    // // public static void maxSubArraySum(int array[]){
    // //     int maxSum =Integer.MIN_VALUE;
    // //                 for(int i =0; i< array.length;i++){
    // //         for(int j=i; j<array.length;j++){
    // //             int currSum =0;
    // //             for(int k =i;k<=j; k++){
    // //                 System.out.print(array[k]+" ");
    // //                 currSum+= array[k];
    // //             } 
    // //             System.out.println();
    // //             System.out.println("curent sum ="+currSum);
    // //             if(currSum > maxSum){
    // //                 maxSum = currSum;

    // //             }                
    // //         }            
    // //     }
    // //     System.out.println("your maxSubArray sum is ="+maxSum);
    // // }
    // // //Q.3 MINIMUM SUB ARRAYA KA SUM 
    // // public static void minSubArraySum(int array[]){
    // //             int minSum =Integer.MAX_VALUE;
    // //                 for(int i =0; i< array.length;i++){
    // //         for(int j=i; j<array.length;j++){
    // //             int currSum =0;
    // //             for(int k =i;k<=j; k++){
    // //                 System.out.print(array[k]+" ");
    // //                 currSum+= array[k];
    // //             } 
    // //             System.out.println();
    // //             System.out.println("curent sum ="+currSum);
    // //             if(currSum < minSum){
    // //                 minSum = currSum;

    // //             }                
    // //         }            
    // //     }
    // //             System.out.println("your minSubArray sum is ="+minSum);
        

    // // }
    //       // max sub array sum 
    //       public static void maxSubArray(int array[]){
    //         int ms = Integer.MIN_VALUE;
    //         int cs = 0;
    //         for(int i =0; i< array.length;i++){             
    //           for(int j =i; j<array.length; j++){
    //                     cs =0;
    //             for(int k =i; k<=j; k++){
               
    //               cs += array[k];
    //             }
    //          System.out.println(cs);
    //             if(ms<cs){
    //               ms = cs;
    //             }
              
    //           }
    //         }
    //         System.out.println("our maximum sum is ="+ms);
    //       }
    //       public static void prefixMs(int array[]){
    //         int cs =0;
    //         int ms = Integer.MIN_VALUE;
    //         int prefix [] = new int [array.length];
    //         //creat prefix array
    //         prefix[0] = array[0];
    //         for(int i =1;i<array.length;i++){
    //           prefix[i] = prefix[i-1]+array[i];
    //         } 
    //         for(int i =0; i<array.length;i++){ 
             
    //           for(int j =0; j<array.length;j++){
    //             cs =0;
               
    //             cs = i==0?prefix[j]:prefix[j]-prefix[i-1];
    //             if(ms<cs){
    //               ms = cs;
    //             }
                
    //           }

    //         }
    //         System.out.println("our max sub array sum is ="+ms);
    //       }
    //       //max sub array sum kadanes algorithm 
    //       public static void kadanesalgorithm(int array[]){
    //         int cs =0;
    //         int ms =Integer.MIN_VALUE;
    //         for(int i =0;i<array.length;i++){
    //           cs = cs+array[i];
    //           if(cs <0){
    //             cs =0;
    //           }  System.out.println("currSum"+cs);
    //           ms = Math.max(cs, ms);
    //            System.out.println("mas sub arrya sum "+ms);
    //         }
    //         System.out.println("our max sub array sum "+ms);
    //       }
          //Arrays part 2 || Q.4 || Traping rain water

    public static int trapingrainWater(int height[]){
      int trapwater =0;
      //left maximum bar
      int leftMax[] = new int [height.length];
      leftMax[0] = height[0];
      for(int i=1; i<height.length; i++){
        leftMax[i] = Math.max(leftMax[i-1], height[i]);
      }
      //right max bar 
      int rightMax[] = new int [height.length];
      rightMax[height.length-1] = height[height.length-1];
      for(int i =height.length-2; i>=0; i--){
        rightMax[i] = Math.max(rightMax[i+1],height[i]);
      }
      //water leeval;
      for(int i =0; i<height.length; i++){
        int waterlevel = Math.min(leftMax[i], rightMax[i]);
        trapwater += waterlevel - height[i];
      }
      //
      System.out.println("Answers :"+trapwater);
      return trapwater;
      
    }
    public static void main(String args[]){
        //traping rain water
         int height[] = {4,2,0,6,3,2,5}; // HEIGHT OF BAR
         System.out.println((trapingrainWater(height)));
         System.out.println("compleate 3d");
        
        
        
       
    }
}