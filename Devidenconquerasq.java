package dsajava;

import javax.sound.midi.MidiMessage;

public class Devidenconquerasq {
    public static void mergeSort(String arr[],int si,int ei){
        if(si>=ei){
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr,si,mid,ei);
    }
    public static void merge(String arr[],int si,int mid,int ei){
        String tempStringarr[] = new String[ei-si+1];
        int i =si;int j =mid+1;int k=0;
        while(i<=mid && j<=ei){
            if(arr[i].compareTo(arr[j])==-1){
                tempStringarr[k] =arr[i++];

            }else{
                 tempStringarr[k] =arr[j++];

            }k++;
            while(i<=mid){
                 tempStringarr[k++] =arr[i++];

            }while(j<=ei){
                 tempStringarr[k++] =arr[j++];

            }
            for(k=0,i=si;k<tempStringarr.length;k++,i++){
                arr[i] =tempStringarr[k];

            }
            

            
        }
    }
    public static void main(String args[]){
        String arr[] = {"sun","earth","mars","mercury"};
        mergeSort(arr, 0, arr.length-1);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
       

    }
    
}
