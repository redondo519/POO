public class Cuenta {

    private String titular;
    private String dni;
    private double saldo;


    //clase CUENTA
    public Cuenta(String dni, String titular) {
        this.titular = titular;
        this.dni = dni;
        this.saldo = 0.0;
    }


    //Sobreccarga de objeatos


    public Cuenta(String dni, double saldo) {
        this.titular = "";
        this.dni = dni;
        this.saldo = saldo;
    }

    public Cuenta(String dni, String titular, double saldo) {
        this.titular = titular;
        this.dni = dni;
        this.saldo = saldo;
    }




    //Constructures
    public void ingresar(double importe) {
        this.saldo += importe;
    }

    public boolean retirar(double importe) {
        if (this.saldo - importe < 0) {
            return false;
        } else {
            this.saldo -= importe;
            return true;
        }
    }

    public void mostrar() {
        System.out.println(this.titular);
        System.out.println(this.dni);
        System.out.println(this.saldo);
    }
}
