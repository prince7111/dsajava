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
        //Q.3 Binary Search
        public static int binarySearch(int array3 [], int key){
            int start =0; int end = array3.length-1;
            while(start<= end){
                int mid = (start+end)/2;
                if(array3[mid]== key){
                    return mid;
                }else if(array3[mid] < key){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
            return -1;
        }
    public static void main(String args[]){
        int array3 [] = {2,4,6,8,10,12};
        int key =11;
        System.out.println("the key is at indesx "+binarySearch(array3, key));
;
     
        }
        
    }
