package Strategy;

public class SaturdayStrategy implements DayStrategy {
    @Override
    public String execute(String userInput) {
        return "Realize estudo livre ou descanso";
    }

    @Override
    public String getPrioridade() {
        return "BAIXA";
    }
}
