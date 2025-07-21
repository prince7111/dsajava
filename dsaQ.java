package dsajava;



public class dsaQ {
    public static void main(String args[]){
        System.out.println("Hello wolrld");
        System.out.println("dsa array || Q.2");
        int grid [][] = {{1,2},{4,5}};
        int totalNum =grid.length;
        int excNUm = grid.length+1;
        int totalSum = (excNUm*(excNUm+1))/2;
        int sum =0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                sum += grid[i][j];
            }
        }
       System.out.println(totalSum+" "+ sum);
        int missing = totalSum - sum;
        System.out.println("missing number is"+missing);




    }

    
}
