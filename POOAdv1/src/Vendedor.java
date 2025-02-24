public class Vendedor extends Empleados {

    private String matriculaCoche;
    private String tlfMovil;
    private String areaVenta;



    public Vendedor(String nombre, String apellido, String dni, String direccion, String telefono, double salario, String matriculaCoche, String tlf, String areaV) {
        super(nombre, apellido, dni, direccion, telefono, salario);
        this.matriculaCoche = matriculaCoche;
        this.tlfMovil = tlf;
        this.areaVenta = areaV;
    }

    public void cambioCoche(String matricula) {
        this.matriculaCoche = matricula;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Matricula Coche: " + matriculaCoche);
        System.out.println("Tlf Movil: " + tlfMovil);
        System.out.println("Area Venta: " + areaVenta);
    }

    @Override
    public void incrementarSalario() {
        this.setSalario(this.getSalario() *1.1);

    }



}
