package dsajava;
public class Recursion {
    //Recursion Funtion (print numbers)
    public static void printInc(int n){
        if(n==1){
        System.out.print(n+" ");
        return;
        }
       
        printInc(n-1); 
        System.out.print(n+" ");
    }
    public static int sumN(int n){
        if(n==1){
            return 1;
        }
        int snm1 = sumN(n-1);
        int sum = n+snm1;
        return sum;
      

    }
    public static int fact(int n){
    if(n==0){
        return 1;
    }
    int fnm1 = fact(n-1);
    int fn = n * fnm1;
    return fn;
}
public static int fibonacci(int n){
    if(n ==1 || n ==0){
        return n;
    }
    int fnm1 = fibonacci(n-1);
    int fnm2 = fibonacci(n-2);
    int FN = fnm1 + fnm2;
    return FN;

}
public static boolean isSorted(int arr[] ,int i){
    if(i ==arr.length-1){
        return true;
    }
    if(arr[i]> arr[i+1]){
        return false;
    }
return isSorted(arr, i+1);
}
    public static void main(String[] args) {
       int arr[] = {1,2,3,4};
       System.out.println(isSorted(arr, 0));
       
    
  
       
        
        
    }
    
}

