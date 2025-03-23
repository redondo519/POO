public class Loro extends Aves {
    //Atributos
    private String descripcionVuelo; //descripccion del tipo de vuelo
    private String origen; //Palabra indica el origen
    private boolean habla; //Si habla o no

    //Constructor | Hereda atributos de Aves
    public Loro(String nombre, int edad, String estado, String fechaNacimiento, String pico, boolean vuela, String descripcionVuelo, String origen, boolean habla) {
        super(nombre, edad, estado, fechaNacimiento, pico, vuela);
        this.descripcionVuelo = descripcionVuelo;
        this.origen = origen;
        this.habla = habla;
    }

    //GETTERS y SETTERS
    public String getDescripcionVuelo() {
        return descripcionVuelo;
    }

    public void setDescripcionVuelo(String descripcionVuelo) {
        this.descripcionVuelo = descripcionVuelo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }



    //Implementacion metodos: Aves[volar()]  |  Mascotas [mostrarAnimal()]
    @Override
    public void volar() {
        if(super.isVuela()){
            System.out.println("Descripcion del tipo de vuelo: "+ descripcionVuelo);
        }else{
            System.out.println(" Este loro no puede volar ");
        }

    }

    @Override
    public void mostrarAnimal(Mascotas mascota) {
        //System.out.println(mascota.toString());
        System.out.println("Nombre:" + mascota.getNombre());
        System.out.println("Edad:" + mascota.getEdad());
        System.out.println("Estado:" + mascota.getEstado());
        System.out.println("Fecha:" + mascota.getFechaNacimiento());
        System.out.println("origen" + origen);
        System.out.println("habla" + habla);
    }

    //Metodo saluda, si puede hablar
    public void saluda(){
        if(habla){
            System.out.println("¡Hoola humano!");
        }
    }

}
