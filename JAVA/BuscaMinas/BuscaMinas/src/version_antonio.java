import java.util.Random;
import java.util.Scanner;
 
public class version_antonio {
    
    static Scanner lector = new Scanner(System.in);
    
    static final char VACIO = 'V';
    static final char TESORO = '€';
    static final char MINA = '#';
    static final char SELECCIONADO = 'S';
 
    static final int NUMERO_CASILLAS = 5;
    static char[][] tablero;
 
    static void colocar(char elemento){
        Random random = new Random();
        int fila, columna;
 
        boolean colocado = false;
        do{
            fila = random.nextInt(NUMERO_CASILLAS);
            columna = random.nextInt(NUMERO_CASILLAS);
            if (tablero[fila][columna] == VACIO){
                tablero[fila][columna] = elemento;
                colocado = true;
            }
        } while (!colocado);
    }
 
    static void inicializarTablero(){
        tablero = new char[NUMERO_CASILLAS][NUMERO_CASILLAS];
        for (int fila = 0; fila<NUMERO_CASILLAS; fila++){
            for (int columna = 0; columna<NUMERO_CASILLAS; columna++){
                tablero[fila][columna] = VACIO;
            }
        }
       
        colocar(MINA);
        colocar(TESORO);
    }


 
    static void dibujarTablero(boolean limpio){
         for (int f=0; f<NUMERO_CASILLAS; f++){
            for (int c = 0; c<NUMERO_CASILLAS; c++){
                System.out.print("|---|");
            }
            System.out.println("");
            for (int c=0; c<NUMERO_CASILLAS; c++){
                if (limpio){
                    System.out.print("|    |");
                }
                else{
                    if (tablero[f][c] == SELECCIONADO){
                        System.out.print("|  S  |");
                    }
                    else{
                    System.out.print("|    |");
                    }
                }
            }
            System.out.println("");
            for (int c = 0; c<NUMERO_CASILLAS; c++){
                System.out.print("|---|");
            }
            System.out.println("");
        }
    }
 
    static int pedirDatoUsuario(String dato){
       
        int resultado = 0;
        boolean fallo = true;
        do {
            try{
                System.out.println("Dame la "+ dato);
                String numeroLeido = lector.nextLine();
                resultado = Integer.parseInt(numeroLeido);
                if (resultado >= 0 && resultado < NUMERO_CASILLAS){
                    fallo = false;
                }
                else{
                    System.out.println("El valor tiene que estar entre 0 y  " + (NUMERO_CASILLAS-1));
                }
            }
            catch (Exception e){
                fallo = true;
                System.out.println("Valor inválido");
            }
        } while(fallo);
        //lector.close();
        return resultado;
    }
 
    static boolean procesarJugada(int fila, int columna){
        boolean fin = false;
 
        switch (tablero[fila][columna]){
            case MINA:
                System.out.println("Has perdido!!!");
                fin = true;
                break;
            case TESORO:
                System.out.println("Enhorabuena, has ganado!!!");
                fin = true;
                break;
            default:
                tablero[fila][columna] = SELECCIONADO;
                dibujarTablero(false);
                break;
        }
 
        return fin;
    }
 
    static void jugarPartida(){
        inicializarTablero();
        dibujarTablero(true);
        boolean terminado = false;
        do{
            int filaSeleccionada = pedirDatoUsuario("FILA");
            int columnaSeleccionada = pedirDatoUsuario("COLUMNA");
 
            terminado = procesarJugada(filaSeleccionada, columnaSeleccionada);
        } while (!terminado);
    }
 
    public static void main(String[] args) throws Exception {
        String otra = "";
       do{
            jugarPartida();
            System.out.println("Otra partida?(S/n)");
            otra = lector.nextLine();
       } while (otra.equals("S"));
    }
}