public class Jugador {
    private int vida;

    public Jugador() {
        this.vida = 1;
    }
    public int getVida() {
        return vida;
    }
    public void recibeAtaque(){
        this.vida--;
    }
}
