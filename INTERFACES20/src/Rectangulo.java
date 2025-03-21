public class  Rectangulo implements Figura, CuentaLado{



    //Atributos
    private double base;
    private double altura;

    //Constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //Metodos interfaces
    @Override
    public double perimetro() {
        double perimetro = base + altura;
        return perimetro;
    }

    @Override
    public double area() {
        double area = base * altura;
        return area;
    }

    @Override
    public void escalar(double esc) {
        //esc > 0
        if(esc > 0) {
            base = base * esc;
            altura = altura * esc;
        }
    }

    @Override
    public void imprimir() {
        System.out.println("RECT");
        System.out.println(base);
        System.out.println("perimetro: " + perimetro());
        System.out.println("area: " + area());

    }


    @Override
    public int cuentaLados() {
        return 4;
    }
}
