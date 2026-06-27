package Strategy;
public class SaturdayStrategy implements DayStrategy {
    @Override
    public String execute(String userInput) {
        return "Aproveite para estudar ou descansar. Se quiser avançar: \"" + userInput + "\".";
    }
    @Override public String getPrioridade() { return "BAIXA"; }
}