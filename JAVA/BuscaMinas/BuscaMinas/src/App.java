
/*Se colocan una mina y un tesoro de forma aleatoria en un cuadrante de
 cinco filas por cinco columnas.El usuario intentará averiguar dónde 
 está el tesoro indicando la fila y columna que donde cree que está el tesoro */

import java.util.Random;
import java.util.Scanner;

public class App {

    static Scanner lector = new Scanner(System.in);

    static final int NUMERO_CASILLAS = 5; 

    static final char VACIO = 'V';
    static final char TESORO  = '€';
    static final char MINA = '#';
    static final char SELECCIONADO = 'S';

    static char[][] tablero;

    static void colocar(char elemento) {

        Random random = new Random();
        int fila, columna;

        do {

             fila = random.nextInt(NUMERO_CASILLAS);
             columna = random.nextInt(NUMERO_CASILLAS);

            if ( tablero [fila] [columna] == VACIO ) {
                 tablero[fila][columna] = elemento;

          }
       
        } while (tablero[fila][columna] != elemento );

    }

    static void GenerarTablero () {

        tablero = new char[NUMERO_CASILLAS][NUMERO_CASILLAS];

        for ( int fila = 0; fila < NUMERO_CASILLAS; fila ++) {

            for ( int columna = 0; columna < NUMERO_CASILLAS; columna ++) {
                tablero[fila][columna] = VACIO;
            }

        }

        colocar(MINA);
        colocar(TESORO);
    }

    static void PintarTableroVacio () {
        for ( int c = 0; c < NUMERO_CASILLAS; c++) {
            System.out.print("|---|");
        }

        System.out.println("");

        for ( int f=0; f< NUMERO_CASILLAS; f++) {
            for ( int c=0; c<NUMERO_CASILLAS; c++) {
                System.out.print("|   |");
            }

             for ( int c = 0; c < NUMERO_CASILLAS; c++) {
            System.out.print("|---|");

            }   

            System.out.println("");
        }

    }

    static void pedirFilaUsuario () {}

    static void pedirColumnaUsuario () {}
 
    public static void main(String[] args) throws Exception {

       
        GenerarTablero();
        PintarTableroVacio();

       int filaSeleccionada =  pedirFilaUsuario("FILA");
       int columnaSeleccionada = pedirColumnaUsuario("COLUMNA");



        /*

        System.out.println("Bienvenido a este juego, este juego consiste en encontrar el tesoro");
        System.out.println("En un cuadrante de cinco filas por cinco columnas");
        System.out.println("Debes indicarme la fila y la columna para ganar, pero si indicas la mina mueres");

        
        System.out.println("¿Indicandome tanto fila como columna donde crees que estara el tesoro?");


        System.out.println("Indicame la columna ");

        String ColumnaUsuario = lector.nextLine();
        int ColumnaUsuarioINT = Integer.parseInt(ColumnaUsuario);


        System.out.println("Indicame la fila  de la columna  " + ColumnaUsuario);

        String FilaUsuario = lector.nextLine();
        int FilaUsuarioINT = Integer.parseInt(FilaUsuario);

        */

    
        
        //System.out.println(cuadrante[3][4]);

        /* 
        cuadrante[0][0] = "ganaddor";   
        cuadrante[0][1] = "mina";
        cuadrante[0][2] = "normal";
        cuadrante[0][3] = "normal";
        cuadrante[0][4] = "normal";

        cuadrante[1][0] = "normal"; 
        cuadrante[1][1] = "normal";
        cuadrante[1][2] = "normal";
        cuadrante[1][3] = "normal";
        cuadrante[1][4] = "normal";

        cuadrante[2][0] = "normal"; 
        cuadrante[2][1] = "normal";
        cuadrante[2][2] = "normal";
        cuadrante[2][3] = "normal";
        cuadrante[2][4] = "normal";

        cuadrante[3][0] = "normal"; 
        cuadrante[3][1] = "normal";
        cuadrante[3][2] = "normal";
        cuadrante[3][3] = "normal";
        cuadrante[3][4] = "normal";

        cuadrante[4][0] = "normal"; 
        cuadrante[4][1] = "normal";
        cuadrante[4][2] = "normal";
        cuadrante[4][3] = "normal";
        cuadrante[4][4] = "normal"; 

        */



           /*
     * static void Comprobar( int FilaUsuarioINT , int ColumnaUsuarioINT) {

        //int [][] cuadrante_usuario = new int[FilaUsuarioINT][ColumnaUsuarioINT];

        System.out.println(" Tu eleccion ha sido : " +  " Columna  " +  ColumnaUsuarioINT  + " Fila " +  FilaUsuarioINT);


         Comprobar( FilaUsuarioINT , ColumnaUsuarioINT ); 

    }
     */


         

    }
}
