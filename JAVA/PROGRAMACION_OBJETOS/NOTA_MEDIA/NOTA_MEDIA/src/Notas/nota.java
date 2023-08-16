package Notas;

import Global.constantes;

public class nota {

    static int pedirNumero(String nombreAlumno){
        int resultado = 0;
        boolean fallo = true;
        do {
            try{
                System.out.println("Dame la nota de " + nombreAlumno);
                String numeroLeido = constantes.lector.nextLine();
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
 
    public static void escribirAlumnosMayorMedia(String[] nombres, int[] notas, double media){
        System.out.println("Los alumnos por encima de la media son: ");
        for (int indice=0; indice<nombres.length; indice++){
            if (notas[indice] > media){
                System.out.println(nombres[indice]);
            }
        }
    }
 
    static String[] nombresAlumnos = new String[constantes.NUMERO_ALUMNOS];
    static int[] notasAlumnos = new int[constantes.NUMERO_ALUMNOS];
    
 
    public static void pedirDatos() {
       
        for (int contador =0; contador<constantes.NUMERO_ALUMNOS; contador++){
            System.out.println("Dame el nombre del alumno: " + (contador + 1));
            nombresAlumnos[contador] = constantes.lector.nextLine();
            notasAlumnos[contador] = pedirNumero(nombresAlumnos[contador]);
        }
    }
    
}
