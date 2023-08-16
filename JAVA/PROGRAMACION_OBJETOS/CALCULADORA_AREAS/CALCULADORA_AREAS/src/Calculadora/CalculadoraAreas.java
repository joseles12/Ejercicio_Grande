
package Calculadora;

import Figuras.Rectangulo;
import Figuras.Triangulo;
import Figuras.Cuadrado;

import Global.Constantes;

public class CalculadoraAreas {

    public void CalculoARealizar() {

        System.out.println("¿Que area quieres calcular?");
        System.out.println("1.Cuadrado 2.Rectangulo 3.Triangulo");

        String opcion = Constantes.lectura.nextLine();

        int opcionElegida = Integer.parseInt(opcion);

        switch (opcionElegida) {

            case 1:
                 Cuadrado cuadrado = new Cuadrado();
                 cuadrado.calcularAreaCuadrado();
                break;

            case 2:
                Rectangulo rectangulo = new Rectangulo();
                rectangulo.calcularAreaRectangulo();
                break;
        
            case 3:
                Triangulo triangulo = new Triangulo();
                triangulo.calcularAreaTriangulo();
                break;

            default:
                System.out.println("Esa no es una opcion valida");
                break;
        }         

    }    

}
