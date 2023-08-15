package semana17;

public class VendedorFixo extends Vendedor{
    private double salario;

    public VendedorFixo(double salario, String nome , double vendas, double comissao){
        super(nome, vendas, comissao);
        setSalario(salario);
    }

    public double obterSalario(){
        return super.obterSalario() + salario;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        if (salario<=0) {
            throw new RuntimeException("somente valores maiores que 0");
        }
        this.salario=salario;
    }
}

