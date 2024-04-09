/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva2_18_for;

/**
 *
 * @author invitado
 */
public class EVA2_18_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //INICIO; CONDICION; INCREMENTO/DECREMENTO
for(int i = 1; i <= 10; i++){
	//LLAVES SON OPCIONALES, USENLAS CUANDO TENGAN MÁS DE UNA INSTRUCCIÓN A REPETIR
        System.out.println(i + " - ");
}
        System.out.println("");
for(int i = 10; i >= 1; i--){
	//LLAVES SON OPCIONALES, USENLAS CUANDO TENGAN MÁS DE UNA INSTRUCCIÓN A REPETIR
        System.out.println(i + " - ");
}
        System.out.println("");
 //IMPRIMIR LOS NUMEROS PARES ENTRE 0 Y 100
 for(int i = 0; i <= 100; i += 2){
     System.out.println(i + " - ");
 
 }
    }
    
}
