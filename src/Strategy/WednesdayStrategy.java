package Strategy;
public class WednesdayStrategy implements DayStrategy {
    @Override
    public String execute(String userInput) {
        return "Dia de revisão: verifique o andamento da atividade \"" + userInput + "\".";
    }
    @Override public String getPrioridade() { return "MÉDIA"; }
}