public abstract class Instrumentos {

    private String [] notas ;
    public Instrumentos() {
        notas = new String[7];
    }

    public void add(String nuevaNota) {
        String [] aux = new String[notas.length+1];
        for(int i = 0; i < notas.length; i++){
            aux[i] = notas[i];
        }
        aux[notas.length] = nuevaNota;
        notas = aux;
    }

    public void mostrar() {
        for(int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
        }
    }

    public abstract void interpretar();


}
