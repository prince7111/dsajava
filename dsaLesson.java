package dsajava;
public class dsaLesson {
    public static boolean isPalindrome(String str){
        int st = 0;
        int end = str.length()-1;
        while(st<end){
            if(str.charAt(st)!=str.charAt(end)){
                return false;
        
            }
            st++;end--;
        }
        return true;
  
    }
    public static int displacement(String str){
        int x =0;
        int y =0;
        
        for(int i =0; i<str.length();i++){
            char dir = str.charAt(i);
            if(dir=='W'){
                x--;
            }else if(dir =='N'){
                y++;
            }else if(dir =='S'){
                y--;
            }else{
                x++;
            }
        }
        int x_Suare = x*x;
        System.out.println("x="+x+" x*x="+x_Suare);
        int y_Suare = y*y;
        System.out.println("y="+y+" y*y="+y_Suare);
        return (int)Math.sqrt(x_Suare+y_Suare);
       
     

    }
    public static void main(String args[]){
        String s1 ="apple";
        String s2 = "mango";
        String s3 = "banana";
        int i =0;
        
        if(s1.charAt(i)>s2.charAt(i)&&s1.charAt(i)>s3.charAt(i) ){
            System.out.println("s1 is largest");
        }else if(s2.charAt(i)>s3.charAt(i)){
                        System.out.println("s2 is largest");
            
        }else{  System.out.println("s3 is largest");
            

        }
        i++;
      
    }
    
}
