package dsajava.Greedy;
//"Prince Meena" java+dsa (III sem)
//(33) "Greedy Algorithm"
// 18|12|25 dec 2025
//
import java.util.ArrayList;
public class First {
    public static void maxActSelection(int start[],int end[]){
        ArrayList<Integer> list = new ArrayList<>();
        int count =0;
        list.add(0);
        count = 1;
        int endOfLastSelectedActvity = end[0];
        for(int i=1; i<end.length;i++){
            if(start[i]>=endOfLastSelectedActvity){
                list.add(i);
                count++;
                endOfLastSelectedActvity= end[i];
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
