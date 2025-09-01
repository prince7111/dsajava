package dsajava;
public class Strings_chap_2 {
    public static boolean isPalindrome(String str){
        String newStr = "";
        for(int i=str.length()-1;i>=0;i--){
            newStr += str.charAt(i);
        }
        if(newStr.equals(str)){
            return true;
        }
        return false;

    }
    public static void main(String args[]){
        System.out.println("Strings in Java dsa || chapete 2,Q.1 || is palindrome");
        String str ="madaM";
        System.out.println(isPalindrome(str));

    }
    
}
