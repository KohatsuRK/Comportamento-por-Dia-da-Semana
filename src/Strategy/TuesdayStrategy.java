package Strategy;

public class TuesdayStrategy implements DayStrategy{
    @Override
    public String execute(String userInput) {
        return "Avance nas tarefas pendentes da atividade: " + userInput;
    }

    @Override
    public String getPrioridade() {
        return "ALTA";
    }
}
