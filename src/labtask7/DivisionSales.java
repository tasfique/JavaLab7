//Student's Full name: Tasfique Enam
//Student's ID: 5886429
//Task2
package labtask7;

public class DivisionSales {
    private int [] quaters = new int [4];
    private static double corpsales = 0;
    
    public DivisionSales(){
        corpsales = 0.0;
        quaters [0] = 0;
        quaters [1] = 0;
        quaters [2] = 0;
        quaters [3] = 0;    
        
    }
    
    public void setDetails(int quater1, int quater2, int quater3, int quater4){
        this.quaters[0] = quater1;
        this.quaters[1] = quater2;
        this.quaters[2] = quater3;
        this.quaters[3] = quater4;
        for (int x=0;x<4;x++){
            corpsales = corpsales + quaters[x];
        }
        
    }
    
    
    int getQuater1(){
        return quaters[0];
    }
    
    int getQuater2(){
        return quaters[1];
    }
    
    int getQuater3(){
        return quaters[2];
    }
    
    int getQuater4(){
        return quaters[3];
    }
    
    
    
    public void DisplayData(){
        System.out.println("Q1 "+getQuater1()+"Q2 "+getQuater2()+"Q3 "+getQuater3()+"Q4 "+getQuater4());
    }
    
    
    
    
}
