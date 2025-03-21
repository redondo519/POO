
public class Pila extends Lista{
    public Pila(){
        super();
    }

    public void apilar(int valor){
        this.insertarNUMfinal(valor);

    }
    public int desapilar(){
        int resultado = super.obtener(super.numElementos()-1);
        //super.eliminar

        return resultado;
    }


}
