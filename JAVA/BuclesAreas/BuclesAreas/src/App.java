
import java.util.Scanner;
 
public class App {
 
    // CAPTURAR OPCION USUARIO

    static Scanner lectura = new Scanner(System.in);
 

    // CALCULAR RECTANGULO

    static int calcularAreaRectangulo(String base, String altura){
        int iBase = Integer.parseInt(base);
        int iAltura = Integer.parseInt(altura);
       
        int areaCalculada = iBase * iAltura;
        return areaCalculada;
    }
 
    // CALCULAR TRIANGULO Y CUADRADO

    static double calcularAreaTriangulo (String base, String altura){
        return (Double.parseDouble(base) * Double.parseDouble(altura))/2;
    }
 
    static double calcularArea(int opcionSolicitada){
       
        double area = -1;
        switch (opcionSolicitada) {
            case 1, 2:
                System.out.println ( "Dame la altura: ");
                String altura = lectura.nextLine();
                System.out.println ( "Dame la base: ");
                String base = lectura.nextLine();
                if (opcionSolicitada == 1) {
                    area = calcularAreaTriangulo(base, altura);
                } else{
                    area = calcularAreaRectangulo(base, altura);
                }
            break;
            case 3:
       
                System.out.println ("Dame el lado del cuadrado:");
                String lado = lectura.nextLine();
                area = calcularAreaRectangulo(lado, lado);
            default:
                System.out.println( "Opción no válida");
                break;
        }
        return area;
    }
 

    // MENU DE OPCIONES

    static String menu(){
        System.out.println ("Qué quieres calcular: ");
        System.out.println ("1.-Triangulo");
        System.out.println ("2.-Rectangulo");
        System.out.println ("3.-Cuadrado");
        String opcionElegida = lectura.nextLine();

        return opcionElegida;
    }


    // RESULTADO A USUARIO CON BUCLE

    public static void main(String[] args) throws Exception {

         Boolean salir = false;

         do {
 
            String elegido = menu();
            int opcionElegida = Integer.parseInt(elegido);
            double area = calcularArea(opcionElegida);
    
            System.out.println ( "El área calculada es: " + area );  

            boolean voleraPreguntar = false;

            do {

                System.out.println ( "¿Otro calculo?"); 
                String continuar = lectura.nextLine();

                    if (continuar.equals("N") || (continuar.equals("n1") )) {

                        salir = true;
                        voleraPreguntar = false;
                    }

                    else {
                        if (continuar.equals("S") || (continuar.equals("s") )) {
                            salir = false;
                            voleraPreguntar = false;
                        }

                        else {
                            voleraPreguntar = true;
                        }
                    }

            } while (voleraPreguntar);
        
            } while (! salir);    
        }

    }

