/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_20_for_3;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_20_FOR_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //EJERCICIO 1
       String nombre;
       int numNombre;
       Scanner captu = new Scanner(System.in);
       System.out.println("¿Cual es tu nombre?");
       nombre = captu.nextLine();
       System.out.println("¿Cuantas veces quieres imprimir?");
       numNombre = captu.nextInt();
       
       for (int i = 1; i <= numNombre; i++) {
            System.out.println(nombre);   
    }
       //EJERCICIO 2
       int numSum, resu;
       System.out.println("Introduce el numero");
       numSum = captu.nextInt();
       for (int i = 1; i <= numSum; i++) {
       }
        
    }  
}
