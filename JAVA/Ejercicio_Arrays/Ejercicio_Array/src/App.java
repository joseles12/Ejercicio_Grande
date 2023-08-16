import java.util.Scanner;

public class App {

     static Scanner lectura = new Scanner(System.in);

     static final int NUMERO_ENTEROS = 5;

     static int [] LeerDatos () { 


            int [] NumerosLeidos = new int [NUMERO_ENTEROS];

            System.out.println( "Dame " + NUMERO_ENTEROS  + " Numeros " );

            for (int contador = 0; contador < NUMERO_ENTEROS; contador++) {

                 System.out.println("Dame el numero " + (contador + 1) );

                 String NumerosLeido = lectura.nextLine();
    
                 NumerosLeidos[contador] = Integer.parseInt(NumerosLeido);

            }

            return NumerosLeidos;

    }

    static int BuscarMinimo(int [] listaEnteros ) {

        int minimo = listaEnteros [0];

        for (int contador = 0; contador < NUMERO_ENTEROS; contador ++) {
             int valorLeido = listaEnteros[contador];
            
                if (valorLeido < minimo) {
                    minimo = valorLeido;
                }
           }
            return minimo;
        }

    public static void main(String[] args) throws Exception {

        /*Buscar el numero minimo de los introducidos por el usuario */
    
        int [] ArrayEnteros = new int [NUMERO_ENTEROS];

        ArrayEnteros = LeerDatos();

        int minimo = BuscarMinimo(ArrayEnteros);

        System.out.println("El minimo es : " +  minimo);

      
        




        
    






    }
}
