//import java.util.*;
package dsajava;
import java.util.*;
public class Stack_Part2_assignmentQuestions {
   
    public static boolean isPalindrome(LinkedList<Character> ll){
        Stack <Character> s = new Stack<>();
        for(int i=0;i<ll.size();i++){
             s.push(ll.get(i));
            
        }
        for(int i=0;i<ll.size();i++){
            if(ll.get(i)!= s.peek()){
                return false;
            }else{
                s.pop();
            }
        }
        return true;
    }
    public static void main(String args[]){
        LinkedList<Character> ll = new LinkedList<>();
        ll.add('A');
        ll.add('B');
        ll.add('C');
        ll.add('B');
        ll.add('A');
       
        System.err.println(isPalindrome(ll));
      

       
        
    }

    
}
