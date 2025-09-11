package dsajava;
public class OopsInheritance{
    public static void main(String args[]){
        System.out.println("Hybrid Inheritance");


    }
}
class Animal{  //Parent class 1
    String color;
    void eat(){
        System.out.println("eat");
    }
    void breath(){
        System.out.println("breath");
    }
}
class Fish extends Animal{ // 1.1 child class (animal>fish)
    void swim(){
        System.out.println("Swim in Water");
    }
}
class Bird extends Animal{ //1.2 childe class (animal >Bird)
        void fly(){
            System.out.println("fly in sky");
    }
}
class Mammal extends Animal{//1.3 child class (anima>mamml)
    void walk(){
        System.out.println("Walks");

    }
}
// /////////////
class Tuna extends Fish{ //1.1.1 tuna<fish<animal
    String ability;
}
class Shark extends Fish{ //1.1.2 shark<fish<animal
    String ability;
}
class Peacock extends Bird{//1.2.1 peacock<Bird<Animal
      boolean vage;
}
//
class Dog extends Mammal{//1.3.1 Dog<Mammal<Animal
    boolean tail;
}
class Cat extends Mammal { // 1.3.2 Cat < Mammal < Animal
    boolean tail;

    
}
class Human extends Mammal{ // 1.3.2 Human <Mammal<Aniamal
    boolean tail;
}

