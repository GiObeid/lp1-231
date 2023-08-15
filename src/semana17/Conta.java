package semana17;

public class Conta {
    protected double saldo;
    protected double tarifa;

    public Conta(double tarifa){
        if (tarifa<0) {
            throw new RuntimeException("somente valores positivos");
        }
        this.tarifa=tarifa;
        saldo=0;
    }

    public void sacar(double valordosaque) {
        saldo=saldo-valordosaque;
    }

    public void depositar(double valordodeposito) {
        saldo=saldo+valordodeposito;
    }

    public double calcularTarifa(){
        return (saldo*tarifa)/1000;
    }

    public double getSaldo(){
        return saldo;
    }

    public double getTarifa(){
        return tarifa;
    }
}