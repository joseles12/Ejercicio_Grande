
package Figuras;

import Global.Constantes;

public class Cuadrado {

    int lado;
   
    public void calcularAreaCuadrado () {

        System.out.println("Indicame el lado del cuadrado");

        String ladoS = Constantes.lectura.nextLine(); 

        int LadoI = Integer.parseInt(ladoS);

        int area = LadoI * LadoI;

        System.out.println("El resultado del area del cuadrado es : " + area );
    }
}