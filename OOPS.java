package dsajava;

public class OOPS { 
    public static void main(String args[]){
        Pen p_1 = new Pen();
        p_1.setColor("Blue");
        System.out.println(p_1.color);
        p_1.tip = 4;
        System.out.println(p_1.tip);
        p_1.color = "Yellow";
        System.out.println(p_1.color);


    }
    
}
class Pen{ 
    //properties of Pen (real life object)
    String color;    
    int tip;      
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }

}
 class student{
    String name;
    int age;
    float percentage;
      void calcPecentage(int p,int m,int c){
        percentage = (m+p+c)/3;
      }
 }
