package dsajava;
import java.util.*;
public class RoughNoteBook{
    public static int cont_MOst_Water(ArrayList<Integer> prince){
        int cr_contenor_area =0;
        int max_contenor =0;
        for(int i =0;i<prince.size();i++){
            for(int j =i+1; j<prince.size();j++){
                
                int height = Math.min(prince.get(j),prince.get(i));
                int width = j - i;
                cr_contenor_area =height*width; // ractangle  = h*w;
                if(cr_contenor_area > max_contenor){
                    max_contenor = cr_contenor_area;
                }
            }
        }
       
        return max_contenor;

    }
  public static void pairSumOne(ArrayList<Integer> prince,int target){
    ArrayList<Integer> listnew = new ArrayList<>();
    for(int i=0; i<prince.size();i++){
        for(int j =i+1;j<prince.size();j++){
            if(prince.get(i)+ prince.get(j)==target){
                listnew.add(prince.get(i));
                listnew.add(prince.get(j));
            System.out.println(" ..."+listnew);

            }


        }
    }
  }
  public static boolean  searcmat(int matrix[][],int tar){
        for(int i =0; i<matrix.length;i++){
            for(int j =0; j<matrix[0].length; j++){
                if(matrix[i][j]==tar){
                    return true;
                                
                }

            }
        }
        return false;
    }
 
    public static void main (String args[]){ 
        int mat[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target =3;
        int row = mat.length;int col = mat[0].length;
        int st =col-1,end =row-1;

        for(int i =0; i<mat.length; i++){
            for(int j =0; j<mat[0].length;j++){
                if(st ==target){
                    System.out.println("44444 = 3");
                }else if(st > target){
                    j--;
                }else{
                    j++;
                }
                
                
            }
        }
            
                  
                
    }
}