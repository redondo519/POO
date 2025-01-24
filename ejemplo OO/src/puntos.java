public class Punto {

    private double x;
    private double y;

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public double getY() {
        return y;
    }

    public double distancia(Punto p){
        double dist = Math.sqrt(Math.pow(x - p.getX(), 2) + Math.pow(y - p.getY(), 2));
        return dist;
    }

}
