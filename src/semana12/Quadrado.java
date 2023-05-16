package semana12;

public class Quadrado {
    public double lado;


    public Quadrado(double l){
        this.lado = l;
    }
    public double calcularArea(){
      return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }  
}
