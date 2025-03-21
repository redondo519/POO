public class Cuadrado implements Figura, CuentaLado{

    //Atributos
    private double lado;

    //Constructor
    public Cuadrado(double lado) {
        this.lado = lado;
    }

    //Metodos interfaces
    @Override
    public double perimetro() {
        double perimetro = lado*4;
        return perimetro;
    }

    @Override
    public double area() {
        double area = lado*lado;
        return area;
    }

    @Override
    public void escalar(double esc) {
        //esc > 0
        if(esc > 0) {
            lado = lado * esc;
        }
    }



    @Override
    public void imprimir() {
        System.out.println("CUADRADO");
        System.out.println(lado);
        System.out.println("perimetro: " + perimetro());
        System.out.println("area: " + area());

    }


    @Override
    public int cuentaLados() {
        return 4;
    }
}
