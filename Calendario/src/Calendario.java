public class Calendario {

    private int año;
    private int mes;
    private int dia;

    public Calendario(int año,int mes,int dia) {
        this.año = año;
        this.mes = mes;
        this.dia = dia;

    }

    //Agregar codigo para comprobar correctamente
    public void incrementar(int i) {
        this.dia = this.dia + i;
        if (this.dia > 30) {
            this.dia = 1;
            this.mes ++;
        }
        if (this.mes >= 12) {
            this.mes = 1;
            this.año ++;
        }
    }

    @Override
    public String toString() {
        return año + "-" + mes + "-" + dia;
    }


    public void mostrar() {
        System.out.printf("La fecha incrementada es :  %d/%d/%d  ",this.año,this.mes,this.dia);

    }

    //Boolean comprobar fecha
    public boolean comprobar(int año, int mes, int dia) {
       boolean comp = false;
        if(this.año == año && this.mes == mes && this.dia == dia) {
            comp = true;

        }
        return comp;

    }

}
