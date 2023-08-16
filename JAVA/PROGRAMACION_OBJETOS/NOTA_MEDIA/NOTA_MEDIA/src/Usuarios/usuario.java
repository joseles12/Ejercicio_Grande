package Usuarios;

import java.util.Scanner;

import Global.constantes;

public class usuario {

    static Scanner lector = new Scanner(System.in);
 
    static String[] pedirNombres(){
        String[] nombres = new String[constantes.NUMERO_ALUMNOS];
        for (int contador =0; contador<constantes.NUMERO_ALUMNOS; contador++){
            System.out.println("Dame el nombre del alumno: " + (contador + 1));
            nombres[contador] = lector.nextLine();
        }
        return nombres;
    }

}
