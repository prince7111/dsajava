public class DevideAndConquerAssignmentQ {
    //string sorting (using merge sort)
    public static void print(String arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void mergeSort(String arr[],int si,int ei){
        if(si >= ei){
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
     public static void merge(String arr[],int si,int mid,int ei){
        String temp[] = new String[(ei-si)+1];
        int i =si;int j = mid+1;int k=0;
        while(i<=mid && j<=ei){
            if(arr[i].compareTo(arr[j])==-1){
                temp[k++] = arr[i++];
            }else{
                  temp[k++] = arr[j++];
            }
        }
        while(i<=mid){
              temp[k++] = arr[i++];
        }
        while(j<=ei){
            temp[k++] = arr[i++];
        }
        for(i = si,k=0;k<temp.length;k++,i++){
            arr[i]= temp[k];
        }

    }
   public static String[] mergeSortLownHigh(String arr[],int lo,int hi){
    //base case
    if(lo==hi){
        String A[] = {arr[lo]};
        return A;
    }
    //kam
    int mid = lo+(hi-lo)/2;
    String arr1 [] = mergeSortLownHigh(arr, lo, mid);
    String arr2 [] = mergeSortLownHigh(arr, mid+1, hi);
    String arr3[]  = mergee(arr1,arr2);
    return arr3;
   }
    public static String [] mergee(String arr1[],String arr2[]){
        int n = arr1.length;int m = arr2.length;
        String arr3[] = new String[n+m];
        int idx = 0;int i =0;int j=0;
        while(i<n && j<m){
            if(isAlphabatticallySmaaller((arr1[i]), (arr2[j]))){
                 arr3[idx++] = arr1[i++];
            }else{
                arr3[idx++] = arr2[j++];   
            }
        }
        while(i<n){
              arr3[idx++] = arr1[i++];
        }
        while (j < m) {
              arr3[idx++] = arr2[j++];           
        }
        return arr3;
    }
    public static boolean  isAlphabatticallySmaaller(String str1,String str2){
        if(str1.compareTo(str2)<0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String args[]){
       String []arr = {"sun", "earth", "mars", "mercury"};
    // mergeSortLownHigh(arr, 0, arr.length-1);
    // for(int i =0;i<arr.length;i++){
    //     System.out.print(arr[i]+" ");
    // }
    String []a = mergeSortLownHigh(arr, 0, arr.length-1);
    for(int i =0;i<arr.length;i++){
        System.out.print(a[i]+" ");
    }



    }
    
}
