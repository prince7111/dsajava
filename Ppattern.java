public class Ppattern {
    public static void main(String[] args) {
        int n =3;
        for(int i =0;i<n;i++){
            for(int j =0;j<n;j++){
                if(j==0 || (i<=(n/2)&& j==n/2)){
                    System.out.print(" * ");
                }else{
                    System.err.print(" ");
                }
            }
            System.err.println();
        }
    }
    
}
