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
    public static int majority(int arr[],int i,int maj){
        if(i==arr.length){
            return maj;
        }
         maj  =arr[0];
        int count =1;
        if(maj ==arr[i]){
                count++;
            }else if(count ==0){
                maj = arr[i];count =1;
            }else {
                count--;
            }
           return  majority(arr, i+1,maj);

        
    }
    public static void main(String args[]){
        int arr[] = {};// 2
        int majorityEls = majority(arr, 0, -1);
        System.out.println(majorityEls);
        
        
        }
       

    }
    

