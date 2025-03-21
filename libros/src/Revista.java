public class Revista implements Publicacion {

    private String titulo;
    private int isbn;
    private int numpags;
    private int fecha;

    public Revista( int isbn,String titulo, int numpags, int fecha) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.numpags = numpags;
        this.fecha = fecha;
    }
}
