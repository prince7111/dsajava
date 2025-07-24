package dsajava;
public class dsaQs {
    //dsa || Array assignment Q.1 || isTwice 
    public static boolean  isTwice(int nums[]){ 
        //System.out.println("Array part II || Assignment Q.1 || isTWice retun treue");
       // System.out.println("java dsa || Assignment || Quesions ||");
       

       boolean res =false;
        
        for(int i =0;i<nums.length;i++){
            int oprt = nums[i];
            for(int j =0;j<nums.length;j++){
                if(((oprt ^ nums[j])==0)&& (i!=j)){
                    return true;
                    

                }
            }
        
        } 
        return res;  
        
    }
      // ARRAYS ASSIGNMENT Q. 2
      //july 2025
    public static int findIdx(int nums[],int target){ 
        for(int i=0;i<nums.length; i++){
            if(nums[i]==target){
                System.out.println("our target"+target+"'s index is ="+i);
                return i;
            }
        }
        return -1;

    }
    public static void main(String args[]){
       int nums[] = {4,5,6,7,0,1,2};
        int target = 4;
        System.out.println(findIdx(nums, target));
        
      
    
    }
}
