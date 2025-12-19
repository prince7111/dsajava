package dsajava.Greedy;
//"Prince Meena" java+dsa (III sem)
//(33) "Greedy Algorithm"
// 18|12|25 dec 2025
//
import java.util.ArrayList;
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
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};
       maxActSelection(start, end);
        
    }
}
