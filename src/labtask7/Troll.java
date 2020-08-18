//Student's Full name: Tasfique Enam
//Student's ID: 5886429
//Task1
package labtask7;

public class Troll {
    private String name;
    private String type;
    private int age;
    private static  double toll;

    //default constructor
   public Troll(){
       name = null;
       type = null;
       age = 0;
       toll = 15;
   }
   //accessor 
   public void setDetails(String name, String type, int age){
       this.name = name;
       this.type= type;
       this.age = age;
   }
   //mutator
   String getName(){
       return name;
   }
   
   String getType(){
       return type;
   }
   
   int getAge(){
       return age;
   }
   
   double getToll(){
       return toll;
   }
   //to display the data
   public void DisplayData(){
       
       System.out.println(getName()+" is a "+ getType()+" troll!!!");
       System.out.println(getName() + " is " + getAge()+" years old. ");
       System.out.println("The Troll toll is RM" + getToll());
   }
   
   
    
}
