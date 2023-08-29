package semana20;

import java.util.List;

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
