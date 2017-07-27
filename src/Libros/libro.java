package Libros;

public class libro {
    private String titulo;
    private String autor;
    private int numP;
    private int calificacion;

    
    public libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    libro() {
            }

    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumP() {
        return numP;
    }

    public void setNumP(int numP) {
        this.numP = numP;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    



    
}
