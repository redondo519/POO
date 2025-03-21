public class Lista {
    //Varios ejemplos de realizaciones en listas

    private int[] arrayLista;

    //Constructor inicializa el array con un tamaño 0
    public Lista() {
        arrayLista = new int[0];
    }

    //Obtener el numero de elementos insertados en la lista
    public int numElementos() {
        return arrayLista.length;
    }

    //Insertar un numero al final de la lista
    public void insertarNUMfinal(int num) {
        int[] aux = new int[arrayLista.length + 1];
        for (int i = 0; i < arrayLista.length; i++) {
            aux[i] = arrayLista[i];
        }
        aux[aux.length - 1] = num;
        arrayLista = aux;

    }

    //Insertar un numeri al inicio de la lista
    public void insertarNUMinicio(int num) {
        int[] aux = new int[arrayLista.length + 1];
        for (int i = 0; i < arrayLista.length; i++) {
            aux[i + 1] = arrayLista[i];
        }
        aux[0] = num;
        arrayLista = aux;
    }

    //Insertar un numero en posicion indicada
    public void insertarNUMpos(int pos, int num) {

        int[] aux = new int[arrayLista.length + 1];
        for (int i = 0; i < pos; i++) {
            aux[i] = arrayLista[i];
        }
        aux[pos] = num;
        for (int i = pos; i < arrayLista.length; i++) {
            aux[i + 1] = arrayLista[i];
        }
        arrayLista = aux;

    }

    public Conjunto obtener(int pos) {
        return arrayLista[pos];
    }

    //añadir lista al final
    public void insertarListafinal(Lista l) {
        for (int i = 0; i < l.numElementos(); i++) {
            int num = l.obtener(i);
            this.insertarNUMfinal(num);
        }

    }


    //buscar elemento
    public int buscar(int num) {
        int result = -1;
        for (int i = 0; i < arrayLista.length; i++) {
            if (arrayLista[i] == num) {
                result = i;
                break;
            }
        }
        return result;
    }


    public void mostrarLista() {
        for (int i = 0; i < arrayLista.length; i++) {
            System.out.print(arrayLista[i] + " ");

        }
        System.out.println();
    }


    //metodo concatena listas l1 +l2
    /*
    public static Lista concatenaListas(Lista l1, Lista l2) {
        Lista concac = new Lista();
        for (int i = 0; i < l1.numElementos(); i++) {
            concac.insertarNUMfinal(l1.obtener(i));

        }
        for (int i = 0; i < l2.numElementos(); i++) {
            concac.insertarNUMfinal(l2.obtener(i));
        }
        return concac;

    }*/
    public static Lista concatenaLista(Lista l1, Lista l2) {
        Lista result = new Lista();
        result.insertarListafinal(l1);
        result.insertarListafinal(l2);
        return result;
    }

    @Override
    public boolean equals(Object o) {

        Lista l = (Lista) o;
        boolean result = false;

        if (this.numElementos() == l.numElementos()) {
            Lista compara = new Lista();

            //Comparo elementos
            for (int i = 0; i < this.numElementos(); i++) {
                if (this.obtener(i) == l.obtener(i)) {
                    result = true;

                }
            }

        }
        return result;
    }
}
    







