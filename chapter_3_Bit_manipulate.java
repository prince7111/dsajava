                                            // ||CHAPETER 3 : bit Maninpulation||  \\\ 
 package dsajava;
public class chapter_3_Bit_manipulate {
    public static void operators_operations(int a,int b){ 
     System.out.println("Hello World");//java dsa ||chapeter 3 || BIT MANIPULATION || #(pRINCE MEEENA)

           //operators 
        //1)AND &
        System.out.print("5 & 6 =");
        System.out.println(5 & 6);//  (4)10
        //2)OR |
        System.out.print("5 | 6 = ");
        System.out.println(5 | 6); // (7)10
        //3) XOR
        System.out.print("5 ^ 6 = ");
        System.out.println(5 ^ 6); //  (3)10

        //BInary ones compliment
        System.out.println("BInary ones complement ");
        System.out.println("~5 ="+~5);
        //~n =-() || ones complement
        //~-n()+1 ||2's complement
        System.out.println(~0); // ==-1 aayega na ki 1
        System.out.println("binary left shift <<<<< ");
        System.out.println(5<<2);//20
        System.out.println("Binary right shift >>>>..>>");
        System.out.println(6>>2);//1

    }
    //Q1 chack if a number is odd or even
    public static void checkOddOrEven(int n){
        int ans =n&1;
        if(ans ==1){
            System.out.println(n+" is odd");
            
        }else{
            System.out.println(n+" is even");
        
        }

    }
    public static void oddOrEven(int n){
        int bitmask=1<<0;
        if((n & bitmask)==0){
                System.out.println("even");

        }else{
            System.out.println("Odd");
        }
        }
        
    public static void checkIthBIt(int n,int i){
        int bitmask =1<<i;
        if((n & bitmask)!=0){
            System.err.println("the "+i+"th bit of "+n+"=1");

        }else{
            System.err.println("the "+i+"th bit of "+n+"=0");
        }
    }
    

    public static void main(String args[]){
        checkIthBIt(0,3 );
        
        

     

    }
    
}
