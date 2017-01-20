

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sppfbalboac;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class SPPFbalboaC {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {System.out.println("Calculadora IMC");
    double w, l, imc;
    String eIMC;
   Scanner Kb = new Scanner (System.in);
        System.out.println("Introduce peso");
        w = Kb.nextDouble();
        System.out.println("Introduce la estatura");
        l=Kb. nextDouble();
        
    imc = w / Math.pow(l,2);
    
    if (imc>25){
        eIMC = "Sobrepeso";
    }else if (imc<19) {
        eIMC= "Desnutricion";
    }else {
        eIMC = "Normal";
    }
        System.out.println("Peso = "+w);
        System.out.println("Estatura= "+l);
        System.out.println("IMC= "+imc); 
    }
}
        // TODO code application logic here}
    