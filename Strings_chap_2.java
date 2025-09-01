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
    public static double   findSortPath(String Q2){
        float x =0f;
        float y =0f;
        for(int i=0;i<Q2.length();i++){
            char dir= Q2.charAt(i);
            if(dir=='E'){
                x++;
            }else if(dir=='N'){
                y++;
    
            }else if(dir=='w'){
                x--;
            }else{
                y--;
            }
        }
        float x_Suare=x*x;
        float y_Suare =y*y;
        double ans =Math.sqrt(x_Suare + y_Suare);
        return ans;
    }
    public static void main(String args[]){
        System.out.println("Strings in Java dsa || chapete 2,Q.1 || is palindrome");
        String  Q2 = "WNEENESENNN";
        System.out.println(findSortPath(Q2));


    }
    
}
