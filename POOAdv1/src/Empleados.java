public class Empleados {
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String telefono;
    private double salario;


    public Empleados(String nombre, String apellido, String dni, String direccion, String telefono, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;


    }

    //Imprimir todos sus dato
    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("DNI: " + dni);
        System.out.println("Direccion: " + direccion);
        System.out.println("Telefono: " + telefono);
        System.out.println("Salario: " + salario);
    }

    //Incrementar salario
    public void incrementarSalario() {

        this.salario = salario * 1.01 ;

    }


    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
