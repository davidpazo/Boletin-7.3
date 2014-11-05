package Boletin73;
/* @author dpazolopez */

import java.util.Scanner;

public class Boletin73 {

    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        Personas pers = new Personas();
        pers.setPeso1(dato.nextDouble());
        System.out.println("persona 1= pesa " + pers.getPeso1());
        pers.setPeso2(dato.nextDouble());
        System.out.println("persona 2= pesa " + pers.getPeso2());
        pers.resultado();
    }
}
