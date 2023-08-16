import java.util.Scanner;

public class App {

    static Scanner lector = new Scanner(System.in);

    static boolean error = true;

    public static void main(String[] args) throws Exception {

 do { 

    try {
            System.out.println("Introduzca un numero o no");
            
            String NumeroUsuario = lector.nextLine();

            int NumeroUsuarioINT = Integer.parseInt(NumeroUsuario);

                for (int i= 1; i <= 10; i++) {

                    int resultado;

                    resultado = NumeroUsuarioINT * i ;

                    System.out.println("La tabla de multiplicar del numero  " + NumeroUsuarioINT +  " es : "  + resultado );
                    error = false;
                }

         } catch (Exception e) {

            error = true;
            System.out.println("Eso no es un numero");            
        }
 
} while ( error );
    
       
    }
}
