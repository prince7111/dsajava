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
  // public static void selectionSort(int arr[]){
  //   for(int i =0; i<arr.length-1;i++){
      
  //     int minPos =i;
  //       for(int j =i+1;j<arr.length;j++){
  //         if(arr[minPos]> arr[j]){
  //           minPos =j;
  //         }
  //           }
  //           int temp = arr[minPos];
  //           arr[minPos] = arr[i];
  //           arr[i] = temp;
  //       }
  //   }


    // public static void insertionSort(int arr[]){
    //   for(int i =1;i<arr.length;i++){
    //     int current = arr[i];
    //     int previos = i-1;
    //     while(previos>=0 && arr[previos]> current){
    //       arr[previos+1] = arr[previos];
    //       previos--;
    //     }
    //     arr[previos+1] = current;
    //   }
    // }
    // public static void countSort(int arr[]){
    //   int larg = Integer.MIN_VALUE;
    //   for(int i =0; i<arr.length;i++){
    //     larg = Math.max(arr[i], larg);
    //   }
    //   int count[] = new int[larg+1];
    //   for(int i=0; i<arr.length;i++){
    //     count[arr[i]]++;
    //   }
    //   //sort 
    //   int j =0;
    //   for(int i =0; i<count.length;i++){
    //     while (count[i]>0) {
    //       arr[j] =i;
    //       j++;
    //        count[i]--;
    //     }
       
    //   }
    // }
    public static void bubbleSort(int arr[]){
      for(int i =0; i<arr.length-1;i++){
        for(int j =0; j<arr.length-1-i;j++){
          if(arr[j]>arr[j+1]){
            int temp =arr[j];
            arr[j] = arr[j+1];
            arr[j+1] = temp;
          }
        }
      }
    }
    public static void prntFunction(int arr[]){
      for(int i =0; i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
    }
    public static void spiralMatrixPrint(int matrix[][],int m,int n){
      int startRow =0;
      int endRow =m-1;
      int startCol =0;
      int endCol =n-1;
      while(startRow<=endRow && startCol <= endCol){
        //top boundry 
        for(int j =startCol; j<=endCol;j++){
          System.out.print(matrix[startRow][j]+" ");
        }
        //right 
        for(int i =startRow+1; i<=endRow;i++){
          System.out.print(matrix[i][endCol]+" ");
        }
        //bottom
        for(int j =endCol-1;j>=startCol;j--){
          System.out.print(matrix[endRow][j]+" ");
          if(startRow==endRow){
            break;
          }
        }
        //left
        for(int i = endRow-1;i>=startRow+1;i--){
          System.out.print(matrix[i][startCol]+" ");
             if(startCol==endCol){
            break;
          }
          }
         startRow++;
          endRow--;
          startCol++;
          endCol--;
        }System.out.println();
    }
    public static void main(String args[]){ 
      //spiral matrix
      int matrix[][] = {{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                        int m = matrix.length;
                        int n =matrix[0].length;
                        spiralMatrixPrint(matrix, m, n);
         
    }
  }
  
