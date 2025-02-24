public class CuentaB2 {
    private String cliente;
    private String numeroCuenta;
    private double interes;
    private double saldo;



    //Constructor vacio
    public CuentaB2() {

    }

    //Constructor todos los parametros
    public CuentaB2(String cliente, String numeroCuenta, double interes, double saldo) {
        this.cliente = cliente;
        this.numeroCuenta = numeroCuenta;
        this.interes = interes;
        this.saldo = saldo;
    }

    //Constructor copia
    public CuentaB2(CuentaB2 cuenta ) {
        this.cliente = getCliente();
        this.numeroCuenta = getNumeroCuenta();
        this.interes = getInteres();
        this.saldo = getSaldo();

    }

    public String getCliente() {
        return cliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getInteres() {
        return interes;
    }

    public double getSaldo() {
        return saldo;
    }



    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }




    //Ingreso en cuenta (aumenta saldo  /  devuelve realizado/no)
    public boolean ingreso(double incremento){
        boolean realizado = false;
        if(incremento >= 0) {
            this.saldo += incremento;
            realizado = true;
        }
        return realizado;

    }

    //Reintegro (disminuye saldo  /  devuelve realizado/no)
    public boolean reintegro(double cantidad){
        boolean realizado = false;
        if(cantidad > 0 && this.saldo >= cantidad) {
            this.saldo -= cantidad;
            realizado = true;
        }
        return realizado;

    }

    //Transferencia
    public  void transferencia(CuentaB2 c2, double importe){
        if(this.saldo >= importe) {
            this.saldo -= importe;
            c2.setSaldo(c2.getSaldo() + importe);
        }

    }


}
