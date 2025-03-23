public  class Gato extends Mascotas {

    //Atributos
    private String color;
    private boolean pelolargo;

    //Constructor | Hereda atributos de Mascotas
    public Gato(String nombre, int edad, String estado, String fechaNacimiento, String color, boolean pelolargo) {
        super(nombre, edad, estado, fechaNacimiento);
        this.color = color;
        this.pelolargo = pelolargo;
    }
    //GETTERS y SETTERS
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPelolargo() {
        return pelolargo;
    }

    public void setPelolargo(boolean pelolargo) {
        this.pelolargo = pelolargo;
    }

    @Override
    public void mostrarAnimal(Mascotas mascota) {
        System.out.println("Nombre: " + mascota.getNombre());
        System.out.println("Edad: " + mascota.getEdad());
        System.out.println("Estado: " + mascota.getEstado());
        System.out.println("FechaNacimiento: " + mascota.getFechaNacimiento());
    }
}
