package Strategy;

public class SundayStrategy implements DayStrategy{
    @Override
    public String execute(String userInput) {
        return "Planeje a próxima semana.";
    }

    @Override
    public String getPrioridade() {
        return "BAIXA";
    }
}
