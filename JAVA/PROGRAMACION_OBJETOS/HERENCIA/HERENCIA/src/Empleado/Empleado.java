/*
 * Clase persona y empleado 
 * persona: nombre y edad
 * empleado: nombre y edad de persona , ademas de salario y puesto
 */

package Empleado;

import Persona.persona;

public class Empleado extends persona {

    float salario;
    String puesto;

    public void metodo() {

       // super.nombre = "Jose";
        
    }

    public void firmar() {
        System.out.println("Firmado con persona");
     }
    
}
