package dsajava;
//inheritance
public class OopsInheritance {
    public static void main(String args[]){
        // Fish shark = new Fish();
        // shark.color = "gray";
        // System.out.println(shark.color);
        // shark.eat();
        // shark.breathe();
        // shark.fins = 4;
        // System.out.println(shark.fins);
        Dog dobby = new Dog();
        dobby.breed = "desi dog";
        System.out.println(dobby.breed);
        dobby.color = "yelloWhite";
        System.out.println(dobby.color);
        dobby.legs = 4;
        System.out.println("legs: "+dobby.legs);
        dobby.eat();dobby.breath();




    }  
}
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breath(){
        System.out.println("breath");
    }
}
class Mammals extends Animal{
    int legs;

}
class Dog extends Mammals{
    String breed;
}
   ////single level inheritance
// class Animal{ // Base class
//     String color;
//     void eat(){
//         System.out.println("eats");
//     }
//     void breathe(){
//         System.out.println("breathe");
    
//     }
// }
// class Fish extends Animal { 
//     int fins;
//     void swim(){
//         System.out.println("swim in Water");
//     }


// }
// // Single lebele inherii tance 