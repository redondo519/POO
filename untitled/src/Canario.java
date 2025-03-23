public class Canario extends Aves{

    //Atributos
    private String color;
    private boolean canta;
    private String descripcionVuelo;

    //Constructor |Hereda de Aves

    public Canario(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela, String color, boolean canta, String descripcionVuelo) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.color = color;
        this.canta = canta;
    }

    //GETTERS y SETTERS
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCanta() {
        return canta;
    }

    public void setCanta(boolean canta) {
        this.canta = canta;
    }

    //Implementacion de metodos: Aves[volar()]  |  Mascotas [mostrarAnimal()]
    @Override
    public void volar() {
        if(super.isVuela()){
            System.out.println("Descripcion del tipo de vuelo: "+ descripcionVuelo);
        }else{
            System.out.println(" Este canario no puede volar ");
        }
    }

    @Override
    public void mostrarAnimal(Mascotas mascota) {
        System.out.println("Nombre:" + mascota.getNombre());
        System.out.println("Edad:" + mascota.getEdad());
        System.out.println("Estado:" + mascota.getEstado());
        System.out.println("Fecha:" + mascota.getFechaNacimiento());
        System.out.println("Color:" + color);
        System.out.println("Canta:" + canta);


    }
}
