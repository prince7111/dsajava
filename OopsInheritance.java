package dsajava;
//inheritance
public class OopsInheritance {
    public static void main(String args[]){
        Fish shark = new Fish();
        shark.color = "gray";
        System.out.println(shark.color);
        shark.eat();
        shark.breathe();
        shark.fins = 4;
        System.out.println(shark.fins);

    }  
}
class Animal{ // Base class
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathe");
    
    }
}
class Fish extends Animal { 
    int fins;
    void swim(){
        System.out.println("swim in Water");
    }


}
