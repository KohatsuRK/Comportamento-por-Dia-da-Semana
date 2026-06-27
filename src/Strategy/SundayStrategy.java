package Strategy;
public class SundayStrategy implements DayStrategy {
    @Override
    public String execute(String userInput) {
        return "Planeje a próxima semana. Meta em foco: \"" + userInput + "\".";
    }
    @Override public String getPrioridade() { return "BAIXA"; }
}