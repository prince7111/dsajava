package dsajava;

import java.util.ArrayList;

//august//array 5 hard level
public class arrayFifth {
     public static int trapedHard(int h[] ){
         int water =0;
        int n = h.length;
//    left maximum bar array
        int lm[] =new int [n];
        lm[0]=h[0];
        for(int i =1;i<n;i++){
            lm[i] = Math.max(lm[i-1],h[i]);
        }
//    Right maximum bar / baoundry
        int rm[] = new int [n];
        rm[n-1] = h[n-1];
        for(int j =n-2; j>=0;j--){
            rm[j] = Math.max(rm[j+1],h[j]);
        }
// calculate trapping rain woater
         for(int i =0; i<n;i++){
            int wL = Math.min(lm[i],rm[i]);
            water+= wL-h[i];
         }

        return water; 
    }
    
    public static void main(String args[]){
        int arr[] ={1};
        ArrayList<Integer> list = new ArrayList<>();
        //3,3,5,5,6,7
        int idx =0;int k=1;
        while(k<=arr.length){
            int largest =0;
            for(int i =idx;i<k;i++){
                largest =Math.max(largest, arr[i]);
            

            }
            list.add(largest);
         idx++;k++;

        }
       
   System.out.println(list);

    }
}