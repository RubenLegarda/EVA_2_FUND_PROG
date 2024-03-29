/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_10_volado3;

import java.util.Scanner;

/**
 *
 * @author Cuenta Personal
 */
public class EVA2_10_VOLADO3 {

    public static void main(String[] args) {
        double moneda;
        int adivinar;
        Scanner captu = new Scanner (System.in);
            System.out.println("ESCOJE EL LADO DE LA MONEDA 0(CARA) O 1(CRUZ)");
        adivinar = captu.nextInt();
        moneda = Math.random();
            System.out.println("EL VALOR DE LA MONEDA = " + moneda);
            
            //0.5 ES LA MITAD DEL RANGO, > 0.5 CARA, MENOR ES CRUZ
            if(moneda > 0.5 && adivinar == 0)
                System.out.println("ADIVINASTE, ES CARA!!");
            else
                if(moneda <= 0.5 && adivinar == 1)
                    System.out.println("ADIVINASTE, ES CRUZ!!");
            else
                System.out.println("PERDISTE!!");
                        
        
    }
}
