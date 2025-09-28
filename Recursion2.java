package dsajava;
public class Recursion2 {
    // public static int tillingProblem(int n){
    //     //Base Cases
    //     if(n == 0 || n == 1){
    //         return 1;
    //     }
    //     //kam
    //     //varticaly
    //     int fnm1 = tillingProblem(n-1);
    //     //horizontly
    //     int fnm2 = tillingProblem(n-2);
    //     int totalWay = fnm1 + fnm2;
    //     return totalWay;
    // }
    // public static void removeDuplicates(String str,int idx, StringBuilder sb,boolean map []){
    //     if(idx == str.length()){
    //         System.out.println(sb);
    //         return ;
    //     }
    //     char currchar = str.charAt(idx);
    //     if(map[currchar - 'a']== true){
    //         removeDuplicates(str, idx+1, sb, map);
    //     }else{
    //         map[currchar - 'a'] = true; 

    //         removeDuplicates(str, idx+1, sb.append(currchar), map);//unique ko add kar lo
    //     }

    // }
    // public static int fPairing(int n){
    //     if(n == 1 || n == 2){
    //         return n;
    //     }
    //     int fnm1 =fPairing(n-1);
    //     int fnm2 = fPairing(n-2);
    //     int totalPairWay = n-1 * (fnm2);
    //     int totalPairs = fnm1 + totalPairWay;
    //     return totalPairs;
        
    // }
    public static void allOcc(int arr[],int key,int i,String str){
        if(i == arr.length){
            System.out.println(str);
            return;
        }
        if(arr[i]==key){
            str+=i+" ";

        }
        allOcc(arr, key, i+1, str);
      

    }
    public static int  strLength(String str , int i , int length){
        if(i == str.length()){
            return length;
        }
        if(str.charAt(i) != 32){
            length = length+1;

        }
        return strLength(str, i+1, length);
    }
    public static int countOfSpecialString(String str){
        int count =0;
        for(int i=0; i<str.length();i++){
            String curSubStr = "";
            for(int j =i; j<str.length(); j++){
                curSubStr +=  str.charAt(j);
                if(curSubStr.length()==1){
                    count++;
                }else if(curSubStr.charAt(0) == curSubStr.charAt(curSubStr.length()-1)){
                    count++;

                }
                
            }
        }
        return count;

    }
  public static int counSubString(String str, int i, int j, int n){
    if(n == 1){
        return 1;
    }
    if(n == 0){
        return 0;
    }
    int res = counSubString(str, i+1, j, n-1) +
               counSubString(str, i, j-1, n-1) -
                counSubString(str, i+1, j-1, n-2);
    if(str.charAt(i)== str.charAt(j)){
        res++;
    }
    return res;

  }
    public static void towerOfhanoi(int n ,String source ,String helper, String destination){
        if(n ==1){
            System.out.println(("transfer dis "+n + " from "+source+ " to "+destination));
            return;
        }
        towerOfhanoi(n-1, source, destination, helper);
        System.out.println("transfer disk "+n+" frome "+ source +" to "+ destination);
        towerOfhanoi(n-1, helper, source, destination);
    }

    public static void main(String args[]){
        int n =2;
        towerOfhanoi(n, "source", "helper", "destination");
 
   }
    
}
