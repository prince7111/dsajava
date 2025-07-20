package dsajava;
public class arrayEasy{
    public static int majorityEle(int nums[]){
        int major =nums[0];int count=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]== major){
                count++;
            }else if(count < 0){
                major = nums[i]; count++;
            }else{
                count--; 
            }
        }
        if(count >=0){
            return major;
        }
        return -1;
    }
    public static void main(String args[]){
        System.out.println("Hello World"+"java dsa problem 1 \\majority element");
        int nums[] = {3,2,3};
        System.out.println(majorityEle(nums));
        
        //
    }
}
