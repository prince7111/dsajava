package dsajava;
import java.util.ArrayList;

public class RoughNoteBook{
    public static void main(String args[]){ 
     int nums[] ={-1,0,1,2,-1,-4};
   
     for(int i =0;i<nums.length;i++){
      for(int j =i+1; j<nums.length; j++){
        for(int k =j+1; k<nums.length; k++){
          if((nums[i]+nums[j]+nums[k]==0)&& i!=j && i!=k && j!=k){
            ArrayList<Integer> list1 = new ArrayList<>();
            list1.add(nums[i]);
            list1.add(nums[j]);
            list1.add(nums[k]);
            System.out.println(list1);


          }
        }
      }

     }
     


    }
  }
