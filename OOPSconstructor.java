package dsajava;
public class OOPSconstructor {
    public static void main(String args[]){
    Student s1 = new Student();//OBJECT
    s1.name = "prince";
    s1.roll = 456;
    s1.password = "@abc"; //
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
    Student(){//
        marks = new int[3];
        System.out.println("Constructor is calling...");
    }
    Student(Student s1){       
        this.name = s1.name;
        this.roll = s1.roll;
        marks = new int[3];
        this.marks = s1.marks;
    }
    Student(int roll){
        this.roll = roll;
        marks = new int[3];
    }
    Student (String name){
        this.name = name;
           marks = new int [3];
    }
   

}
