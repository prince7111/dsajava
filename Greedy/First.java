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
    public static void main(String args[])  {
        int start[] = {0,3,1,5,4,8,2};
        int end[] =   {2,7,5,8,6,10,4};
        ArrayList<Integer> ans = new ArrayList<>();
        int acti[][] = new int[start.length][3];
        for(int i=0; i<start.length;i++){
          acti[i][0] = i;
          acti[i][1] = start[i];
          acti[i][2] = end[i];
        }
        int count =0;
        Arrays.sort(acti,Comparator.comparingDouble(o->o[2]));
        ans.add(acti[0][0]);
        count++;
        int lastend = acti[0][2];
        for(int i=1;i<start.length;i++){
          if(acti[i][1] >= lastend){
            ans.add(i);
            count++;
            lastend= acti[i][2];
          }
        }
        System.out.println("maximum count:"+count);
        for(int i=0; i<ans.size();i++){
          System.out.print("P"+ans.get(i)+" ");
        }
        System.out.println(); 
    }
}
