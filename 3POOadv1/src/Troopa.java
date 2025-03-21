public class  Troopa extends Enemigo {

    private int vida;
    public Troopa(String nombre) {
        super(nombre);
        this.vida = 2;
    }

    @Override
    public void recibeAtaque(int golpe) {
        this.vida -= golpe;
    }

    @Override
    public void aparecer() {
        this.setEstado("visible");
    }

    @Override
    public String toString() {
        return "Nombre: " + this.getNombre() + ", vida: " + this.vida + "Estado: " + this.getEstado();
    }

    @Override
    public void mostrar() {

    }


}
