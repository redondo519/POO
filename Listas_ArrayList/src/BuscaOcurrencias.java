import java.util.ArrayList;
import java.util.Random;

public class BuscaOcurrencias {
    //Se le pasa un array y busca un valor pasado.
    public static void main(String[] args) {

        int r; //Random
        int valor; //Valor a buscar

        //Pasaremos aqui los valores encontrados
        ArrayList Lista = new ArrayList();

        ArrayList numeros = new ArrayList();

        Random rand = new Random();

        for(int i = 0; i < 50; i++){
            r = rand.nextInt(100);
            numeros.add(r);
        }

        for(int i = 0; i < 50; i++){
            
        }


        System.out.println("Numeros");
        System.out.println(numeros);




    }




}
