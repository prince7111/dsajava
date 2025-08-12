package dsajava;
import java.util.*;

public class arrayEasy1 {
    public static int majorityElement(int nums[]){
        int maj = nums.length/2;
        Arrays.sort(nums);
        return nums[maj];
    


    }
    public static void main(String args[]){
    System.out.println("hello world");
    System.out.println("|| Java dsa|| Arrays 1 || Questions 1 to 5  ||");
   
    int nums[] = {2,2,1,1,1,2,2};
    System.out.println(majorityElement(nums));
   
    

    }
    
}
