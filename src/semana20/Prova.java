package semana20;

import java.util.ArrayList;
import java.util.List;

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
