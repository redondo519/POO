import java.util.ArrayList;

public class Programa {
    public static void main(String[] args) {
        //Pruebas de Figura



        /*
        Cuadrado c1 = new Cuadrado(20);

        c1.imprimir();

        c1.escalar(-2); //escala negativa no hace nada, escala psoitiva multiplica lado * esc

        c1.imprimir();

        c1.escalar(0.5);

        c1.imprimir();

        */


        Figura[] figuras = new Figura[3];

        figuras[0] = new Cuadrado(2);
        figuras[1] = new Circulo(5);
        figuras[2] = new Rectangulo(4,9);

        for(int i = 0; i < figuras.length; i++){
            figuras[i].imprimir();
        }

        for (Figura f : figuras) {
            f.escalar(2);
        }

        for(Figura f : figuras){
            f.imprimir();
        }




    }
}
