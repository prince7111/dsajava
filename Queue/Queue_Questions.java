public class Queue_Questions {
    public static void printBinaryOneTwoN(int n){
         for(int i =1;i<=n;i++){ //N time
            int number = i; //constant opearaion
            int pow =0;
            int bin =0;
            while(number !=0){ //N/2
                int ld = number%2;
             bin = bin +(int) Math.pow(10, pow) *ld;
               pow++;
                number = number / 2;
            }
            System.out.print(bin+",");
        }
    }
    public static void main(String args[]){
         printBinaryOneTwoN(20);
      
    }
    
}
