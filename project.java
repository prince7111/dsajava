import java.util.Scanner;
public class project {
    public static void main(String args[]){
        //calculater
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Number here:");
        int a =sc.nextInt();
        System.out.println("Enter your number again:");
        int b =sc.nextInt();
        System.out.println("Enter:\n'+' for addi.\n'-'for subs."/*\n'*'for mul.\n'/'for div.\n"*/);
        char operation = sc.next().charAt(0);
        switch(operation){
            case '+' :System.out.println(a+"+"+b+"="+(a+b));
            break;
            case '-' :System.out.print(a+"-"+b+"="+(a-b));
            break;
            case '*' :System.out.println("a*b="+(a*b));
            break;
            case '/' :System.out.print("a/b="+(a/b));
            break;
            default:System.out.print("not valid opertion (simle calC)");
        }

    }
    
}
