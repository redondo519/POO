public abstract class Aves extends Mascotas {

    //Atributos
    private String pico; //Nombre tipo de pico
    private boolean vuela; //Si puede volar o no

    //Constructor | Hereda atributos de Mascotas, para extenderlos en Loro y Canario
    public Aves(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela) {
        super(nombre, edad, estado, fechaNacimiento);
        this.pico = pico;
        this.vuela = vuela;
    }

    //GETTERS y SETTTERS

    public String getPico() {
        return pico;
    }

    public void setPico(String pico) {
        this.pico = pico;
    }

    public boolean isVuela() {
        return vuela;
    }

    public void setVuela(boolean vuela) {
        this.vuela = vuela;
    }

    //metodo abstracto mostrar() de Mascotas | NO esta obligada a implementarlo, pero si lo hreda

    //Metodo volar | abstracto
    public abstract void volar();
}
