public class javafunck {
    public static void mergeSort(int arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid =(si+ei)/2;
        mergeSort(arr,si,mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(int arr[],int si,int mid,int ei){
        int temp[] = new int [ei-si+1];
        int i =si;
        int j =mid+1;
        int k =0;
        while(i<=mid && j<=ei){
            if(arr[i]<arr[j]){
                temp[k] = arr[i++];
            }else{
                temp[k] = arr[j++];
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
        while(j<=ei){
            temp[k++]=arr[j++];
        }
        for(i=si,k=0;k<temp.length;i++,k++){
            
            arr[i] = temp[k];
        }
    }
    public static void main (String args[]){
        int arr[] ={7,2,7,3,-6,2,3,1,8,2};
        int n = arr.length;
        mergeSort(arr, 0, n-1);
        for(int p =0;p<arr.length;p++){
            System.out.print(arr[p]+" ");
        }
        System.out.println();
        
    }
    
}
