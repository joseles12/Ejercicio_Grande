public class App {
    public static void main(String[] args) throws Exception {

        // CREAR ARRAY 
        String [] diasSemana;

        //INICIAR CON VALOR
        String [] diasSemanaValor = {"Lunes,Martes,Miercoles,Jueves,Sabado,Domingo"};
    
        // GENERAR POR TAMAÑAO

        String [] diasSemanaTamaño = new String [7];
        diasSemanaTamaño [0] = "Lunes";
        diasSemanaTamaño [1] = "Martes";
        diasSemanaTamaño [2] = "Miercoles";
        diasSemanaTamaño [3] = "Jueves";
        diasSemanaTamaño [4] = "Viernes";
        diasSemanaTamaño [5] = "Sabado";
        diasSemanaTamaño [6] = "Domingo";

        System.out.println(diasSemanaTamaño[4]);

        for (int contador = 0; contador < diasSemanaTamaño.length; contador++) {
            System.out.println(diasSemanaTamaño[contador]);
        }

        

    }
}
