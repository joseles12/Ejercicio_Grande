import java.util.Scanner;

public class App {

    static final int NUMERO_LISTA_CLASE = 4;

    static Scanner lectura = new Scanner(System.in);

    static String pedirNombre() {
        System.out.println("Dime tu nombre");
        return lectura.nextLine();
       
    }

    static String [] pedirLista () {

        System.out.println("Dame la lista de clase");
        String[] listaClase = new String[NUMERO_LISTA_CLASE];

        for ( int contador=0; contador < NUMERO_LISTA_CLASE; contador++) {
            System.out.println("Dime el nombre del alumno " + (contador+1));
            listaClase [contador] = lectura.nextLine();
        }

        return listaClase;
    }

    static boolean buscarNombreEnLista (String elementoABuscar , String [] listaElementos) {

        boolean encontrado = false;
        for (int contador = 0; contador < NUMERO_LISTA_CLASE; contador ++) {
            if (elementoABuscar.equals(listaElementos[contador]));
            encontrado = true;
        }

        return encontrado;
    }


     static void escribirResultado ( boolean encontrado ) {
        if ( encontrado ) {
            System.out.println("Estas en clase");
        }

        else {
            System.out.println("No estas en clase");
        }
    }

    static void funcionalidadBuscar() {

        String nombreLeido = pedirNombre();
        String [] listaClase = pedirLista();
        boolean encontrado = buscarNombreEnLista(nombreLeido, listaClase);
        escribirResultado(encontrado);
    }


    public static void main(String[] args) throws Exception {

    funcionalidadBuscar();
    
    }
}
