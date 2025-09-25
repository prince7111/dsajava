package dsajava;
public class Recursion2 {
    public static int tillingProblem(int n){
        //Base Cases
        if(n == 0 || n == 1){
            return 1;
        }
        //kam
        //varticaly
        int fnm1 = tillingProblem(n-1);
        //horizontly
        int fnm2 = tillingProblem(n-2);
        int totalWay = fnm1 + fnm2;
        return totalWay;
    }
    public static void removeDuplicates(String str,int idx, StringBuilder sb,boolean map []){
        if(idx == str.length()){
            System.out.println(sb);
            return ;
        }
        char currchar = str.charAt(idx);
        if(map[currchar - 'a']== true){
            removeDuplicates(str, idx+1, sb, map);
        }else{
            map[currchar - 'a'] = true; 

            removeDuplicates(str, idx+1, sb.append(currchar), map);//unique ko add kar lo
        }

    }
    public static int fPairing(int n){
        if(n == 1 || n == 2){
            return n;
        }
        int fnm1 =fPairing(n-1);
        int fnm2 = fPairing(n-2);
        int totalPairWay = n-1 * (fnm2);
        int totalPairs = fnm1 + totalPairWay;
        return totalPairs;
        
    }
    public static void main(String args[]){
        int n =3;
        System.out.println(fPairing(n));
      
    }
    
}
