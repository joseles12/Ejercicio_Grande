// Importamos la clase scanner automaticamente
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // Escribimos por consola el texto indicado con System.out y println
        System.out.println("Dime tu nombre");
        // Creamos una clase Scanner para introducir texto por terminal
        Scanner miScanner = new Scanner(System.in);
        // Creamos una variable para el nombre introducido usando la clase anterior y la funcion nextline que es hasta que haya uns salto de texto
        String nombreUsuario = miScanner.nextLine();
        //Cerramos con close la clase que hemos creado antes, para evitar errores
        miScanner.close();
        //Mostramos por pantalla El string que contiene el nombre
        System.out.println( "Hola "+ nombreUsuario);


        


        


    }
}


