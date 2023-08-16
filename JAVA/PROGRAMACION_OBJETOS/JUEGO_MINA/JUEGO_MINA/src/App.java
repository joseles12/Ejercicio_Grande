

public class App {

    public static void main(String[] args) throws Exception {
        String otra = "";
       do{
            jugarPartida();
            System.out.println("Otra partida?(S/n)");
            otra = lector.nextLine();
       } while (otra.equals("S"));
    }
    
}
