package examen1p2_ayleenescobar;

public class Libros {
    private String nombre, autor;
    private double precio;
    private int edicion;

    public Libros() {
    }

    public Libros(String nombre, String autor, double precio, int edicion) {
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }
    
    public void detallesLibros() {
        System.out.println("Título: " + this.nombre);
        System.out.println("Autor: " + this.autor);
        System.out.println("Precio: " + this.precio);
        System.out.println("Edicion: " + this.edicion);
        
        if (this instanceof LibroTexto) {
            LibroTexto LibroTexto = (LibroTexto) this;
            System.out.println("Curso: " + LibroTexto.getCurso());
            System.out.println("Facultad: " + LibroTexto.getFacultad());
            
        } else if (this instanceof LibroReferencia) {
            LibroReferencia LibroReferencia = (LibroReferencia) this;
            System.out.println("Tipo: " + LibroReferencia.getTipo());
            
        } else if (this instanceof LibroFiccion) {
            LibroFiccion LibroFiccion = (LibroFiccion) this;
            System.out.println("Tipo:: " + LibroFiccion.getTipoLibro());
            
        } else if (this instanceof LibroNoFiccion) {
            LibroNoFiccion LibroNoFiccion = (LibroNoFiccion) this;
            System.out.println("Tipo:: " + LibroNoFiccion.getTipoLibro());
        }
    }
    
    @Override
    public String toString() {
        return "Libros{" + "nombre=" + nombre + ", autor=" + autor + ", precio=" + precio + ", edicion=" + edicion + '}';
    }
    
    
}
