package semana18;

import java.util.List;

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