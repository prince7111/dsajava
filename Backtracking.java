package dsajava;
public class Backtracking {

    // //Question 1: backrraking arrays
    // public static void changeArr(int arr[],int i,int val){
    //     //base case
    //     if(i == arr.length){
    //         printArr(arr);
    //         return;
    //     }
    //     //winding & recurion
    //     arr[i] = val;        
    //     changeArr(arr, i+1, val+1);
    //     //baktracking & unwinding
    //     arr[i] = arr[i]-2;              
    // }
    // public static void printArr(int arr[]){
    //     for(int i=0; i<arr.length; i++){
    //         System.out.print(arr[i]+" ");
    //     }
    //     System.err.println(88);
    // }
    // //Backtracking : Q2 -findSubset
    // public static void findSubSet(String s,String ans,int i){
    //     if(i == s.length()){
    //         System.err.print(ans+",");
    //         return;
    //     }
    //     //choice yes
    //     findSubSet(s, ans+ s.charAt(i), i+1);
    //     //choice no
    //     findSubSet(s, ans, i+1);
    // }
    // //find permutation
    // public static void findPer(String str,String ans){
    //     if(str.length()==0){
    //         System.out.println(ans);
    //         return;
    //     }
    //     for(int i =0;i<str.length();i++){
    //         char curr = str.charAt(i);
    //        String Nstr = str.substring(0,i)+
    //                       str.substring(i+1);
    //        findPer(Nstr, ans+curr);   
    //     }
    // }
    // public static boolean isSafe(char board[][],int row,int col){
    //     //vertical ip
    //     for(int i=row-1;i>=0;i--){
    //         if(board[i][col]=='Q'){
    //             return false;
    //         }

    //     }
    //  //diag left up
    //  for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
    //     if(board[i][j]=='Q'){
    //          return false;
    //     }
    //  }
    //     //diag right up
    //     for(int i= row-1,j=col+1 ;i>=0 && j<board.length;i--,j++){
    //         if(board[i][j]=='Q'){
    //             return false;
    //         }
    //     }
    //    return true;
    // }
    // public static void nQueens(char board[][],int row){
    //     if(row == board.length){
    //         print(board);
    //         return;

    //     }
    //     for(int j=0;j<board.length;j++){
    //         if(isSafe(board,row,j)){
    //               board[row][j] = 'Q';
    //         nQueens(board, row+1);
    //         board[row][j] ='x';
    //         }
          

    //     }
    // }
    // public static void print(char board[][]){
    //     System.err.println("---chess board---");
    //     for(int i =0;i<board.length;i++){
    //         for(int j =0;j<board[0].length;j++){
    //             System.err.print(board[i][j]+" ");
    //         }
    //         System.out.println();
    //     }
    // }
    // public static int gWays(int i,int j,int n,int m){
    //     if(i == n-1 && j == m-1){
    //         return 1;
    //     }else if(i==n || j==m){
    //         return 0;
    //     }
    //     int w1 = gWays(i+1, j, n, m);
    //     int w2 = gWays(i,j+1,n,m);
    //     return w1 + w2;
    // }
    public static boolean isSafe(int sudoku[][],int row,int col,int digit){
        //col
        for(int i =0; i<=8 ;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }
        //rows
        for(int j=0; j<=8; j++){
            if(sudoku[row][j]==digit){
                return false;
            }
        }
        //grid
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean sudokuSolver(int sudoku[][],int row,int col){
        //base case
        if(row==9){
            return true;
        }
        int nextRow = row,nextCol =col+1;
        if(col+1 == 9){//conditions 
            nextRow = row+1;
            nextCol =0;
        } //age badhana
        if(sudoku[row][col] != 0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }
        for(int digit =1;digit<=9;digit++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col] = digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){
                    return true;
                }
                 sudoku[row][col]= 0;
            }          
        }
        return false;

    }
    public static void printSudoku(int sudoku[][]){
        for(int i =0;i<9;i++){
            for(int j=0;j<9;j++){
                System.err.print(sudoku[i][j]+" ");
            }
            System.err.println();
        }
    }
    public static void main(String args[]){
    int sudoku[][]={{0,0,8,0,0,0,0,0,0},
    {4,9,0,1,5,7,0,0,2},
    {0,0,3,0,0,4,1,9,0},
    {1,8,5,0,6,0,0,2,0},
    {0,0,0,0,2,0,0,6,0},
    {9,6,0,4,0,5,3,0,0},
    {0,3,0,0,7,2,0,0,4},
    {0,4,9,0,3,0,0,5,7},
    {8,2,7,0,0,9,0,1,3}};
    if(sudokuSolver(sudoku,0,0)){
        System.out.println("solution exist");
        printSudoku(sudoku);
    }else{
        System.out.println("solution does not exist");
    }
    }
}
