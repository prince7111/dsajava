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
    public static String large(String fruits[]){
        String largestString ="";
        if((fruits[0].compareTo(fruits[1])>0 && (fruits[0].compareTo(fruits[3]))>0)){
            largestString=fruits[0];
        }else if(fruits[1].compareTo(fruits[2])>0){
            largestString=fruits[1];
        }else{
        largestString=fruits[2];
        }
return largestString;
    }
    public static void upperCase(String str){
            StringBuilder sb = new StringBuilder("");
        Character ch =str.toUpperCase().charAt(0);
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            ch=str.charAt(i);
            if(ch==' '&& i<str.length()){
                sb.append(ch);
                sb.append(str.toUpperCase().charAt(i+1));
                i++;
            }else{
                sb.append(ch);
            }
        }
    
System.out.print(sb.toString());
     
    }
    public static String compressTring(String str){
        String st="";
        for(int i=0;i<str.length();i++){
        
            Integer count=1;
            while( i<str.length()-1 &&str.charAt(i)==str.charAt(i+1) ){
                count++;i++;
            }
            st+= str.charAt(i);
            if(count>1){
                st+=count.toString();
            }
        }
        return st;
    }
    //String assignmnet Questions
    public static int countVovles(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'){
                count++;

            }
        }
        return count;

    }
    public static void main(String args[]){
        String str ="aeiou";
        System.err.println(countVovles(str));
        countVovles(str);

       
    
    }
    
}
