package Strategy;

public class ThursdayStrategy implements DayStrategy{
    @Override
    public String execute(String userInput) {
        return "Colabore com alguém da equipe";
    }

    @Override
    public String getPrioridade() {
        return "BAIXA";
    }
}
