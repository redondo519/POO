public class JefedeZona extends Empleados {

    private String despacho;
    private Secretario secretario;
    private String matricula;
    private Vendedor[] vendedores;


    public JefedeZona(String nombre, String apellido, String dni, String direccion, String telefono, double salario, String despacho, Secretario secretario, String matricula, Vendedor[] vendedores) {
        super(nombre, apellido, dni, direccion, telefono, salario);
        this.despacho = despacho;
        this.secretario = secretario;
        this.matricula = matricula;
        this.vendedores = vendedores;

    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Despacho: " + despacho);
        System.out.println("Secretario: ");
        secretario.imprimir();
        System.out.println("Matricula: " + matricula);
        System.out.println("Vendedores: ");
        for (int i = 0; i < vendedores.length; i++) {
            vendedores[i].imprimir();
        }


    }
    public void cambiarSecretario(Secretario s){
        this.secretario = s;
    }


}
