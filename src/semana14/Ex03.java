public class Conta {
    private final int codigo;
    private double saldo;
    private final String correntista;

    public Conta(int codigo, String correntista) {
        if (codigo <= 0) {
            throw new IllegalArgumentException("O código deve ser um número inteiro maior que zero.");
        }
        if (correntista.length() < 5 || correntista.length() > 100) {
            throw new IllegalArgumentException("O nome do correntista deve ter entre 5 e 100 caracteres.");
        }
        this.codigo = codigo;
        this.correntista = correntista;
        this.saldo = 0.0;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getCorrentista() {
        return correntista;
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    public void transferir(double valor, Conta destino) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferência realizada com sucesso. Novo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência.");
        }
    }

    // TEST
    public static void main(String[] args) {
        Conta conta1 = new Conta(1, "Correntista 1");
        Conta conta2 = new Conta(2, "Correntista 2");

        conta1.depositar(100.0); 
        conta1.sacar(50.0); 

        conta2.depositar(200.0); 
        conta2.transferir(100.0, conta1); 
        conta2.transferir(150.0, conta1); 

        // Tentativa de modificar os atributos código e correntista 
        conta1.codigo = 3; 
        conta1.correntista = "Novo Correntista"; 