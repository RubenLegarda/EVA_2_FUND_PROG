/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_14_calif_eeuu;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_14_CALIF_EEUU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int calif;
        Scanner captu = new Scanner(System.in);
System.out.println("Introduce calificación en número (0 - 100): ");
calif = captu.nextInt();

if(calif >= 90 && calif <= 100) //A
	System.out.println("A");

else if(calif >= 80 && calif <= 89) //B
	System.out.println("B");

else if(calif >= 70 && calif <= 79) //C
	System.out.println("C");

else if(calif >= 60 && calif <= 69) //D
	System.out.println("D");

else if(calif >= 0 && calif <= 59) //F
	System.out.println("F");

else	//opcional
	System.out.println("Calificación no válida");
    }
    
}
