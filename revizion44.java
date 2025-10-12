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
        if(n==1 || n==2){
            return n;
        }
        int fnm1 = friendsPair(n-1);
        int fnm2 = friendsPair(n-2);
        int parWay = (n-1) * fnm2;
        int totalWay = parWay + fnm1;
        return totalWay;
    }
    public static void binrString(int n,String s,int pidx,int idx){
        if(n==0){
            System.out.println(s);
            return ;
        }
        
        if(pidx != 1){
            binrString(n-1, s+"1", 1,idx+1);
        }
        // binrString(n-1, sb.append("0"), 0);
         binrString(n-1, s+"0", 0,idx+1);
         

    }
    /*Question1:Foragiven integer array of size N.
    You have to find all the occurrences (indices) of a given element (Key) and print them.
    Use a recursive function to solve this problem. 
    Sample Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},key = 2
    Sample Output: 1 5 7 8 */
    public static void printAllOcc(int arr[],int key,int idx){
        //base case
        if(idx == arr.length){
            return;
        }
        //kaam
        if(arr[idx] == key){
            System.out.print(idx + " ");
        }
        //calling
        printAllOcc(arr, key, idx+1);
    }
    public static void printDig(String digits[], int n){
        if(n==0){
            return;
        }
        int lsd = n % 10;
        printDig(digits, n/10);
        System.out.print(digits[lsd]+" ");

    }
    //Question 3 :Write a program to findLength of a Stringusing Recursion
    public static int lengthOfString(String str,int lenght,int idx){
       if(str.charAt(0)==' '){
        lenght =0;
        return lenght;
       }
        if(idx == str.length()){
            return lenght;

        }
        lenght =lenght+1;
        return lengthOfString(str, lenght, idx+1);
        
    }
    public static int effclengthOfString(String str,int i){
        if(i==str.length()){
            return 0;
        }
        return  1 + effclengthOfString(str, i+1);
    }
    public static int countSubstring(String str,int i,int j,int n){
        if(n==1){return 1;}
        if(n<=0){return 0;}
        int res = countSubstring(str, i+1, j, n-1) +
                  countSubstring(str, i, j-1, n-1)-
                  countSubstring(str, i+1, j-1, n-2);
                  if(str.charAt(i)==str.charAt(j)){
                    res++;
                  }
                  return res;
    }
    public static void main(String args[]){
        String str = "abcab";
        int n = str.length();
        System.out.println( countSubstring(str, 0, n-1,n ));
      
      
    }
}
