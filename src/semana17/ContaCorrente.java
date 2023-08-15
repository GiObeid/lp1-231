package semana17;

public class ContaCorrente extends Conta{
    private double limite;

    public ContaCorrente(double tarifa, double limite){
        super(tarifa);
        this.limite=limite;
        saldo=0;
    }

    public void sacar(double valordosaque) {
        saldo=saldo-valordosaque;
    }

    public double calcularTarifa(){
        return (saldo*tarifa)/limite;
    }

    public double getLimite(){
        return limite;
    }
}

