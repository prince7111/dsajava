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
    public static void main(String args[]){
        System.out.println("Recursion part two jai ho 2!");
        int n =3;
        System.out.println(tillingProblem(n));
    }
    
}
