public class Pila {

    int[] arrayPila;
    public Pila(){
        int [] arrayPila = new int [0];
    }

    public int tamPila(){
        return arrayPila.length;
    }

    public void apilar(int num){
        int [] aux = new int [arrayPila.length + 1];
        for(int i = 0; i < arrayPila.length; i++){
            aux[i+1] = arrayPila[i];
            aux[aux.length-1] = num;
        }
        arrayPila = aux;
    }


}
