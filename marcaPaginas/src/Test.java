public class Test {
    public static void main(String[] args) {


        //creo un objeto Marcapagina
        MarcaPagina mp = new MarcaPagina();

        //Inc
        for (int i = 0; i < 20; i++){
            mp.incrementarPagina();
        }

        //Mostramos la ultima pagnina leida
        System.out.println("La ultima pagina leida es : "+mp.getUltimaPagina());

    }
}
