
    public class Conjunto {
        private Lista l;
        public Conjunto() {
            l = new Lista();
        }
        public int numeroElementos() {
            return l.numElementos();
        }

        public boolean inertar(int nuevo){
            boolean insertado = false;
            if (l.buscar(nuevo)==-1){
                l.insertarNUMfinal(nuevo);
                insertado = true;
            }
            return insertado;
        }

        public boolean insertar(Conjunto otroConjunto){
            boolean insertado = false;
            for (int i = 0; i < otroConjunto.numeroElementos(); i++) {
                if(this.insertar(otroConjunto.l.obtener(i))){
                    insertado = true;
                }
            }
            return insertado;
        }


    }



