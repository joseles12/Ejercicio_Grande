package alumnos;

public class Alumno {

    private String Nombre;
    private int  Curso;
    private float Nota;

    public void altaNota ( float Nota ) {

        this.Nota = Nota;
    }

    public boolean hasAprobado( ) {

        return ( Nota >= 5);   
    }


    public void setNota ( float Nota) {

        if ( Nota >= 0 && Nota >= 10 ) {

             this.Nota = Nota;

        }
        
        else {

             

        }
    }

      public void GetNota ( float Nota) {
        
        this.Nota = Nota;
    }


}



