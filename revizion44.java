public class revizion44{
       //java practice And Revision 
        //Recursion II (chapter(Lesson)+Assignment Qustions)
        /*1)tilling problem (T)
         * 2)freind pair     (T)
         * 3)binary string problem
         * Assignment q .......
         */
    public static int tillingProblem(int n){
        //base case
        if( n == 0 || n ==1 ){
            return 1;
        }
        //kaam
        //verticle choice
        int fnm1 = tillingProblem(n-1);
        //horizontle choice
        int fnm2 = tillingProblem(n-2);
        int toatalWay = fnm1 + fnm2;
        return  toatalWay;
        //inner call
    }
    public static void rmvDString(String s1,boolean arr[],StringBuilder sb,int i){
        //case
        if(i == s1.length()){
            System.out.println(sb);
            return;
        }
        //kaam
        char currentCharacter = s1.charAt(i);
        if(arr[currentCharacter - 'a']==true){
            //calling
            rmvDString(s1,arr,sb,i+1);
        }else{
            arr[currentCharacter - 'a']=true;
            //calling
            rmvDString(s1,arr,sb.append(currentCharacter),i+1);
        }
        

    }
    public static int friendsPair(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fnm1 = friendsPair(n-1);
        int fnm2 = friendsPair(n-2);
        int parWay = (n-1) * fnm2;
        int totalWay = parWay + fnm1;
        return totalWay;
    }
    public static void main(String args[]){
     int n =4;
     System.out.println(friendsPair(n))  ; 
        
     

    }
}
