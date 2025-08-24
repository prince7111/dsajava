package dsajava;

public class arraysThree {
    // //         public static void nextPermutation (int nums[],int n){
    // //         // 1 2 3 6 5 4
    // //         int piv =-1;
    // //         for(int i=n-2;i>=0;i--){
    // //             if(nums[i]<nums[i+1]){
    // //                 piv =i; 
    // //                 break;
    // //             }
    // //         }
    // //         if(piv>0){
    // //         for(int i= n-1;i>=0;i--){
    // //             if(nums[i]>nums[piv]){
    // //                 int temp = nums[piv];
    // //                 nums[piv] =nums[i];
    // //                 nums[i] = temp;
    // //                 break;
    // //             }
               
    // //         }
    // //     }else{
            
    // //         Collections.reverse(Arrays.asList(nums));
    // //     }
    // //     Arrays.sort(nums,piv+1,n);
            
     
    // // }
    // // public int [][] merger(int intervals[][]){
    // //     // sort array starting index
    // //     Arrays.sort(intervals,(a,b)->a[0]-b[0]);
    // //     int start = intervals[0][0];
    // //     int end = intervals[0][1];
    // //     List<int []> list = new ArrayList<>();
    // //     for(int i=1; i<intervals.length;i++){
    // //         int s = intervals[i][0];
    // //         int e = intervals[i][1];
    // //         if(s<=end){
    // //             end = Math.max(end,e);
    // //         }else{
    // //             list.add(new int[]{start,end});
    // //             start =s;
    // //             end =e;
    // //         }
    // //     }
    // //     list.add(new int[]{start,end});
    // //     return list.toArray(new int [list.size()][]);


    // // }
    // public static int longestSubStringWIthoutRepeating(String s){
    //     int n = s.length();
    //     int maxLenght =0;
    //     // 
    //     for(int i =0; i<n;i++){
    //         boolean seen[] = new boolean[128];
    //         //
    //         for(int j =i; j<n ;j++){
    //             char curCH = s.charAt(j);
    //             if(seen[curCH]){
    //                 break;
    //             }else{
    //                 seen[curCH]=true;
    //                 int curLength = j-i+1;
    //                 maxLenght =Math.max(curLength, maxLenght);

    //             }
    //         }
    //     }
    //     return maxLenght;

    // }
    //  public static int longestSubStringBetter(String s){
    //     int n = s.length();
    //     int maxLenght =0;
    //     // 
    //     for(int i =0; i<n;i++){
    //         HashSet<Character> charSet = new HashSet<>();
    //         //
    //         for(int j =i; j<n ;j++){
    //             char curkar = s.charAt(j);
    //             if(charSet.contains(curkar)){
    //                 break;
    //             }else{
    //                 charSet.add(curkar);
    //                 int curLength = j-i+1;
                 
    //                 maxLenght =Math.max(curLength, maxLenght);

    //             }
    //         }
    //     }
    //     return maxLenght;

    // }
    //  public static int lengthOfLongestSubstringMap(String s) {
    //     int n = s.length();
    //     int maxLength = 0;
    //     Map<Character, Integer> charMap = new HashMap<>();
    //     int left = 0;
    //     for (int right = 0; right < n; right++) {
    //         char currentChar = s.charAt(right);
    //           if (charMap.containsKey(currentChar) && charMap.get(currentChar) >= left) {
    //             left = charMap.get(currentChar) + 1;
    //         }
   
    //         charMap.put(currentChar, right);
    //         int currentLength = right - left + 1;
    //         maxLength = Math.max(maxLength, currentLength);
    //     }
        
    //     return maxLength;
    // }
    //   public static void setZeroes(int[][] matrix) {
    //     int m = matrix.length;
    //     int n = matrix[0].length;
    //     boolean[] row = new boolean[m];
    //     boolean[] col = new boolean[n];
    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if (matrix[i][j] == 0) {
    //                 row[i] = true;
    //                 col[j] = true;
    //             }
    //         }
    //     }
    //     for (int i = 0; i < m; i++) {
    //         for (int j = 0; j < n; j++) {
    //             if (row[i] || col[j]) {
    //                 matrix[i][j] = 0;
    //             }
    //         }
    //     }
    // }


    public static boolean exist(char[][] board, String word) {
        // ग्रिड की पंक्तियों (rows) और कॉलम (columns) की संख्या
        int rows = board.length;
        int cols = board[0].length;

        // ग्रिड के हर सेल पर लूप चलाएं
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // अगर शब्द का पहला अक्षर मिल जाता है, तो खोजने की कोशिश करें
                if (board[i][j] == word.charAt(0)) {
                    // एक हेल्पर फंक्शन को कॉल करें
                    if (searchHelper(board, word, i, j, 0)) {
                        return true; // शब्द मिल गया है
                    }
                }
            }
        }
        return false; // पूरा ग्रिड चेक करने के बाद भी शब्द नहीं मिला
    }

    // यह फंक्शन रिकर्सिवली (recursively) काम करता है
    public static boolean searchHelper(char[][] board, String word, int row, int col, int index) {
        // बेस केस (Base Cases)
        // 1. अगर पूरा शब्द मिल गया है
        if (index == word.length()) {
            return true;
        }

        // 2. बाउंड्री चेक (Grid Boundaries) और अक्षर का मेल
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != word.charAt(index)) {
            return false;
        }

        // वर्तमान सेल को अस्थायी रूप से बदल दें ताकि हम इसे दोबारा न गिनें
        char temp = board[row][col];
        board[row][col] = '#';

        // चारों दिशाओं में आगे बढ़ें
        boolean found = searchHelper(board, word, row + 1, col, index + 1) || // नीचे
                      searchHelper(board, word, row - 1, col, index + 1) || // ऊपर
                      searchHelper(board, word, row, col + 1, index + 1) || // दाएं
                      searchHelper(board, word, row, col - 1, index + 1);    // बाएं

        // सेल को वापस उसकी मूल स्थिति में ले आएं
        board[row][col] = temp;

        return found;
    }

    public static void main(String[] args) {
        char board[][]= {{'a','b','c','e'},{'s','f','c','s'},{'a','d','e','e'}};
        String word = "abcced";
        System.out.println(exist(board,word));
        
      

    }
}
    
    


  
    

