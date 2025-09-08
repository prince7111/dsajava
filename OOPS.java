package dsajava;

public class OOPS { 
    public static void main(String args[]){ 
        // Pen p1 = new Pen();
        // p1.setColor("Blue");
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());
        // p1.setColor("Yellow ");
        // System.out.println(p1.getColor());

     BankAccount myAcc = new BankAccount();
     myAcc.username = "@prince_meena";
     System.out.println(myAcc.username);
       //myAcc.passWord = "fsdjkjk"
     myAcc.setPassword("@123456");
      // System.out.println(myAcc.passWord);
      System.out.println(myAcc.getPassword());


                  
    }
    
}
// class Pen{
//    private String color;  //  ...[[p[p[i]]]]
//    private int tip;     //joioiofuif[][pf[ffof]]
   
//     String getColor(){ 
//         return this.color;
//     }
//     int getTip(){
//         return this.tip;
//     }
//     //Setter Function
//     void setColor(String newColor){
//         this.color = newColor;
//     }
//     void setTip(int tip){
//         this.tip = tip;
//     }
// }
//  class student{
//     String name;
//     int age;
//     float percentage;
//       void calcPecentage(int p,int m,int c){
//         percentage = (m+p+c)/3;
//       }
//  }
 class BankAccount{
   public  String username;
   private String password;
   public void setPassword(String password){
    this.password = password;

   }
    String getPassword(){
        return this.password;
    }
 }
