/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_17_año_viciesto;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_17_AÑO_VICIESTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int año, resi, resi2, resi3;
        Scanner captu = new Scanner(System.in);
            System.out.println("Introduce el año: ");
        año = captu.nextInt();
     
       
        resi = año % 4;
            System.out.println("El residuo de " + año + " % 4 = " + resi);  //Divisible entre 4 es bisiesto
        resi2 = año % 100;
            System.out.println("El residuo de " + año + " % 100 = " + resi2); //Divisble entre 100 no es bisiesto
        resi3 = año % 400;
             System.out.println("El residuo de " + año + " % 400 = " + resi3); //Divisible entre 400 es bisiesto
            
       if((resi == 0) && (resi2 != 0 || resi3 == 0) )
           System.out.println("El año es bisiesto");
       else
           System.out.println("El año no es bisiesto");
                   
    }
    
}
