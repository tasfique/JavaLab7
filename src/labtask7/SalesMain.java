/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labtask7;
import java.util.*;
//
/**
 *
 * @author Tasfique
 */
public class SalesMain {
    
    public static void main(String[]args){
        
        Scanner read = new Scanner (System.in);
        int quater1, quater2, quater3, quater4;
        DivisionSales sales[] = new DivisionSales[6];
        for (int i=0; i<6; i++){
           sales[i] = new DivisionSales();
           int choice, counter = 0;
           do{
        System.out.println("1. enter quater ");
        System.out.println("2. display");
        System.out.println("0. Exit");
        
        choice = read.nextInt(); 
        
        switch(choice){
            case 1:
                System.out.println("Enter the quater1 ");
                quater1 = read.nextInt();
                System.out.println("Enter the quater2 ");
                quater2 = read.nextInt();
                System.out.println("Enter the quater3 ");
                quater3 = read.nextInt();
                System.out.println("Enter the quater4 ");
                quater4 = read.nextInt();
                sales[counter].setDetails(quater1, quater2, quater3, quater4);
                counter++;
                break;
            case 2:
                for (int j=0; j<counter; j++){
                    sales[j].DisplayData();
                    break;
                }
        }
            
        }while (choice != 0);
       }
    }
}
