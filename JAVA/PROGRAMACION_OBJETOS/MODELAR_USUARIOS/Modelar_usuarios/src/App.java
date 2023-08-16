
import alumnos.Alumno;

public class App {
    public static void main(String[] args) throws Exception {

        Alumno[] clase = new Alumno (5);

        boolean hasAprobado = clase[0].hasAprobado();

        clase[0].setNota(0);
       
    }
}
