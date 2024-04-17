/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_26_break;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA2_26_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VAMOS A GENERAR UN ACCESO POR USUARIO Y CONTRASEÑA
        String usuario, pwd;
        
        String USUARIO = "Admin";
        String PASSWORD = "Admin";
        
        Scanner captu = new Scanner(System.in);
        
        //Como es un control de acceso, debemos preguntar un npumero indeterminado de veces hasta que el usuario y contraseña sean correctos
        
        while(true){
            System.out.println("Usuario:");
            usuario = captu.nextLine();
            System.out.println("Contraseña:");
            usuario = captu.nextLine();
            if (usuario.equals(USUARIO) && pwd.equals(PASSWORD)){
            System.out.println("Bienvenido al SISTEMA");//usuario 
                 break;
                
            }else
                System.out.println("Datos incorrectos");
                
        }
        }
    }
