public abstract class Enemigo {
    private String nombre;
    private int velocidad;
    private String estado;
    private String ejeMovimiento;


    public Enemigo(String nombre) {
        this.nombre = nombre;
        this.velocidad = 2;
        this.estado = "desactivado";
        this.ejeMovimiento = "horizontal";
    }

    public abstract void recibeAtaque(int golpe);

    public abstract void aparecer();

    public final void desaparecer() {
        this.estado = "eleminado";
    }


    public void setEstado(String estado) {
        this.estado = estado;
    }


    @Override
    public abstract String toString();


    public abstract void mostrar();

    public String getNombre() {
        return nombre;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public String getEstado() {
        return estado;
    }

    public String getEjeMovimiento() {
        return ejeMovimiento;
    }
}
