package Libros;

import java.util.ArrayList;
import java.util.Collection;

public class conjuntoLibros {

    ArrayList<String> almacena = new ArrayList<String>();

    public conjuntoLibros() {

//        for (int i = 1; i < 10; i++) {
//            almacena.add("libro" + i);
//
//            System.out.println(almacena.get(i));
//        }

    }
    libro Libro = new libro();

    public void crearLibro(String titulo, String autor, int nump, int calificacion) {
        Libro.getTitulo();
        Libro.setTitulo(titulo);
        Libro.getAutor();
        Libro.setAutor(autor);
        Libro.getNumP();
        Libro.setNumP(nump);
        Libro.getCalificacion();
        Libro.setCalificacion(calificacion);

        
        
        System.out.println("el libro es:  " + Libro.getTitulo() + Libro.getAutor() + Libro.getNumP() + Libro.getCalificacion());
    
    
    }

    public libro buscarLibro(String titulo, String autor) {

        return null;

    }

}
