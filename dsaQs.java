package dsajava;
public class dsaQs {
    public static void main(String args[]){
        System.out.println("hello world");
        System.out.println("DSA JAVA || ARRAY 1 || EASY LEVEL || Q.4 || Single number");
        int array[] = {4,2,1,2,1};
        int single =0;
        for(int i =0; i<array.length; i++){
            single = single^array[i];

        }
        System.out.println("single :"+single);
    }
    
}
