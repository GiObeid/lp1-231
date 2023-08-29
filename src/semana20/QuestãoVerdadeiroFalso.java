package semana20;
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
