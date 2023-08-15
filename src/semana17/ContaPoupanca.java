package semana17;

import java.time.LocalDate;

public class ContaPoupanca extends Conta {
    private LocalDate aniversario;

    public ContaPoupanca(double tarifa, LocalDate aniversario){
        super(tarifa);
        this.aniversario=aniversario;
        saldo=0;
    }

    public double calcularTarifa(){
        return saldo*tarifa;
    }

    public LocalDate getAniversario(){
        return aniversario;
    }
}
