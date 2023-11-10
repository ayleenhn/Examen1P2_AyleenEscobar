package examen1p2_ayleenescobar;

public class Libros {
    private String nombre, autor;
    private int precio, edicion;

    public Libros() {
    }

    public Libros(String nombre, String autor, int precio, int edicion) {
        this.nombre = nombre;
        this.autor = autor;
        this.precio = precio;
        this.edicion = 1;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }

    @Override
    public String toString() {
        return "Libros{" + "nombre=" + nombre + ", autor=" + autor + ", precio=" + precio + ", edicion=" + edicion + '}';
    }
    
    
}
