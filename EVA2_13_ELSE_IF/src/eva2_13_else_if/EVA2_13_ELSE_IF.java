/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_13_else_if;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_13_ELSE_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int dia;
Scanner captu = new Scanner(System.in);
System.out.println("Introduce el dia de la semana en número (1 - 7): ");
dia = captu.nextInt();

if(dia == 1) //Si hay mas de una instrucción usar llaves {}
	System.out.println("Domingo");
else if(dia == 2)
	System.out.println("Lunes");
else if(dia == 3)
	System.out.println("Martes");
else if(dia == 4)
	System.out.println("Miercoles");
else if(dia == 5)
	System.out.println("Jueves");
else if(dia == 6)
	System.out.println("Viernes");
else if(dia == 7)
	System.out.println("Sabado");
else	//opcional
	System.out.println("El número no es un día válido");
    }
    
}
