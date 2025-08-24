package dsajava;
import java.util.*;

public class dsaLesson {
    // public static boolean isPalindrome(String str){
    //     int st = 0;
    //     int end = str.length()-1;
    //     while(st<end){
    //         if(str.charAt(st)!=str.charAt(end)){
    //             return false;
        
    //         }
    //         st++;end--;
    //     }
    //     return true;
  
    // }
    // public static int displacement(String str){
    //     int x =0;
    //     int y =0;
        
    //     for(int i =0; i<str.length();i++){
    //         char dir = str.charAt(i);
    //         if(dir=='W'){
    //             x--;
    //         }else if(dir =='N'){
    //             y++;
    //         }else if(dir =='S'){
    //             y--;
    //         }else{
    //             x++;
    //         }
    //     }
    //     int x_Suare = x*x;
    //     System.out.println("x="+x+" x*x="+x_Suare);
    //     int y_Suare = y*y;
    //     System.out.println("y="+y+" y*y="+y_Suare);
    //     return (int)Math.sqrt(x_Suare+y_Suare);
       
     

    // }
    // public static String upperCase(String name){
    //     StringBuilder sb = new StringBuilder("");
    //     char ch = Character.toUpperCase(name.charAt(0));
    //     sb.append(ch);
    //     for(int i =1; i<name.length();i++){
    //         if(name.charAt(i)==' ' && i<name.length()-1){
    //             sb.append(name.charAt(i));
    //             i++;
    //             sb.append(Character.toUpperCase(name.charAt(i)));
              
    //          }else{
    //                sb.append(name.charAt(i));
    //          }
        
    // }
    // return sb.toString();
// }   
        public static void nextPermutation (int nums[],int n){
            // 1 2 3 6 5 4
            int piv =-1;
            for(int i=n-2;i>=0;i--){
                if(nums[i]<nums[i+1]){
                    piv =i; 
                    break;
                }
            }
            if(piv>0){
            for(int i= n-1;i>=0;i--){
                if(nums[i]>nums[piv]){
                    int temp = nums[piv];
                    nums[piv] =nums[i];
                    nums[i] = temp;
                    break;
                }
               
            }
        }else{
            
            Collections.reverse(Arrays.asList(nums));
        }
        Arrays.sort(nums,piv+1,n);
            
     
    }
    public static String upperCase(String s){
        int n = s.length();
        StringBuilder sb = new StringBuilder("");
        char ch = Character.toUpperCase(s.charAt(0)); sb.append(ch);
        for(int i =1; i<n; i++){
            if(s.charAt(i)==' ' && i<s.length()){
                sb.append(s.charAt(i)); i++;
                sb.append(Character.toUpperCase(s.charAt(i)));
            }else{
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
    public static String compressString (String s){
        StringBuilder sb = new StringBuilder();
       
        for(int i =0;i<s.length();i++){Integer count =1;
            while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
                count++;i++;
            }
            sb.append(s.charAt(i));
            if(count>1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }
     public static boolean isAnargam(String s1,String s2){
      boolean isAnar = true;
      if(s1.length()!=s2.length()){return false;}

      for(int i =0;i<s1.length();i++){
        int count =0;
        for(int j =0; j<s1.length();j++){
          if(s1.charAt(i)!=s2.charAt(j)){
            count++;
          }else{
            System.out.println("..");
          }
        }
        if(count==s1.length()){
          isAnar =false;
         }
      }
      return isAnar;

    }
    public static void main(String args[]){
              String s1 = "aab";
      String s2 = "aba";
      System.out.println(isAnargam(s1, s2));
    
   /*apple"

s2 = "aplee */

      
       
        }
    }
    

