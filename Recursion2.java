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
    public static void main(String args[]){
        String str = "appnacollege";
        removeDuplicates(str, 0,new StringBuilder(""), new boolean [26]);
    }
    
}
