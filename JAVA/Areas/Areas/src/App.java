import java.util.Scanner;

public class App { 
    
   ///Creamos un scanner para que lea todos los datos del usuario
   static Scanner lecturaDatos = new Scanner(System.in);

   //CALCULAR AREA RECTANGULO
   static int CalcularAreaRectangulo (String base, String  altura) {

    int IntBase = Integer.parseInt(base);
    int IntAltura = Integer.parseInt(altura);

    int areaCalculada = IntBase * IntAltura;
    return areaCalculada;
    
   }

   // CALCULAR AREA TRINANGULO

   static double CalcularTriangulo (String base, String  altura) {

    Double DBase = Double.parseDouble(base);
    Double DAltura = Double.parseDouble(altura);

    Double areaCalculada = ( (DBase * DAltura ) / 2);

    return areaCalculada;
    
   }


   // OPCION SOLICIDADA

}



