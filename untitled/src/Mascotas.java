import java.util.ArrayList;
import java.util.Scanner;

//Clase inventario
public abstract class Mascotas {

    //Clase Macota, Inventario de Perro, gato, Loro, Canario.

    //Atributos
    private static String nombre;
    private static int edad;
    private static String estado;
    private static String fechaNacimiento;

    //Constructor
    public Mascotas(String nombre, int edad, String estado, String fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }

    //GETTERS y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    //Metodos para implememtar:

    //Mostrar lista de animales
    public static void mostrar() {
        System.out.println("Tipo: ");
        System.out.println("Nombre: " + nombre);
    }

    //Mostrar todos los datos de un animal concreto | Metodo abstracto, lo heredan obligatoriamente
    public abstract void mostrarAnimal(Mascotas mascota);

    //Mostrar todos los datos de todos los animales
    public void mostrardatosAnimales(ArrayList<Mascotas> mascotas) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Estado: " + estado);
        System.out.println("FechaNacimiento: " + fechaNacimiento);
    }

    //Insertar animal en el inventario
    public void insertarAnimal(Mascotas mascota, ArrayList<Mascotas> mascotas) {
        mascotas.add(mascota);
    }

    //Eliminar animal del inventario
    public void eliminarAnimal(Mascotas mascota, ArrayList<Mascotas> mascotas) {
        mascotas.remove(mascota);
    }

    //Vaciar inventario
    public void vaciar(ArrayList<Mascotas> mascotas) {
        mascotas.clear();
    }


    //Clase main
    public static void main(String[] args) {

        ArrayList<Mascotas> mascotas = new ArrayList<>();

        Mascotas mascota1 = new Mascotas("perrete", 12, "acogida", "23/02/2010");


        Scanner sc = new Scanner(System.in);
        int opcion;

        //MENU SELECCION METODOS INVENTARIO [Mascotas]
        System.out.println("MENU DE SELECCIÓN  |  LISTA DE MASCOTAS\n");
        System.out.println("1. Mostrar lista de animales (tipo y nombre)");
        System.out.println("2. Mostrar todos los datos de un animal (introducir animal concreto)");
        System.out.println("3. Mostrar todos los datos de todos los animales del inventario");
        System.out.println("4. Insertar animales al inventario");
        System.out.println("5. Eliminar animales del inventario");
        System.out.println("6. Vaciar inventario");

        opcion = sc.nextInt();

        //Seleccion de metodo mediante opcion
        switch (opcion) {
            case 1 -> {
                Mascotas.mostrar();
            }
            case 2 -> {

                System.out.println("Ingrese el animal a mostrar: ");
            }
            case 3 -> {

            }
        }

    }
}


