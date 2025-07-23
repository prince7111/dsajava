package dsajava;

public class arrayFirs{
    // public static int linearSearch(int array[],int key){
    //     for(int i =0; i<array.length; i++){
    //         if(array[i] == key){
    //             return i;
    //         }
    //     }
    //     return -1;

    // }  
     //Q.2 largest Number FIND 
    // public static int largestNumber(int array2 []){
    //     int largest =0;
    //     for(int i =0;i<array2.length; i++){
    //         if(array2[i] > largest){
    //             largest = array2[i];
    //         }

    //     }
    //     System.out.println("largest number is:"+largest);
    //     return 1;

    //     }
        //Q.3 Binary Search
        // public static int binarySearch(int array3 [], int key){
        //     int start =0; int end = array3.length-1;
        //     while(start<= end){
        //         int mid = (start+end)/2;
        //         if(array3[mid]== key){
        //             return mid;
        //         }else if(array3[mid] < key){
        //             start = mid+1;
        //         }else{
        //             end = mid-1;
        //         }
        //     }
        //     return -1;
        // }

        //print Sub array
    //     public static void printPairs(int array[]){
    //                for(int i=0; i<array.length; i++){
    //                for(int j =i+1; j<array.length; j++){
    //                System.out.print("("+array[i]+","+array[j]+")"+",");
    //               }
    //                 System.out.println();
    //    }

    //     }
         //Q.5 print all subarray
    //     public static void subArray(int array[]){
    //          int n = array.length-1;
    //    for(int i =0;i<n ;i++){
    //     for(int j =i;j<=n;j++){
          

       
    //     for(int k=i;k<=j;k++){
    //         System.out.print(array[k]+" ");
    //     }
    //     System.out.println();
    //     }
    //    }
     

    //
    
    public static void main(String args[]){       
        int arr[]   = {2,4,6,8,10};int n = arr.length-1;
        for(int i=0;i<=n; i++){
          
            for(int j=i; j<=n; j++){
                for(int k=i; k<=j; k++){
                    
                    System.out.print(arr[k]+" ");
                }
                            System.out.println();
            }

        }    
    }
}
