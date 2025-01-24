import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Cuenta c = new Cuenta("1111111X", "David");

        Cuenta c2 = new Cuenta("1212121W",34);


        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese titular:");
        String titular = sc.nextLine();

        Cuenta c3 = new Cuenta("2222222W",titular,340);
        //LLamamos

        c.ingresar(100);
        c.retirar(80);
        c.mostrar();


        c2.mostrar();

        System.out.println();

        c3.mostrar();


    }



}

