package examen1p2_ayleenescobar;

public class LibroReferencia extends Libros{
    private String Tipo;
    

    public LibroReferencia() {
        super();
    }

    public LibroReferencia(String Tipo, String nombre, String autor, double precio, int edicion) {
        super(nombre, autor, precio, edicion);
        this.Tipo = Tipo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    
}
