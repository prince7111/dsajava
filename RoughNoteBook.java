package dsajava;

public class RoughNoteBook{
//   public static void bubbleSort(int arr[]){
//     for(int i =0; i<arr.length-1;i++){
      
//         for(int j =0;j<arr.length-1-i;j++){
//             if(arr[j]>arr[j+1]){
//                 int temp = arr[j];
//                 arr[j] = arr[j+1];
//                 arr[j+1] = temp;
//             }
//         }
//     }
// }
  public static void selectionSort(int arr[]){
    for(int i =0; i<arr.length-1;i++){
      
      int minPos =i;
        for(int j =i+1;j<arr.length;j++){
          if(arr[minPos]> arr[j]){
            minPos =j;
          }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }


    public static void main(String args[]){ 
      int arr[] = {5,4,1,3,2};
      selectionSort(arr);
      
      for(int i =0; i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
    }
  }
  
