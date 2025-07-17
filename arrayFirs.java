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
    public static void main(String args[]){
        System.out.println("hello world {1}");
        System.out.println("|| Java || DSA Ch.1 || Arrays || ");
        //Q.1 Linear Search 
        int array [] = {2,4,6,8,10,12,14};
        int key =10;
        int index = linearSearch(array, key);
        if(index == -1){
            System.out.println("key is not found");

            }else{
                System.out.println("key is at index "+ index);
            }
        }
        
    }
