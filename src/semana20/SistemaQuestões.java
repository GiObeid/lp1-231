package semana20;

import java.util.ArrayList;
import java.util.List;

class SistemaQuestão {
    private int númeroQuestao;
    private String enunciado;

    public SistemaQuestão(int número, String enunciado) {
        númeroQuestao = número;
        this.enunciado = enunciado;
    }

    public int getNúmeroQuestao() {
        return númeroQuestao;
    }

    public String getEnunciado() {
        return enunciado;
    }

    @Override
    public String toString() {
        return númeroQuestao + ". " + enunciado;
    }
}

class QuestãoVerdadeiroFalso extends SistemaQuestão {
    private boolean resposta;

    public QuestãoVerdadeiroFalso(int número, String enunciado, boolean resp) {
        super(número, enunciado);
        resposta = resp;
    }

    public boolean getResposta() {
        return resposta;
    }

    @Override
    public String toString() {
        return super.toString() + " (Verdadeiro/Falso)";
    }
}

class QuestãoEscolhaUnica extends SistemaQuestão {
    private List<String> opções;
    private int opçãoCorreta;

    public QuestãoEscolhaUnica(int número, String enunciado, List<String> opçõesLista, int correta) {
        super(número, enunciado);
        opções = opçõesLista;
        opçãoCorreta = correta;
    }

    public List<String> getOpções() {
        return opções;
    }

    public int getOpçãoCorreta() {
        return opçãoCorreta;
    }

    @Override
    public String toString() {
        return super.toString() + " (Escolha Simples)";
    }
}

class QuestãoEscolhaMúltipla extends SistemaQuestão {
    private List<String> opções;
    private List<Integer> opçõesCorretas;

    public QuestãoEscolhaMúltipla(int número, String enunciado, List<String> opçõesLista, List<Integer> corretas) {
        super(número, enunciado);
        opções = opçõesLista;
        opçõesCorretas = corretas;
    }

    public List<String> getOpções() {
        return opções;
    }

    public List<Integer> getOpçõesCorretas() {
        return opçõesCorretas;
    }

    @Override
    public String toString() {
        return super.toString() + " (Escolha Múltipla)";
    }
}

class Prova {
    private List<SistemaQuestão> questões;

    public Prova() {
        questões = new ArrayList<>();
    }

    public void adicionarQuestão(SistemaQuestão questão) {
        questões.add(questão);
    }

    public int calcularPontuação() {
        return questões.size();
    }
}

public class SistemaQuestões {

    public static void main(String[] args) {
        Prova prova = new Prova();

        QuestãoVerdadeiroFalso vfQuestão = new QuestãoVerdadeiroFalso(1, "O céu é azul?", true);
        QuestãoEscolhaUnica esQuestão = new QuestãoEscolhaUnica(2, "Qual é a capital da França?",
                List.of("Paris", "Londres", "Berlim", "Roma"), 0);
        QuestãoEscolhaMúltipla emQuestão = new QuestãoEscolhaMúltipla(3, "Quais frutas são vermelhas?",
                List.of("Maçã", "Banana", "Cereja", "Uva"), List.of(0, 2));

        prova.adicionarQuestão(vfQuestão);
        prova.adicionarQuestão(esQuestão);
        prova.adicionarQuestão(emQuestão);

        int pontuação = prova.calcularPontuação();
        System.out.println("Sua pontuação: " + pontuação);
    }
}
