
// IMPORTAMOS EL PAQUETE VEHICULOS

package vehiculos;


// CREAMOS UNA CLASE QUE SE LLAMARA COCHE
// CON SUS METODOS Y DATOS

/*
 * Private : Solo permite usarlo dentro del mismo paquete
 * Protected : Solo se usa en el mismo fichero
 * Public: Se puede usar en cualquier parte
*/

public class Coche {
    
    private  static String color;
    protected float longitud;
    public int plazas;

public Coche () {


}

public Coche( Coche cocheParaCopiar ) {

    this.color = cocheParaCopiar.color;
    this.longitud = cocheParaCopiar.longitud;
    this.plazas = cocheParaCopiar.plazas;

}

/*

public Coche copiar (  Coche cocheParaCopiar ) {

    Coche c = new Coche();
    c = cocheParaCopiar;
    
}

*/

    public static void comprobar() {

        color = "VERDE";

        System.out.println("Comprobando");
        
    }

    public void arrancar() {

        this.color = "AZUL";

        System.out.println("Arrancando");
    }

      protected void acelerar() {

        System.out.println("Acelerando");
    }


      private void parar() {

        System.out.println("Parando");
    }

   //  public abstract void MetodoAbstracto ( int param );


}
