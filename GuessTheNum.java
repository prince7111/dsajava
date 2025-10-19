import java.util.*;
public class GuessTheNum {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int min =1;
        int max =100;
        Random rn = new Random();        
        boolean isfind = false;
        while(isfind == false){
             int randNum = rn.nextInt((max-min)+1)+min;
             System.out.println(randNum);
             System.err.println("if find--t||greater--g||small-->s");
             String tell = sc.next();
             if(tell.charAt(0)=='t'){
                System.out.println("conrats your number is gues:"+randNum);
                isfind = true;
                return;
             }else if(tell.charAt(0)=='g'){
                max = randNum-1;
             }else if(tell.charAt(0)=='s'){
                min = randNum+1;
             }else{
                System.out.print("processing");
             }

        }
        

       
      
    }
    
}
