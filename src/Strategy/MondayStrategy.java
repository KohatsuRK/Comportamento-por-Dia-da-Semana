package Strategy;

public class MondayStrategy implements DayStrategy{
    @Override
    public String execute(String userInput) {
        return "Organize suas prioridades da atividade: " + userInput;
    }

    @Override
    public String getPrioridade() {
        return "ALTA";
    }
}
