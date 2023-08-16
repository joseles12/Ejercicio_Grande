import java.util.Scanner;

public class App {

    static Scanner lectura = new Scanner(System.in);

    
    public static void main(String[] args) throws Exception {
        

        /* Pregunta 1: ¿De que color es el caballo blanco de Santiago? 
         * Respuesta 1: Blanco
         * 
         * Pregunta 2 : ¿Quien eres?
         * Respuesta 2: Una persona
        */


        System.out.println("Nombre del Jugador 1");
        String Jugador1 = lectura.nextLine();

        System.out.println("Nombre del Jugador 2");
        String Jugador2 = lectura.nextLine();

        System.out.println(  Jugador1  + " Introduza la pregunta para " +  Jugador2  );
        String Pregunta1 = lectura.nextLine();

         System.out.println(  "La Primera Pregunta para " + Jugador2  +  " de " +  Jugador1  + " es " + "¿ " +  Pregunta1   + " ? "  );

         System.out.println(  Jugador2  +  " Responda a la pregunta  de " +  Jugador1   );

        String Respuesta1 = lectura.nextLine();

        if (!Respuesta1.equals("Blanco")) {

             System.out.println( " La Respuesta de " + Jugador2  + " para " +  Jugador1  + " ha sido incorrecta ");
        }

        else {  System.out.println( " La Respuesta de " + Jugador2  + " para " +  Jugador1  + " ha sido correcta "); }
        
    }
}
