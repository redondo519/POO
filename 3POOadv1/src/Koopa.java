public class Koopa  extends Troopa{
    private String apariencia;

    public Koopa(String nombre){
        super(nombre = "Koopa");
        apariencia = "koopa.png";
    }
    @Override
    public void aparecer(){
        super.aparecer();
        System.out.println(apariencia);
    }

    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("aPARIENCIA"+apariencia);
    }
}
