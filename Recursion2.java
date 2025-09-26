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
    public static void main(String args[]){
        
        String str ="prince";
        System.out.println(strLength(str, 0, 0));
    
     

      
    }
    
}
