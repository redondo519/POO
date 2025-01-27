import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        //Creo un objeto c Calendario con los valores concretos
        Calendario c = new Calendario(2025,12,27);



        //Mostrar fecha
        //c.mostrar();
        System.out.println(c);

        //Incremento numero de dias
        c.incrementar(4);


        //Muestro incrementación:
        c.mostrar();

        //comprobar si fechas son iguales
        //if(c.equals(c2))







    }
}
