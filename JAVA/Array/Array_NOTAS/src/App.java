
// PEDIR NOMBRE DE 5 ALUMNOS E INGRESAR UNA NOTA PARA CADA UNO
// SACAR LA NOTA MEDIA DE LA CLASE 
// NOMBRES DE ALUMNOS QUE ESTEN POR ENCIMA DE LA MEDIA

import java.util.Scanner;

public class App {

    static Scanner lectura = new Scanner(System.in);

    static final int NUMERO_ALUMNOS = 5;

    static String [] listaClase = new String [NUMERO_ALUMNOS] ;

    static int  [] listaNotas = new int [NUMERO_ALUMNOS] ;



    static String [] PedirDatos() {

        System.out.println("Escribe la lista de alumnos");

         for ( int contador=0; contador < NUMERO_ALUMNOS; contador++) {

            System.out.println("Dime el nombre del alumno " + (contador+1));

            listaClase [contador] = lectura.nextLine();
        }

        return listaClase;
    }


    static void PedirNotas() {

        System.out.println("Escribe la lista de notas");

        for (int i=0; i < NUMERO_ALUMNOS; i++) {

                    System.out.println("Escribe la nota para el alumno " + (i+1));

                    String nota = lectura.nextLine();

                     listaNotas[i] = Integer.parseInt(nota); 

                }
    }


    static void NotaMedia () {

        for (int i=0; i < listaNotas.length; i++) {

                 double media = 0.0;

                 media = media + listaNotas[i];
                 media = media / listaNotas.length;

                 

                System.out.println("La nota media es : " + media );
         }
         
    }

    public static void main(String[] args) throws Exception {

    PedirDatos();
    PedirNotas();
    NotaMedia();
    

    }
}


/*import java.util.Scanner;
 
public class App {
    static Scanner lector = new Scanner(System.in);
    static final int NUMERO_ALUMNOS = 5;
 
    static String[] pedirNombres(){
        String[] nombres = new String[NUMERO_ALUMNOS];
        for (int contador =0; contador<NUMERO_ALUMNOS; contador++){
            System.out.println("Dame el nombre del alumno: " + (contador + 1));
            nombres[contador] = lector.nextLine();
        }
        return nombres;
    }
 
    static int pedirNumero(String nombreAlumno){
        int resultado = 0;
        boolean fallo = true;
        do {
            try{
                System.out.println("Dame la nota de " + nombreAlumno);
                String numeroLeido = lector.nextLine();
                resultado = Integer.parseInt(numeroLeido);
                fallo = false;
            }
            catch (Exception e){
                fallo = true;
                System.out.println("Valor inválido");
            }
        } while(fallo);
 
        return resultado;
    }
 
    static int[] pedirNotas(String[] nombres){
        int[] notas = new int[nombres.length];
        for (int contador = 0; contador < notas.length; contador++){
            notas[contador] = pedirNumero(nombres[contador]);
        }
        return notas;
    }
 
    static double calcularMedia(int[] coleccionEnteros){
        double totalSuma = 0;
        int numeroElementos = coleccionEnteros.length;
        for (int indice = 0; indice<numeroElementos; indice++){
            totalSuma = totalSuma + coleccionEnteros[indice];
        }
        return totalSuma / numeroElementos;
    }
 
    static void escribirAlumnosMayorMedia(String[] nombres, int[] notas, double media){
        System.out.println("Los alumnos por encima de la media son: ");
        for (int indice=0; indice<nombres.length; indice++){
            if (notas[indice] > media){
                System.out.println(nombres[indice]);
            }
        }
    }
 
    static String[] nombresAlumnos = new String[NUMERO_ALUMNOS];
    static int[] notasAlumnos = new int[NUMERO_ALUMNOS];
 
    static void pedirDatos(){
       
        for (int contador =0; contador<NUMERO_ALUMNOS; contador++){
            System.out.println("Dame el nombre del alumno: " + (contador + 1));
            nombresAlumnos[contador] = lector.nextLine();
            notasAlumnos[contador] = pedirNumero(nombresAlumnos[contador]);
        }
    }
 
    public static void main(String[] args) throws Exception {
       // String[] nombresAlumnos = pedirNombres();
       // int[] notasAlumnos = pedirNotas(nombresAlumnos);
 
        pedirDatos();
 
        double notaMedia = calcularMedia(notasAlumnos);
        System.out.println("La nota media es: " + notaMedia);
        escribirAlumnosMayorMedia(nombresAlumnos, notasAlumnos, notaMedia);
    }
} */

