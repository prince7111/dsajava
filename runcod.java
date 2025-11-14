package dsajava;

import java.util.ArrayList;
import java.util.HashMap;
public class runcod {
public static void printLonlynum(ArrayList<Integer>list ){
    for(int i =0; i<list.size();i++){
        int currI = list.get(i);
        boolean isLonely = true;       
        for(int j = 0;j<list.size();j++){
            if(i!=j){  
                 int currJ = list.get(j);
            if(currI == currJ){
                isLonely = false;
                break;
            }else if(currI == (currJ)-1){
                isLonely = false;
                break;
            }else if(currI == (currJ)+1){
                isLonely = false;
                break;
            }
           }
        }
           if(isLonely == true){
            System.out.println(list.get(i));    
        }
    }
}
public static int mostFreqNumber(ArrayList<Integer>list,int key){
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<list.size()-1;i++){
        if(list.get(i)==key){
            int cT = list.get(i+1);
            map.put(cT,map.getOrDefault(cT, 0)+1);
        }
    }
    int maxCount =0;int mostFreqNumber=-1;
    for(HashMap.Entry<Integer,Integer>entry : map.entrySet()){
        if(entry.getValue()>maxCount){
            maxCount = entry.getValue();
            mostFreqNumber = entry.getKey();
        }
    }
return mostFreqNumber;
}
    public static void main(String args[]){
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(100);
    list.add(200);
    list.add(1);
    list.add(100);
    System.out.println(mostFreqNumber(list, 1));

      
      
       

    }
}
