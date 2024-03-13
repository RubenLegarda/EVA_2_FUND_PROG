/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_9_volado2;

import java.util.Scanner;

/**
 *
 * @author Cuenta Personal
 */
public class EVA2_9_VOLADO2 {

    public static void main(String[] args) {
        double moneda;
        int seleccion;
        Scanner captu = new Scanner (System.in);
            System.out.println("ESCOJE EL LADO DE LA MONEDA 1(CARA) O 2(CRUZ)");
        seleccion = captu.nextInt();
        moneda = Math.random();
            System.out.println("EL VALOR DE LA MONEDA ES " + moneda);
        
        if(moneda > 0.5)
            System.out.println("CARA");
        else
            System.out.println("CRUZ");
        
        if(moneda > 0.5 && seleccion == 1)
            System.out.println("GANASTE!!!");
        else{
            if(moneda < 0.5 && seleccion == 2)
                System.out.println("GANASTE!!!");
            else
                System.out.println("PERDISTE!!!");
            
        }
    }
}
