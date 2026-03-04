package Graph;

import java.util.*;
import jdk.jfr.Frequency;

public class RottenOrange {
    static class pair{
        int row;
        int col;
        int time;
        public pair(int r,int c,int t){
            this.row = r;
            this.col = c;
            this.time = t;
        }
    }
    public static int rottenOrange(int grid[][]){
        int n = grid.length;
        int m = grid[0].length;
        int refreshOrange =0;
        Queue<pair>q = new LinkedList<>();
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new pair(i, j, 0));
                }else if(grid[i][j]==1){
                    refreshOrange++;
                }
            }
        }
        int tm = 0;
        int dRow[] ={-1,0,1,0};
        int dCol[] ={0,1,0,-1};

        while(!q.isEmpty()){
            int r = q.peek().row;
            int c = q.peek().col;
            int t = q.peek().time;

            tm = Math.max(tm, t);
            q.remove();

            for(int i =0;i<4; i++){
                int nRow = r + dRow[i];
                int nCol = c + dCol[i];
                if(nRow >= 0 && nRow < n && nCol >= 0 && nCol < m && grid[nRow][nCol] == 1){
                    grid[nRow][nCol] = 2;
                    q.add(new pair(nRow,nCol,t+1));
                    refreshOrange--;
                }
            }
        }
        return (refreshOrange == 0) ? tm :-1;
    }
    public static void main(String args[]){
        int grid[][] = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(rottenOrange(grid));
        
        
    }
    
}
