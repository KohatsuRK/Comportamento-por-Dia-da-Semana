package Strategy;

public class FriydayStrategy implements DayStrategy{
    @Override
    public String execute(String userInput) {
        return "Registre o que foi concluído da atividade: " + userInput ;
    }

    @Override
    public String getPrioridade() {
        return "MEDIA";
    }
}
