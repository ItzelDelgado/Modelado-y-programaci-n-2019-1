/**
 * @author Delgado Díaz Itzel Azucena
 * @author Martínez Mendóza Miguel Angel
 * @author Rojas Espinoza Luis Angel
 * @date 03 de Octubre 2018
 */

/**Clase que construye un objeto de tipo libro que tiene
 * como atributos el titulo,el autor y el year de publicacion.
 */

public class Libro{
    //Un String que contiene el titulo del libro
    String titulo;
    //Un String que contiene el autor del libro
    String autor;
    //int un entero que contiene el año de publicacion
    int year;

    /**Metodo constructor*/
    
    public Libro(String titulo, String autor, int year) {
        this.titulo = titulo;
        this.autor = autor;
        this.year = year;
    }


     /**
     *@return metodo que regresa el titulo del libro.
     */
    public String getTitulo() {
        return titulo;
    }

     /**
     *@param recibe un String con el nombre del libro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

     /**
     *@return metodo que regresa el autor del libro.
     */
    public String getAutor() {
        return autor;
    }

     /**
     *@param recibe un String con el autor del libro
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }


     /**
     *@return int, metodo que regresa el a;o de publicacion del libro.
     */
    public int getYear() {
        return year;
    }
      

      /**
     *@param recibe un int con el a;o de publicacion del libro
     */
    public void setYear(int year) {
        this.year = year;
    }
}
