package dsajava;
public class arrayEasy1 {
    public static int majorityElementOp(int nums[]){ // optimized
        int maj = nums[0];
        int count = 1;
        for(int i =1; i<nums.length; i++){
            if(nums[i]==maj){
                count++;
            }else if(count<=0){
                maj=nums[i];count=1;
            }else{
                count--;
            }
            

        }
        return maj;

    }
    // public static int majorityElement(int nums[]){ // brute force
    //     int maj = nums.length/2;
    //     Arrays.sort(nums);
    //     return nums[maj];
    //     }
    public static void main(String args[]){
     System.out.println("|| Java dsa || Arrays 1 || Questions 1 to 5  ||");
   
    int nums[] = {2,2,1,1,1,2,2};
    System.out.println(majorityElementOp(nums));
   // System.out.println(majorityElement(nums));
   
    

    }
    
}
