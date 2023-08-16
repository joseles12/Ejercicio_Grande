import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("Que operacion quiere realizar");
        System.out.println("Siendo las operaciones : ");
        System.out.println("1.Sumar");
        System.out.println("2.Restar");
        System.out.println("3.Dividir");
        System.out.println("4.Multiplicar");

        Scanner Scanner_operacion = new Scanner(System.in);
        String eleccionUsuario = Scanner_operacion.nextLine();
    

        System.out.println("Cual es el primer operador");
        String  valorTexto1= Scanner_operacion.nextLine();

        System.out.println("Cual es el segundo operador");
        String valorTexto2 = Scanner_operacion.nextLine();

        Scanner_operacion.close();

        int valor_Integro_1 = Integer.parseInt(valorTexto1);
        int valor_Integro_2 = Integer.parseInt(valorTexto2);

        int eleccionUsuario_INT = Integer.parseInt(eleccionUsuario);

          //Al ser un String podemos sacar el primer numero de una cadena
          //De esta manera nos aseguramos de ser un String de tomar solamente el primer numero
          //if (operacion.length() == 1)
          //switch (eleccionUsuario_INT.charAt(index:0)) {
          // case  '1':

          String mensajeDeSalida = "El resultado es : ";
          int Resultado = 0;

           switch (eleccionUsuario_INT) {
                    case 1:
                      Resultado = valor_Integro_1  + valor_Integro_2 ;  
                      System.out.println( mensajeDeSalida + Resultado);
                    break;

                    case  2:
                      Resultado = valor_Integro_1 -  valor_Integro_2;
                      System.out.println( mensajeDeSalida  + Resultado);
                    break;

                    case  3:
                       Resultado = valor_Integro_1  /  valor_Integro_2;
                       System.out.println( mensajeDeSalida + Resultado);
                    break;

                    case  4:
                        Resultado = valor_Integro_1  *  valor_Integro_2;
                        System.out.println( mensajeDeSalida + Resultado);
                    break;

                    default:
                      mensajeDeSalida = "Opcion no valida";
                    break;

                    }
         }
}
