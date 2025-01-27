public class MarcaPagina {
    private int pag;


    //constructor 1
    public MarcaPagina(int pag) {
        this.pag = pag;
    }
    //constructor 2
    public MarcaPagina() {
        this.pag = 0;
    }
    //Incrementar de una en una
    public void incrementarPagina(){
        this.pag++;
    }

    //Mostrar ultima pagina
    public int getUltimaPagina() {
        return this.pag;
    }

    //Comenzar lectura en 0
    public void comenzarLectura(){
        this.pag = 0;
    }
}