package dsajava;
public class runcod {
    public static boolean  isSafe(char board[][],int row,int col) {
        //verticaly up chek
        for(int i = row-1; i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //diag lef up
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //diag right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
public static  void nQueens(char board[][],int row){
    //Base case
    if(row == board.length){
        printBoard(board);
        return;
    }
    for(int j =0;j<board.length;j++){
        if(isSafe(board,row,j)){
            board[row][j] = 'Q';
            nQueens(board, row+1);
            board[row][j] = '.';

        }
    }

}
public static void printBoard(char board[][]){
    System.err.println("-------------");
    for(int i =0;i<board.length;i++){
        for(int j =0;j<board.length;j++){
            System.err.print(board[i][j]+" ");
        }
        System.err.println("");
    }
}
    public static void main(String args[]){
        //Backtrraking nQueens
        int n =4;
        char board[][] = new char[n][n];
        for(int i =0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j] ='.';
            }
            System.err.println();
        }       
        nQueens(board,0);
    } 
}
