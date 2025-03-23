public class Perro extends Mascotas {
    private String raza;
    private boolean pulgas; //Si tiene pulgas o no


    //Constructor, Hereda atributos de Mascotas
    public Perro(String nombre, int edad, String estado, String fechaNacimiento, String raza, boolean pulgas) {
        super(nombre, edad, estado, fechaNacimiento);
        this.raza = raza;
        this.pulgas = pulgas;
    }

    //GETTERS y SETTERS
    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public boolean isPulgas() {
        return pulgas;
    }
    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }


    @Override
    public void mostrarAnimal(Mascotas mascota) {
        System.out.println("Nombre: " + mascota.getNombre());
        System.out.println("Edad: " + mascota.getEdad());
        System.out.println("Estado: " + mascota.getEstado());
        System.out.println("FechaNacimiento: " + mascota.getFechaNacimiento());
        System.out.println("Raza: " + raza);
        System.out.println("Pulgas: " + pulgas);
    }
}
