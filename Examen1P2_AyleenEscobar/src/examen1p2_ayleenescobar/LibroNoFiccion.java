
package examen1p2_ayleenescobar;

public class LibroNoFiccion extends Libros{
    private String tipoLibro;

    public LibroNoFiccion() {
        super();
    }

    public LibroNoFiccion(String tipoLibro, String nombre, String autor, double precio, int edicion) {
        super(nombre, autor, precio, edicion);
        this.tipoLibro = tipoLibro;
    }

    public String getTipoLibro() {
        return tipoLibro;
    }

    public void setTipoLibro(String tipoLibro) {
        this.tipoLibro = tipoLibro;
    }
    
    
}
