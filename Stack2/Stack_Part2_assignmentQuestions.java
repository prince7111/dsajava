package dsajava.Stack2;
import java.util.*;

public class Stack_Part2_assignmentQuestions{
    public static class Node{
        Node next;
        char data;
        Node(char d){
            this.data = d;
            this.next = null;
        }
    }
    static boolean ispalindrome(Node head){
        Node slow = head;
        boolean ispalin = true;
        Stack<Character> s = new Stack<>();
        while(slow != null){
            s.push(slow.data);
            slow = slow.next;
        }
        while(head != null){
            int i = s.pop();
            if(head.data == i ){
                ispalin = true;
            }else{
                ispalin = false;
                break;
            }
            head = head.next;
        }
        return ispalin;
    }
    public static void main(String args[]){
        Node one = new Node('A');
        Node two = new Node('B');
        Node three = new Node('C');
        Node four = new Node('B');
        Node five = new Node('A');
        one.next =two;
        two.next = three;
        three.next = four;
        four.next =five;
        boolean Condition = ispalindrome(one);
        System.err.println("palindrome:"+Condition);


    }
}
    

