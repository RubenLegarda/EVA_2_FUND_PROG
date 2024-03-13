/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_5_if2;

import java.util.Scanner;

/**
 *
 * @author Cuenta Personal
 */
public class EVA2_5_IF2 {

    public static void main(String[] args) {
        //CAPTURAR TEMPERATURA
        int temp;
        Scanner captu = new Scanner(System.in);
        //Captura Temperatura
        System.out.println("Temperatura (°C): ");
        temp = captu.nextInt();
        //VAMOS A EVALUAR
        //SI LA TEMPERATURA ES MAYOR A 22°, SE ENCIENDE EL CLIMA
        if(temp > 22)
            System.out.println("ENCENDER EL AIRE");
    }
}
