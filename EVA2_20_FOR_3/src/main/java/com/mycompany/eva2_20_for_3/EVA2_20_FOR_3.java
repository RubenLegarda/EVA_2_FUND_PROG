/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_20_for_3;

import java.util.Scanner;

/**
 *
 * @author Cuenta Personal
 */
public class EVA2_20_FOR_3 {

    public static void main(String[] args){
        
        //EJERCICIO 1 
    String nombre;
       int numNombre;
       Scanner captu = new Scanner(System.in);
       System.out.println("¿Cual es tu nombre?");
       nombre = captu.nextLine();
       System.out.println("¿Cuantas veces quieres imprimir?");
       numNombre = captu.nextInt();
       
        for (int i = 1; i <= numNombre; i++)
            System.out.println(nombre);
       
       //EJERCICIO 2
       int numSum, resu = 0;
       System.out.println("Introduce el numero");
       numSum = captu.nextInt();
       for (int i = 1; i <= numSum; i++) 
           resu = resu + i;
        System.out.println("El valor de la sumatoria de " + numSum + " - " + resu);
        
       //EJERCICIO 3
       int numFil;
        System.out.println("Número de filas a imprimir");
        numFil = captu.nextInt();
        for(int i = 1; i <= numFil; i++){
            for (int j = 1; j <= i; j++){
                System.out.println("*");
            }
            System.out.println("");
        
        }
        for(int i = numFil; i >= 1; i--){
            for (int j = i; j >= 1; j--){
                System.out.println("*");
            }
            System.out.println("");
        }
           }
}

