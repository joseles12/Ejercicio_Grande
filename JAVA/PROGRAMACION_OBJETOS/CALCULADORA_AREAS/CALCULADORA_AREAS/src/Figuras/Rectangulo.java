package Figuras;

import Global.Constantes;

public class Rectangulo { 
    
    int lado ;
    int altura;


    public void calcularAreaRectangulo () {

        System.out.println("Indicame la base altura del rectangulo");

        String alturaS = Constantes.lectura.nextLine(); 

        int alturaD = Integer.parseInt(alturaS);


        System.out.println("Indicame la base base del rectangulo");

        String baseS = Constantes.lectura.nextLine(); 

        int baseD = Integer.parseInt(baseS);


        int area =  ( (baseD * alturaD ) / 2 ) ;

        System.out.println("El resultado del area del rectangulo es : " + area );

    }

    

}

