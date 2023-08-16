package vehiculos;

public class OtroCoche {

   public void reparar() {

        Coche coche = new Coche();

        // EN ESTE FICHERO SE PUEDE USAR LONGITUD POR QUE ES PRIVADO
        // PERO ESTAMOS EN EL MISMO PAQUETE

        coche.longitud = 3;

   }
     
    
}
