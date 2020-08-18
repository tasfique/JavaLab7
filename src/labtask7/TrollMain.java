//Student's Full name: Tasfique Enam
//Student's ID: 5886429
//Task1
package labtask7;
import java.util.*;
public class TrollMain {
    public static void main(String[]args){
        Scanner read = new Scanner (System.in);
        String name, type;
        int age;
        Troll troll[] = new Troll[2];
        for (int i=0; i<2; i++){
            troll[i] = new Troll();
        }
        int choice, counter = 0;
        do{
        System.out.println("1. set troll details ");
        System.out.println("2. display all the troll details");
        System.out.println("0. Exit");
        
        choice = read.nextInt(); 
        
        switch(choice){
            case 1:
                System.out.println("Enter the name ");
                name = read.next();
                System.out.println("Enter the type ");
                type = read.next();
                System.out.println("Enter the age ");
                age = read.nextInt();
                troll[counter].setDetails(name, type, age);
                counter++;
                break;
            case 2:
                for (int j=0; j<counter; j++){
                    troll[j].DisplayData();
                    break;
                }
        }
            
        }while (choice != 0);
    }
}