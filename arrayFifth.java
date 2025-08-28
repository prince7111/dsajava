package dsajava;
//august//array 5 hard level
public class arrayFifth {
    public static void main(String args[]){
        System.out.println("hello world (IV)");
        System.out.println("Arrays 5 : day 5 : ||Q.1 || Traping rain water || 1st solution||");
        int h[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Traping rain water value in int :");
        System.out.println(trapedHard(h));

    }
    public static int trapedHard(int h[] ){
         int water =0;
        int n = h.length;
//    left maximum bar array
        int lm[] =new int [n];
        lm[0]=h[0];
        for(int i =1;i<n;i++){
            lm[i] = Math.max(lm[i-1],h[i]);
        }
//    Right maximum bar / baoundry
        int rm[] = new int [n];
        rm[n-1] = h[n-1];
        for(int j =n-2; j>=0;j--){
            rm[j] = Math.max(rm[j+1],h[j]);
        }
// calculate trapping rain woater
         for(int i =0; i<n;i++){
            int wL = Math.min(lm[i],rm[i]);
            water+= wL-h[i];
         }

        return water; 
    }
    
}
