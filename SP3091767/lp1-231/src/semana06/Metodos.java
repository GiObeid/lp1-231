package semana06;

public class Metodos {

    public static void main(String[] args) {
        System.out.println(Math.sqrt(25.0));
        ImprimirPalavra( "Olá Mundo!");
        ImprimirPalavra ( "teste");

        double soma = Calculadora.somar(10.0, 2.3);
        System.out.println(soma);

        System.out.println(Calculadora.somar(3.3, 4.1));
    }




    // Assinatura do Método 
    // public - acesso em qualquer parte do projeto
    // static - método atrelado a classe (não preciso criar um objeto)
    // void - tipo de retorno (sem retorno)
    // ImprimirPalavra - nome do método
    // String Palavra - parâmetro (pode ter zero ou muitos)
    // Definindo o método 
    
    public static void ImprimirPalavra (String palavra){
     System.out.println(palavra.toUpperCase());
    }

}














































