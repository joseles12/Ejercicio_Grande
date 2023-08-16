// IMPORTAMOS EL PAQUETE COCHE
import vehiculos.Coche;

public class App {
    public static void main(String[] args) throws Exception {


        // USANDO LA CLASE COCHE PODEMOS CREAR UN COCHE
        // Y USAR SUS METODOS Y ATRIBUTOS DISPONIBLES

        Coche coche = new Coche();
        coche.plazas = 5;

        //LONGITUD NO SE PUEDE USAR DEBIDO A QUE ES PROTEGIDO
        //coche.longitud = 4.0;


        coche.arrancar();

        Coche coche2;

       /* Coche.color = "GRIS";

        Coche.comprobar();
        coche2.arrancar();


        Coche coche3 = new Coche( coche );
        coche2.copiar(coche);

         */ 
        

    }
}


//nombre, curso , nota 
//aprobado o no 
