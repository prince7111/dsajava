package dsajava;
public class arrayFirs{
    public static int linearSearch(int array[],int key){
        for(int i =0; i<array.length; i++){
            if(array[i] == key){
                return i;
            }
        }
        return -1;

    }  
     //Q.2 largest Number FIND 
    public static int largestNumber(int array2 []){
        int largest =0;
        for(int i =0;i<array2.length; i++){
            if(array2[i] > largest){
                largest = array2[i];
            }

        }
        System.out.println("largest number is:"+largest);
        return 1;

        }
    public static void main(String args[]){
        System.out.println("hello world {1}");
        System.out.println("|| Java || DSA Ch.1 || Arrays || ");
            int array2 [] = {1,2,6,3,5};
           System.out.println(largestNumber(array2)); 

        }
        
    }
