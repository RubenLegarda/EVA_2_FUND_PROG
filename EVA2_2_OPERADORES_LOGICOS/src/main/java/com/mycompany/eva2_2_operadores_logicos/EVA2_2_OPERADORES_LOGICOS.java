/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_operadores_logicos;

/**
 *
 * @author Cuenta Personal
 */
public class EVA2_2_OPERADORES_LOGICOS {

    public static void main(String[] args) {
        boolean A, B;
        A = false;
        B = false;
        boolean resu;
        //OPERADOR AND -> &&
        resu = A && B;
        System.out.println("Resu = " + resu);
        A = true;
        B = false;
        resu = A && B;
        System.out.println("Resu = " + resu);
        A = true;
        B = true;
        resu = A && B;
        System.out.println("Resu = " + resu);
    }
}
