package dsajava.Greedy;
//"Prince Meena" java+dsa (III sem)
//(33) "Greedy Algorithm"
// 18|12|25 dec 2025
//
import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;
public class First {
    public static void maxActSelection(int start[],int end[]){
          int count =0;
        ArrayList<Integer> list = new ArrayList<>();
          int activities[][] = new int[start.length][3];
          for(int i=0; i<start.length;i++){
            activities[i][0] =i;
            activities[i][1]= start[i];
            activities[i][2] = end[i];
          }
        list.add(activities[0][0]);
        count = 1;
        int endOfLastSelectedActvity = activities[0][2];
        for(int i=1; i<end.length;i++){
            if(activities[i][1]>=endOfLastSelectedActvity){
                list.add(activities[i][0]);
                count++;
                endOfLastSelectedActvity= activities[i][2];
            }
        }
        System.out.println("Max Activity "+count);
        for(int i=0;i<list.size();i++){
            System.out.print("A"+list.get(i)+",");
        }
        
      
    }
    public static int fractionalKnapsack(int val[],int wight[],int w){
      int totalVal =0;
      int capacity = w;
      double ratio[][] = new double[val.length][2];

      for(int i =0;i<val.length;i++){
        ratio[i][0] =i;
        ratio[i][1] =val[i]/(double)wight[i];
      }
      Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
      for(int i=ratio.length-1; i>= 0; i--){
        int idx = (int)ratio[i][0];
        if(capacity >= wight[idx]){
          totalVal += val[idx];
          capacity -=wight[idx];
        }else{
          totalVal +=  capacity * ratio[i][1];
          capacity =0;
          return totalVal;
        }
      }
      return totalVal;
    }
    public static void minAbsdifference(int A[],int B[]){
      Arrays.sort(A);
      Arrays.sort(B);
      int mindIff = 0;
      for(int i = 0; i < A.length; i++){
        mindIff += Math.abs(A[i] - B[i]);
      }
      System.out.println("Min. absolute difference=>"+mindIff);
      return;
    }
    public static void main(String args[])  {
      int A[] = {1,4,7,8};
      int B[] = {2,3,5,6};
      minAbsdifference(A,B);
      
      
    }
       
  
}
