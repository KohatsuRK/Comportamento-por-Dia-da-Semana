package Strategy;

public class UnknownDayStrategy implements DayStrategy {
    @Override
    public String execute(String userInput) {
        return "Dia inválido ou sem estratégia associada.";
    }

    @Override
    public String getPrioridade() {
        return "INDEFINIDO";
    }
}
