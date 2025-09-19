package dsajava;
import java.util.*;

import javax.swing.plaf.basic.BasicComboBoxUI.ComboBoxLayoutManager;
public class Oop_Asignment_Q {
    public static void main(String[] args) {
        Complex n1 = new Complex(2,3);  
        n1.printComplex();
        Complex n2 = new Complex(4, -7);
        n2.printComplex();    
        Complex.add(n1, n2).printComplex();
        
        
   }
    
}
class Complex{
    int real;
    int imag;
    public Complex(int r,int i){
        this.real = r;
        this.imag = i;
    }
    public static Complex add(Complex n1, Complex n2){
        return new Complex((n1.real+n2.real),(n1.imag+n2.imag)) ;
    }
    public static Complex diff(Complex n1, Complex n2){
        return new Complex((n1.real - n2.real),(n1.imag- n2.imag));
    }
    // public static Complex mul(Complex n1,Complex n2){
    //     return new Complex((n1.real*n2.real)+(n1.real*n2.imag)+(n1.imag*n2.real)+(n1.imag*n2.imag),);
    // }
      
   public void printComplex(){
        if(real ==0 && imag !=0){
            System.out.println(imag+"i");
        }else if(real !=0 && imag ==0){
            System.out.println(real);
        }else{
            System.out.println(real+"+"+imag+"i");
        }
    }
}

