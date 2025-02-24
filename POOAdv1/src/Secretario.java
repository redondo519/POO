public class Secretario extends Empleados {

    private String despacho;


    public Secretario(String nombre, String apellido, String dni, String direccion, String telefono, double salario, String despacho) {
        super(nombre, apellido, dni, direccion, telefono, salario);
        this.despacho = despacho;
    }


    @Override
    public void imprimir(){
        super.imprimir();
        System.out.println("Despacho: " + despacho);

    }

    @Override
    public void incrementarSalario() {
        this.setSalario(this.getSalario()*1.05);

    }
}


