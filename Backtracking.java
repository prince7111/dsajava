package dsajava;
public class Backtracking {

    //Question 1: backrraking arrays
    public static void changeArr(int arr[],int i,int val){
        //base case
        if(i == arr.length){
            printArr(arr);
            return;
        }
        //winding & recurion
        arr[i] = val;        
        changeArr(arr, i+1, val+1);
        //baktracking & unwinding
        arr[i] = arr[i]-2;              
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.err.println();
    }
    public static void main(String args[]){
        System.out.println("Hello world,coding 4 Nov,2025");
        System.out.println("Backtracking");
        int arr[] = new int[10];
        changeArr(arr, 0,1);
        printArr(arr);
    }
}
