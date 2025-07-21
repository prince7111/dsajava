package dsajava;



public class dsaQ {
    public static void main(String args[]){
        System.out.println("Hello wolrld");
        System.out.println("dsa array || Q.2");
        int grid[] = {1,2,2,5};
        for(int i =0;i<grid.length;i++){
            for(int j =0;j<grid.length;j++){
                if(grid[i]==grid[j] && i != j){
                    System.out.println(grid[j]+" ");
                }
            }

                        
        }
     
    }

    
}
