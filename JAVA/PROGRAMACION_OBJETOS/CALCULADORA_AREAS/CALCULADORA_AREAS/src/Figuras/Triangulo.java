package Figuras;

import Global.Constantes;

public class Triangulo {

    int base;
    int altura;

    
     public void calcularAreaTriangulo () {

        System.out.println("Indicame la base altura del triangulo");

        String alturaS = Constantes.lectura.nextLine(); 

        double alturaD = Integer.parseInt(alturaS);


        System.out.println("Indicame la base base del triangulo");

        String baseS = Constantes.lectura.nextLine(); 

        double baseD = Integer.parseInt(baseS);


        double area =  ( (baseD * alturaD ) / 2 ) ;

        System.out.println("El resultado del area del triangulo es : " + area );

    }

    
}
