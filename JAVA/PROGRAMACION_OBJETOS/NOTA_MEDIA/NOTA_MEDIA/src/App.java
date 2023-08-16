
import Notas.nota;

import Global.constantes;

public class App {

    public static void main(String[] args) throws Exception {

        Notas.nota.pedirDatos();
 
        double notaMedia =  calcularMedia( constantes.NUMERO_ALUMNOS);
        
        System.out.println("La nota media es: " + notaMedia);
        
        Notas.nota.escribirAlumnosMayorMedia(nombresAlumnos, notasAlumnos, notaMedia);
       

    }
    

}
