// DayStrategy.java
package Strategy;
import Command.StrategySelector;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userName = "Ana";
        String userInput = "Implementar relatório";
        String dayInput = "quarta";

        // monta o selector manualmente — só para teste
        // a Pessoa 2 vai fazer isso via Command depois
        StrategySelector selector = new StrategySelector();
        selector.register("segunda", new MondayStrategy());
        selector.register("terca", new TuesdayStrategy());
        selector.register("quarta", new WednesdayStrategy());
        // ... restante dos dias

        DayStrategy strategy = selector.select(dayInput);

        System.out.println("Usuário: " + userName);
        System.out.println("Dia consultado: " + dayInput);
        System.out.println("Prioridade: " + strategy.getPrioridade());
        System.out.println("Mensagem: " + strategy.execute(userInput));

    }
}
