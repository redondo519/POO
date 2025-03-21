import java.io.Serializable;

public class Circulo implements Figura {

    //Atributos:
    private double r;

    public Circulo(double r) {
        this.r = r;
    }


    @Override
    public double perimetro() {

        return 2 * Math.PI * r;
    }

    @Override
    public double area() {
        return Math.PI * r * r;
    }

    @Override
    public void escalar(double esc) {
        if(esc > 0){
            r = r * esc;
        }
    }

    @Override
    public void imprimir() {
        System.out.println("Circulo: " + r);
        System.out.println("Perimetro: " + perimetro());
        System.out.println("Area: " + area());
    }
}
