
package Boletin73;
//*@author dpazolopez/
public class Personas {
    double peso1,peso2;
    
    public Personas(){
}
    public Personas(double p1, double p2){
        this.peso1=p1;
        this.peso2=p2;
    }
    public void setPeso1(double p1){
        peso1=p1;
    }
    public void setPeso2(double p2){
        peso2=p2;
    }
    public double getPeso1(){
        return peso1;
    }
    public double getPeso2(){
        return peso2;
    }
    public void resultado(){
        if(peso1>peso2){
            System.out.println("Persona 1 pesa"+ (peso1-peso2)+"kg mas");
    }
        else{
        System.out.println("Persona 2 pesa"+ (peso2-peso1)+"kg mas");
    }
    }
}
