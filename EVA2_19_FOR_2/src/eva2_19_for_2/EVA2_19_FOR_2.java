/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_19_for_2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_19_FOR_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //PREGUNTAR: CANTIDAD DE ESTUDIANTES EN EL GRUPO
        int numAlum;
        Scanner captu = new Scanner(System.in);
        System.out.println("¿Cuantos estudiantes tiene el grupo?");
        numAlum = captu.nextInt();
        //hay que capturar todas las calificaciones:
        //for (int i = 0; i < numAlum; i++){AMBOS HACEN LO MISMO
        for (int i = 1; i <= numAlum; i++) {
            System.out.println("Calificación: ");
            int califa = captu.nextInt();
        }
    }
    
}
