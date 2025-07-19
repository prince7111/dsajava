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
    //Q.1 subarray sum
    // public static void subArrSum(int array[]){
    //         for(int i =0; i< array.length;i++){
    //         for(int j=i; j<array.length;j++){
    //             int currSum =0;
    //             for(int k =i;k<=j; k++){
    //                 System.out.print(array[k]+" ");
    //                 currSum+= array[k];
    //             } System.out.println();
    //             System.out.println("current Sum ="+currSum);
                
    //         }
    //     }

    // }
    
    //Q.2 MAX SUBARRAY SUM
    public static void maxSubArraySum(int array[]){
        int maxSum =Integer.MIN_VALUE;
                    for(int i =0; i< array.length;i++){
            for(int j=i; j<array.length;j++){
                int currSum =0;
                for(int k =i;k<=j; k++){
                    System.out.print(array[k]+" ");
                    currSum+= array[k];
                } 
                System.out.println();
                System.out.println("curent sum ="+currSum);
                if(currSum > maxSum){
                    maxSum = currSum;

                }                
            }            
        }
        System.out.println("your maxSubArray sum is ="+maxSum);
    }
    public static void minSubArraySum(int array[]){
                int minSum =Integer.MAX_VALUE;
                    for(int i =0; i< array.length;i++){
            for(int j=i; j<array.length;j++){
                int currSum =0;
                for(int k =i;k<=j; k++){
                    System.out.print(array[k]+" ");
                    currSum+= array[k];
                } 
                System.out.println();
                System.out.println("curent sum ="+currSum);
                if(currSum < minSum){
                    minSum = currSum;

                }                
            }            
        }
                System.out.println("your minSubArray sum is ="+minSum);
        

    }
    
    public static void main(String args[]){
        int array[] = {2,4,6,8,10};
        minSubArraySum(array);
     
        
    }
}