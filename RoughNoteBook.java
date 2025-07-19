package dsajava;
public class fetchcode {
    public static void totalSubArrayCount(int array[]){
                int n = array.length;     
      
        for(int i =0; i<n; i++){
            int ts =0;
            for(int j=i; j<n; j++){ 
                for(int k =i; k<=j; k++){
                    System.out.print(array[k]+" ");
                }
                ts++;
                System.out.println();
            } 
            System.out.println("ts ;"+ts);                       
        }
    }    
    
    public static void main(String args[]){
        int array[] = {1,2,3,4,5};
        int maxSubArray ;
        for(int i =0; i<array.length; i++){
            int ts =0;
           
            for(int j=i; j<array.length; j++){
                 int currSum =0;
                for(int t=i; t<=j; t++){
                    System.out.print(array[t]+" ");
                    currSum+= array[t];

                }  
               System.out.print("cS:"+currSum);
                ts++;
                System.out.println(",ts:"+ts);
                  
            }
           
        }
    }

}
