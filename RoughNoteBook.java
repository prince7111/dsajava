package dsajava;

import java.util.*;

public class RoughNoteBook{
// //   public static void bubbleSort(int arr[]){
// //     for(int i =0; i<arr.length-1;i++){
      
// //         for(int j =0;j<arr.length-1-i;j++){
// //             if(arr[j]>arr[j+1]){
// //                 int temp = arr[j];
// //                 arr[j] = arr[j+1];
// //                 arr[j+1] = temp;
// //             }
// //         }
// //     }
// // }
//   // public static void selectionSort(int arr[]){
//   //   for(int i =0; i<arr.length-1;i++){
      
//   //     int minPos =i;
//   //       for(int j =i+1;j<arr.length;j++){
//   //         if(arr[minPos]> arr[j]){
//   //           minPos =j;
//   //         }
//   //           }
//   //           int temp = arr[minPos];
//   //           arr[minPos] = arr[i];
//   //           arr[i] = temp;
//   //       }
//   //   }


//     // public static void insertionSort(int arr[]){
//     //   for(int i =1;i<arr.length;i++){
//     //     int current = arr[i];
//     //     int previos = i-1;
//     //     while(previos>=0 && arr[previos]> current){
//     //       arr[previos+1] = arr[previos];
//     //       previos--;
//     //     }
//     //     arr[previos+1] = current;
//     //   }
//     // }
//     // public static void countSort(int arr[]){
//     //   int larg = Integer.MIN_VALUE;
//     //   for(int i =0; i<arr.length;i++){
//     //     larg = Math.max(arr[i], larg);
//     //   }
//     //   int count[] = new int[larg+1];
//     //   for(int i=0; i<arr.length;i++){
//     //     count[arr[i]]++;
//     //   }
//     //   //sort 
//     //   int j =0;
//     //   for(int i =0; i<count.length;i++){
//     //     while (count[i]>0) {
//     //       arr[j] =i;
//     //       j++;
//     //        count[i]--;
//     //     }
       
//     //   }
//     // }
//     public static void bubbleSort(int arr[]){
//       for(int i =0; i<arr.length-1;i++){
//         for(int j =0; j<arr.length-1-i;j++){
//           if(arr[j]>arr[j+1]){
//             int temp =arr[j];
//             arr[j] = arr[j+1];
//             arr[j+1] = temp;
//           }
//         }
//       }
//     }
//     public static void prntFunction(int arr[]){
//       for(int i =0; i<arr.length;i++){
//         System.out.print(arr[i]+" ");
//       }
//     }
//     public static void spiralMatrixPrint(int matrix[][],int m,int n){
//       int startRow =0;
//       int endRow =m-1;
//       int startCol =0;
//       int endCol =n-1;
//       while(startRow<=endRow && startCol <= endCol){
//         //top boundry 
//         for(int j =startCol; j<=endCol;j++){
//           System.out.print(matrix[startRow][j]+" ");
//         }
//         //right 
//         for(int i =startRow+1; i<=endRow;i++){
//           System.out.print(matrix[i][endCol]+" ");
//         }
//         //bottom
//         for(int j =endCol-1;j>=startCol;j--){
//           System.out.print(matrix[endRow][j]+" ");
//           if(startRow==endRow){
//             break;
//           }
//         }
//         //left
//         for(int i = endRow-1;i>=startRow+1;i--){
//           System.out.print(matrix[i][startCol]+" ");
//              if(startCol==endCol){
//             break;
//           }
//           }
//          startRow++;
//           endRow--;
//           startCol++;
//           endCol--;
//         }System.out.println();
//     }
//     public static int maximumSSum(int array[]){
//       int cs =0;
//       int mSum=Integer.MIN_VALUE;
//       for(int i =0; i<array.length;i++){
//             cs +=array[i];
//             if(cs<0){
//               cs =0;
//             }
//             mSum = Math.max(mSum,cs);
//       }
//       return mSum;
//     }
//     public static boolean searchInTwoDMatrix(int matrix[][],int key){
//       int row =0; int col =matrix[0].length-1;
//       while(row<=matrix.length-1 && col>=0){
//         if(matrix[row][col]==key){  
//           System.out.println("the key is at index"+row+","+col);
//           return true;
        
//         }else if(matrix[row][col]>key){
//           col--;
//         }else{
//           row--;
//         }
//       }
//       System.out.println("key not found");
//       return false;
//     }
//     public static int containerWithmostWater(int height[]){
//       int maxwater = Integer.MIN_VALUE;
//       for(int i =0;i<height.length;i++){
//         for(int j =i+1;j<height.length;j++){
//           int h = Math.min(height[i], height[j]);
//           int b = j-i;
//           int curWaterArea =h*b;
//           maxwater = Math.max(curWaterArea, maxwater);
//         }
//       }
//       return maxwater;
//     }
  public List<List<Integer>> foursumH(int nums[],int target){
        ArrayList<ArrayList<Integer>> findiTriplet = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i =0; i<n;i++){
          if(i>0 && nums[i]== nums[i-1])continue;
          for(int j =i+1;j<n;){
            int p =j+1;
            int q =n-1;
            while(p<q){
              long sum = (long)(nums[i]+nums[j]+nums[p]+nums[q]);
              if(sum<target){
                p++;
              }else if(sum>target){
                q--;
              }else{
                ArrayList<Integer> curTriplet = new ArrayList<>();
                curTriplet.add(nums[i]);  curTriplet.add(nums[j]);  curTriplet.add(nums[p]);  curTriplet.add(nums[q]);
                findiTriplet.add(curTriplet);
                p++;q--;
                while(p<q && nums[p]==nums[p-1]){
                  p++;
                }
              }
            }
            j++;
            while (j<n && nums[j]==nums[j-1]){
              j++;
            }
          }
        }
         List<List<Integer>> ans = new ArrayList<>(findiTriplet);
         return ans;



  }
  public static int cuntVovels(String v,String u){
        int count =0;
        for(int i=0; i<v.length();i++){
            for(int j =0; j<u.length();j++){
                if(v.charAt(i)==u.charAt(j)){
                    count++;
                }
            }
        }
    
    return count;

    
    }
    public static boolean isAnargam(String s1,String s2){
      boolean isAnar = true;
      if(s1.length()!=s2.length()){return false;}

      for(int i =0;i<s1.length();i++){
        int count =0;
        for(int j =0; j<s1.length();j++){
          if(s1.charAt(i)!=s2.charAt(j)){
            count++;
          }else{
            System.out.println("..");
          }
        }
        if(count==s1.length()){
          isAnar =false;
        }
      }
      return isAnar;

    }
     public static void main(String[] args) {
      String s1 = "prince";
      String s2 = "price";
      System.out.println(isAnargam(s1, s2));
    
      
      
     }
    }
  
  
