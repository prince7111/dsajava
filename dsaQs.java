package dsajava;
public class dsaQs {
    public static boolean  isTwice(int nums[]){
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
    public static void main(String args[]){
       int nums[] = {1,1,3,3,4,3,2,4,2};
       System.out.println(isTwice(nums));


      
    
    }
}
