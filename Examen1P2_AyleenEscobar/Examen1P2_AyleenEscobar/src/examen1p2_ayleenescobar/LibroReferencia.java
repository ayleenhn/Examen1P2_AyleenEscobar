package examen1p2_ayleenescobar;

public class LibroReferencia extends Libros{
    private String Tipo;
    private boolean Ficcion;
    
    //cd + C:\Users\famil\OneDrive\Desktop\PROGRAMACION II\Examen1P2_AyleenEscobar

    public LibroReferencia() {
        super();
    }

    public LibroReferencia(String Tipo, boolean Ficcion, String nombre, String autor, int precio, int edicion) {
        super(nombre, autor, precio, edicion);
        this.Tipo = Tipo;
        this.Ficcion = Ficcion;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public boolean isFiccion() {
        return Ficcion;
    }

    public void setFiccion(boolean Ficcion) {
        this.Ficcion = Ficcion;
    }
    
    
}
