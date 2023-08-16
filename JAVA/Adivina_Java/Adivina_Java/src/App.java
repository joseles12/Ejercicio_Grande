import java.util.Scanner;

public class App {

     static Scanner lectura = new Scanner(System.in);


     static int RevisarNumero( int NumeroUsuarioINT) {
        
        if ( NumeroUsuarioINT > 100) {

                do {

                System.out.println("Este numero no es valido");

                String SegundoIntento = lectura.nextLine();

                int SegundoIntentoINT = Integer.parseInt(SegundoIntento);

                NumeroUsuarioINT = SegundoIntentoINT;
                    
                } while (NumeroUsuarioINT > 100);
         }
        
        else { System.out.println("Este numero es valido");}

            return NumeroUsuarioINT;
        }



     static int GenerarAleatorio( int NumeroUsuarioINT) {

        Double NumeroAzar = (Math.random() * (NumeroUsuarioINT));

        int NumeroAzarINT = (int) Math.round(NumeroAzar);

        System.out.println ( " El numero generado a Azar es : " + NumeroAzarINT ); 

        return NumeroAzarINT;

    }


     static int AdivinarNumero ( int NumeroAzarINT ) {

         System.out.println ( " Intenta adivinar el numero" ); 
        
         String IntentoUsuario = lectura.nextLine();

         int IntentoUsuarioINT = Integer.parseInt(IntentoUsuario);

            if (!(IntentoUsuarioINT == NumeroAzarINT) ) { 

                    do {
                        
                        System.out.println ( " El numero no es correcto"); 
                        
                        String otroIntento = lectura.nextLine();

                        int otroIntentoINT = Integer.parseInt(otroIntento);

                        IntentoUsuarioINT = otroIntentoINT;

                        if ( ! ( (IntentoUsuarioINT - NumeroAzarINT) <= 5 )) {
                            System.out.println ( "Aun te queda"); 
                        }

                        else {System.out.println ( "Estas cerca");}

                    } while (!(IntentoUsuarioINT == NumeroAzarINT));

   
            }  else { System.out.println ( " El numero es correcto");  }

            return  IntentoUsuarioINT;

    }

    public static void main(String[] args) throws Exception {

    System.out.println("Indicame un numero entre 1-100");

    String NumeroUsuario = lectura.nextLine();

    int NumeroUsuarioINT = Integer.parseInt(NumeroUsuario);


    int RevisarNumero =  RevisarNumero( NumeroUsuarioINT );

    int GenerarNumeroAleatorio = GenerarAleatorio(NumeroUsuarioINT);


    int numeroAzar = GenerarNumeroAleatorio;

    int IntentoAdivina = AdivinarNumero(numeroAzar);

 
     }
}
