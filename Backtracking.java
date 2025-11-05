package dsajava;
public class Backtracking {

    //Question 1: backrraking arrays
    public static void changeArr(int arr[],int i,int val){
        //base case
        if(i == arr.length){
            printArr(arr);
            return;
        }
        //winding & recurion
        arr[i] = val;        
        changeArr(arr, i+1, val+1);
        //baktracking & unwinding
        arr[i] = arr[i]-2;              
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.err.println(88);
    }
    //Backtracking : Q2 -findSubset
    public static void findSubSet(String s,String ans,int i){
        if(i == s.length()){
            System.err.print(ans+",");
            return;
        }
        //choice yes
        findSubSet(s, ans+ s.charAt(i), i+1);
        //choice no
        findSubSet(s, ans, i+1);
    }
    //find permutation
    public static void findPer(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        for(int i =0;i<str.length();i++){
            char curr = str.charAt(i);
           String Nstr = str.substring(0,i)+
                          str.substring(i+1);
           findPer(Nstr, ans+curr);   
        }
    }
    public static boolean isSafe(char board[][],int row,int col){
        //vertical ip
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }

        }
     //diag left up
     for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
        if(board[i][j]=='Q'){
             return false;
        }
     }
        //diag right up
        for(int i= row-1,j=col+1 ;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
       return true;
    }
    public static void nQueens(char board[][],int row){
        if(row == board.length){
            print(board);
            return;

        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                  board[row][j] = 'Q';
            nQueens(board, row+1);
            board[row][j] ='x';
            }
          

        }
    }
    public static void print(char board[][]){
        System.err.println("---chess board---");
        for(int i =0;i<board.length;i++){
            for(int j =0;j<board[0].length;j++){
                System.err.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
     int n =4;
     char board[][] = new char [n][n];
     for(int i =0;i<board.length;i++){
        for(int j =0;j<board[0].length;j++){
            board[i][j] = 'X';
        }
     }
     nQueens(board, 0);
 
    }
}
