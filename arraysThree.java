package dsajava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class arraysThree {
    //         public static void nextPermutation (int nums[],int n){
    //         // 1 2 3 6 5 4
    //         int piv =-1;
    //         for(int i=n-2;i>=0;i--){
    //             if(nums[i]<nums[i+1]){
    //                 piv =i; 
    //                 break;
    //             }
    //         }
    //         if(piv>0){
    //         for(int i= n-1;i>=0;i--){
    //             if(nums[i]>nums[piv]){
    //                 int temp = nums[piv];
    //                 nums[piv] =nums[i];
    //                 nums[i] = temp;
    //                 break;
    //             }
               
    //         }
    //     }else{
            
    //         Collections.reverse(Arrays.asList(nums));
    //     }
    //     Arrays.sort(nums,piv+1,n);
            
     
    // }
    // public int [][] merger(int intervals[][]){
    //     // sort array starting index
    //     Arrays.sort(intervals,(a,b)->a[0]-b[0]);
    //     int start = intervals[0][0];
    //     int end = intervals[0][1];
    //     List<int []> list = new ArrayList<>();
    //     for(int i=1; i<intervals.length;i++){
    //         int s = intervals[i][0];
    //         int e = intervals[i][1];
    //         if(s<=end){
    //             end = Math.max(end,e);
    //         }else{
    //             list.add(new int[]{start,end});
    //             start =s;
    //             end =e;
    //         }
    //     }
    //     list.add(new int[]{start,end});
    //     return list.toArray(new int [list.size()][]);


    // }
    public static int longestSubStringWIthoutRepeating(String s){
        int n = s.length();
        int maxLenght =0;
        // 
        for(int i =0; i<n;i++){
            boolean seen[] = new boolean[128];
            //
            for(int j =i; j<n ;j++){
                char curCH = s.charAt(j);
                if(seen[curCH]){
                    break;
                }else{
                    seen[curCH]=true;
                    int curLength = j-i+1;
                    maxLenght =Math.max(curLength, maxLenght);

                }
            }
        }
        return maxLenght;

    }
     public static int longestSubStringBetter(String s){
        int n = s.length();
        int maxLenght =0;
        // 
        for(int i =0; i<n;i++){
            HashSet<Character> charSet = new HashSet<>();
            //
            for(int j =i; j<n ;j++){
                char curkar = s.charAt(j);
                if(charSet.contains(curkar)){
                    break;
                }else{
                    charSet.add(curkar);
                    int curLength = j-i+1;
                 
                    maxLenght =Math.max(curLength, maxLenght);

                }
            }
        }
        return maxLenght;

    }
     public static int lengthOfLongestSubstringMap(String s) {
        int n = s.length();
        int maxLength = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;
        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
              if (charMap.containsKey(currentChar) && charMap.get(currentChar) >= left) {
                left = charMap.get(currentChar) + 1;
            }
   
            charMap.put(currentChar, right);
            int currentLength = right - left + 1;
            maxLength = Math.max(maxLength, currentLength);
        }
        
        return maxLength;
    }
      public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
  
    }
}
    
    


  
    

