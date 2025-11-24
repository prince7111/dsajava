import java.util.ArrayList;
//import java.util.*;
public class StackB {

    static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();
        //method()1 isempty():
        public static boolean isempty(){
            return (list.size()==0);
        }
        //push
        public static void push(int data){
            list.add(data);

        }
    }
    public static void main (String args[]){
      
       
    }
    
}
