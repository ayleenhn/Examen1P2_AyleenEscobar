
package examen1p2_ayleenescobar;

public class LibroTexto extends Libros{
    private String Curso, facultad;

    public LibroTexto() {
        super();
    }

    public LibroTexto(String Curso, String facultad, String nombre, String autor, int precio, int edicion) {
        super(nombre, autor, precio, edicion);
        this.Curso = Curso;
        this.facultad = facultad;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Curso) {
        this.Curso = Curso;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    
    
}
