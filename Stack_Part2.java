package dsajava;
import java.util.Stack;
//import java.util.*;
public class Stack_Part2{
    public static boolean isValidPar(String str){
        Stack <Character> s = new Stack<>();
        for(int i= 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch =='(' || ch == '[' || ch =='{'){
                s.push(ch);
            }else{
                if(s.isEmpty()){
                    return false;
                }
                if((ch ==')'&& s.peek()=='(')
                 ||(ch==']'&& s.peek()=='[') 
                  || (ch=='}'&& s.peek()=='{')){
                    s.pop();

                }else{
                    return false;
                }
            }
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }   
    public static boolean isDuplicate(String str){
        Stack <Character> s = new Stack<>();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch ==')'){
                int count = 0;
                while(s.peek()!= '('){
                    s.pop();
                    count++;
                }
                if(count<1){
                    return true;
                }else{
                    s.pop();
                }
            }else{
                s.push(ch);
            }
        }
        return false;
    }
    public static void main(String args[]){
        String str = "(((a+(b)))+(c+d))";
        String str2 = "((a+b)+(c+d))";
        System.out.println( isDuplicate(str));
        
        
    }   
}
