package dsajava;
public class arraysFour {
    public static int subArraySumEqalsK(int nums[],int k){
        int tct =0;
        for(int i =0;i<nums.length;i++){
            int cSum =0;
            for(int j =0;j<=i;j++){
                cSum +=nums[j];
                if(cSum ==k){
                    tct++;
                }
                
            }
        }
        return tct;
    }
    public static void main(String[] args) {//August
        //Q1 subArry sum eqals K
        //Q2 Find Duplicate
        //Q3 Spiral Matrix
        //Q4 Search in Sorted matrix II
        //Q6 Search in Sorted matrix II

        System.out.println("hello world");
        System.out.println("||java dsa || Arrays 4:");
        int nums[]= {1,1,1};
         int k =2;
         //answer =2;
         System.err.println(subArraySumEqalsK(nums, k));

    }
    
}
