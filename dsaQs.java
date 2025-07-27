package dsajava;

public class dsaQs {
    //dsa || Array assignment Q.1 || isTwice 
    // public static boolean  isTwice(int nums[]){ 
    //     //System.out.println("Array part II || Assignment Q.1 || isTWice retun treue");
    //    // System.out.println("java dsa || Assignment || Quesions ||");
       

    //    boolean res =false;
        
    //     for(int i =0;i<nums.length;i++){
    //         int oprt = nums[i];
    //         for(int j =0;j<nums.length;j++){
    //             if(((oprt ^ nums[j])==0)&& (i!=j)){
    //                 return true;
                    

    //             }
    //         }
        
    //     } 
    //     return res;  
        
    // }
    //   // ARRAYS ASSIGNMENT Q. 2
    //   //july 2025
    // public static int findIdx(int nums[],int target){ 
    //     for(int i=0;i<nums.length; i++){
    //         if(nums[i]==target){
    //             System.out.println("our target"+target+"'s index is ="+i);
    //             return i;
    //         }
    //     }
    //     return -1;

    // }
    //                // Q.3 CALCULATE MAXIMUM PROFIT

    // public static int calCprofit(int price[]){
    //     int bysPrice =Integer.MAX_VALUE;
    //     int maxProfit = 0;
    //     for(int i=0; i<price.length;i++){
    //         if(bysPrice < price[i]){
    //             int profit = price[i]-bysPrice;
    //             maxProfit = Math.max(maxProfit,profit);
    //         }else{
    //             bysPrice = price[i];
    //         }
            
    //     }
    //     return maxProfit;

    // }
    // //Q.4 Given a non negeatic repesentin map where th width os each bar is ,compute how
    // // much water it can trap after raining
    // public static int calCTrapwater(int height[],int n){
    //     int trpWater =0;
    //     //calculate left max bounry
    //     int leftMax[] = new int [n];
    //     leftMax[0] = height[0];
    //     for(int i=1;i<n;i++){
    //         leftMax[i] = Math.max(leftMax[i-1],height[i]);
    //     }
    //     //CALCULATE RIGHT MAX BOUNDRY
    //     int rightMax[] = new int [n];
    //     rightMax[n-1] = height[n-1];
    //     for(int i =n-2; i>=0; i--){
    //         rightMax[i] = Math.max(rightMax[i+1],height[i]);
    //     }
    //     for(int i =0; i<n ; i++){
    //         int waterlevel = Math.min(leftMax[i],rightMax[i]);
    //         trpWater += waterlevel - height[i];
    //     }
    //     System.out.println("our output is:");
    //     return trpWater;


    // }
    // //Q.5 compute the power of X^n
    // public static int calculatepow(int x,int n){
    //     int binary =n;
    //     int ans =1;
    //     if(binary< 0){
    //         x = 1/x;
    //         binary =-binary;
    //     }
    //     while(binary>0){
    //         if(binary % 2 ==1){
    //             ans*=x;
    //         }
    //         x*=x;
    //         binary = binary/2;
    //     }
    //     System.out.println(ans);
    //     return ans;
    // kadanes algorithm
    // public static int maxSubArrayKad(int arr[]){
    //     int cs =0;
    //     int maxSubArraySum =Integer.MIN_VALUE;
    //     for(int i =0; i<arr.length;i++){
    //         cs += arr[i];
    //         if(cs < 0){
    //             cs =0;

    //         }
    //         maxSubArraySum = Math.max(cs, maxSubArraySum);

    //     }
    //     return maxSubArraySum;

    // }
    // public static boolean  searchTarget(int matrix [][],int t){
    //     for(int i =0;i<matrix.length;i++){
    //         for(int j =0; j<matrix[0].length;j++){
    //             if(t == matrix[i][j]){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }
    public static boolean  staircaesearch(int matrix[][],int t){
        int row =0; int col = matrix[0].length-1;
        while (row< matrix.length && col>=0){
            if(matrix[row][col]==t){
                return true;
               
                
            }else if(t<matrix[row][col]){
                col--;
            }else{
                row--;
            }
        }
        return false;
    }
    public static void main(String args[]){
        System.out.println("hello World");//
        System.out.println("Java +Dsa, ArrayS Questions,day 2 || Q.8 || Search in 2-D matrix");//27 july 20250
        int matrix[][] = {{1,3,5,7},{10,11,16,20},{23,30 ,34,60}};int t =3;
        System.out.println(staircaesearch(matrix, t));
      

    }
}
