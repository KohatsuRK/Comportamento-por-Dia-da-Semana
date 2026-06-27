package Strategy;

public class WednesdayStrategy implements DayStrategy{
    @Override
    public String execute(String userInput) {
        return "Revise o andamento das atividades";
    }

    @Override
    public String getPrioridade() {
        return "MÉDIA";
    }
}
