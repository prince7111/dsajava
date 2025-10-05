package dsajava;
public class Dev_Conq{
    // public static void mergeSort(int arr[], int si,int ei){
    //     if(si>=ei){
    //         return;
    //     }
    //     int mid = si+ (ei-si)/2;
    //     mergeSort(arr, si, mid);
    //     mergeSort(arr, mid+1, ei);
    //     merge(arr, si ,mid,ei);
    // }
    // public static void merge(int arr[],int si,int mid,int ei){
    //     int temp[] = new int [ei -si+1];
    //     int i = si;int j= mid+1;int k =0;
    //     while(i<=mid && j<=ei){
    //         if(arr[i]< arr[j]){
    //             temp[k] = arr[i];
    //             i++;
    //         }else{
    // //             temp[k] = arr[j];j++;
    // //         }
    //     //     k++;
    //     // }
    //     // while(i<=mid){
    //     //     temp[k++] = arr[i++];
    //     // }
    //     // while(j<=ei){
    //     //     temp[k++] = arr[j++];

    // //     }
    // //     for( k =0,i=si;k<temp.length;k++,i++){
    // //         arr[i] =temp[k];
    // //     }
    // // }
    // // public static void printArr(int arr[]){
    // //     for(int i =0;i<arr.length;i++){
    // //         System.out.print(arr[i]+" ");
    // //     }
    // // }
    // public static void quicSort(int arr[] ,int si, int ei){
    //     if(si>=ei){
    //         return;
    //     }
    //     int pIdx = partition(arr , si, ei);
    //     quicSort(arr, si, pIdx-1);
    //     quicSort(arr, pIdx+1, ei);
    // }
    // public static int partition(int arr[],int si,int ei){
    //     int pivot = arr[ei];
    //     int i = si-1;
    //     for(int j =si;j<ei;j++){
    //         if(arr[j] < pivot){
    //             i++;
    //             int temp = arr[j];
    //             arr[j] = arr[i];
    //             arr[i] = temp;
    //         }
    //     }
    //     i++;
    //     int temp = pivot;
    //     arr[ei] = arr[i];
    //     arr[i] = temp;
    //     return i;
    // }
    public static int searchTarRoted_sorted_arr(int arr[],int si,int ei,int tar){
        if(si>ei){
            return -1;
        }
        int mid = si+(ei - si)/2;
        if(arr[mid]==tar){
            return mid;
        }
        //line 1:
        if(arr[si]<= arr[mid]){
            //Lin1 :left side
            if(arr[si]<=tar && tar <= arr[mid]){
               return  searchTarRoted_sorted_arr(arr, si, mid-1, tar);
                //Lin2 :right side
            }else {
              return   searchTarRoted_sorted_arr(arr, mid+1, ei, tar);
            }

        }else{
            //line 2
            if(arr[mid]<=tar && tar <=arr[ei]){
               return  searchTarRoted_sorted_arr(arr, mid+1, ei, tar);
            }else{
               return  searchTarRoted_sorted_arr(arr, si, mid-1, tar);
            }

        }

    }
    public static void main(String args[]){
        int arr[] = {4,5,6,7,0,1,2}; int tar =0;
        System.err.print(searchTarRoted_sorted_arr(arr, 0, arr.length-1, 0));


    }
}