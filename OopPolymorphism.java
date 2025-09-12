package dsajava;

public class OopPolymorphism {
    public static void main(String args[]){
        additions add = new additions();
         System.out.println(add.sum(11, 33));
         System.out.println(add.sum((float)11.9, (float)32.1));
         System.out.println(add.sum(10, 20,14));
    }
}
class additions{
    int sum(int a,int b){
        return a+b;
    }
    float sum(float a,float b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}

