package semana17;

public class Vendedor{
    protected String nome;
    protected double vendas;
    protected double comissao;

    public Vendedor(String nome , double vendas, double comissao){
        this.nome=nome;
        setVendas(vendas);
        setComissao(comissao);
    }

    public double obterSalario() {
        return vendas*(comissao/100);
    }

    public String getNome(){
        return nome;
    }

    public double getVendas(){
        return vendas;
    }

    public double getComissao(){
        return comissao;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public void setVendas(double vendas){
        if (vendas<0) {
            throw new RuntimeException("vendas não pode ser um valor negativo");
        }
        this.vendas=vendas;
    }

    public void setComissao(double comissao){
        if (comissao<=0 || comissao>=100) {
            throw new RuntimeException("somente valores entre 0 e 100");
        }
        this.comissao=comissao;
    }
}   
