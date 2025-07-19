package dsajava;

public class arrayTwo{
    //subarray
    public static void subArray(int array[]){
        
        for(int i =0; i< array.length;i++){
            for(int j=i; j<array.length;j++){
                for(int k =i;k<=j; k++){
                    System.out.print(array[k]+" ");
                }
                System.out.println(); 
            }
        }
    }
    public static void subArrSum(int array[]){
            for(int i =0; i< array.length;i++){
            for(int j=i; j<array.length;j++){
                int currSum =0;
                for(int k =i;k<=j; k++){
                    System.out.print(array[k]+" ");
                    currSum+= array[k];
                } System.out.println();
                System.out.println("current Sum ="+currSum);
                
            }
        }

    }
    public static void main(String args[]){
       // System.out.println("Hello world (I)");
       //System.out.println("|| JAVA || dsa Ch.1 || Arrays, part II ||");
        //Q.1 print and sum of subarray
        int array [] = {2,4,6,8,10};
        // subArray(array);
        subArrSum(array);
    }
}