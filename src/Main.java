import Command.CommandLoader;
import Selector.StrategySelect;
import Selector.StrategySelector;
import Strategy.DayStrategy;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final Map<String, String> DIA_PARA_CHAVE = Map.of(
        "segunda-feira", "segunda",
        "terça-feira",   "terca",
        "quarta-feira",  "quarta",
        "quinta-feira",  "quinta",
        "sexta-feira",   "sexta",
        "sábado",        "sabado",
        "domingo",       "domingo"
    );

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Monta o selector via CommandLoader (padrão Command)
        StrategySelect selector = new StrategySelector();
        new CommandLoader().load(selector);

        // Coleta nome e tarefa
        System.out.print("Nome: ");
        String userName = sc.nextLine().trim();

        System.out.print("Tarefa / meta: ");
        String tarefa = sc.nextLine().trim();

        // Detecta dia atual automaticamente
        String diaAtualRaw = LocalDate.now()
                .getDayOfWeek()
                .getDisplayName(TextStyle.FULL, new Locale("pt", "BR"))
                .toLowerCase();
        String diaAtualChave = DIA_PARA_CHAVE.getOrDefault(diaAtualRaw, diaAtualRaw);

        // Permite consultar outro dia manualmente (requisito 4)
        System.out.println("Dia atual: " + diaAtualRaw + " [" + diaAtualChave + "]");
        System.out.print("Dia a consultar (ENTER = hoje | segunda terca quarta quinta sexta sabado domingo): ");
        String diaDigitado = sc.nextLine().trim().toLowerCase();

        String diaConsultado = diaDigitado.isEmpty() ? diaAtualChave : diaDigitado;

        // Seleciona e executa a estratégia
        DayStrategy strategy = selector.select(diaConsultado);

        System.out.println();
        System.out.println("=============================");
        System.out.println("Usuário: "        + userName);
        System.out.println("Tarefa: "         + tarefa);
        System.out.println("Dia consultado: " + diaConsultado);
        System.out.println("Prioridade: "     + strategy.getPrioridade());
        System.out.println("Mensagem: "       + strategy.execute(tarefa));
        System.out.println("=============================");

        sc.close();
    }
}