package dsajava;

import java.util.ArrayList;
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
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);list.add(6);list.add(5);list.add(8);
        printLonlynum(list);
      
       

    }
}
