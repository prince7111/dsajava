package dsajava;
public class OOPSconstructor {
    public static void main(String args[]){
    Student s1 = new Student();//OBJECT
    s1.name = "Girdhar";
    s1.roll = 456;
    s1.password = "@abc"; 
// marks array
    s1.marks[0] = 100;
    s1.marks[1] = 99;
    s1.marks[2] = 80;  //
    Student s2 = new Student(s1); // COPY 1 TIME
    s2.password = "@xyz";
    s1.marks[2] =100;
    for(int i=0;i<3;i++){
        System.out.println(s2.marks[i]);
    }
    }  
}
class Student{          //stud class BLUEPrint
    String name;
    int roll;
    String password;
    int marks[];
// Shallo copy constuctor functoion
    // Student(Student s1){       
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     marks = new int[3];
    //     this.marks = s1.marks;
    // }
    Student(Student s1){
        this.name = s1.name;
        this.roll = s1.roll;
        marks = new int[3];
        // this.marks = s1.marks;
        for(int i=0;i<marks.length;i++){
           this.marks[i]=s1.marks[i];
        }

    }
    Student(int roll){
        this.roll = roll;
        marks = new int[3];
    }
    Student (String name){
        this.name = name;
           marks = new int [3];
    }
    Student(){
        System.out.println("Constructor is calling ...");
        marks = new int [3];
    }
   

}
