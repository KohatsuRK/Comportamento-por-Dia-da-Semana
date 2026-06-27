package command;

import java.util.ArrayList;
import java.util.List;

import selector.StrategySelect;
import strategy.*;

public class CommandLoader {

    private final List<DayCommand> commands = new ArrayList<>();

    public CommandLoader() {

        commands.add(new RegisterStrategyCommand("segunda", new MondayStrategy()));
        commands.add(new RegisterStrategyCommand("terca", new TuesdayStrategy()));
        commands.add(new RegisterStrategyCommand("quarta", new WednesdayStrategy()));
        commands.add(new RegisterStrategyCommand("quinta", new ThursdayStrategy()));
        commands.add(new RegisterStrategyCommand("sexta", new FridayStrategy()));
        commands.add(new RegisterStrategyCommand("sabado", new SaturdayStrategy()));
        commands.add(new RegisterStrategyCommand("domingo", new SundayStrategy()));
    }

    public void load(StrategySelect selector) {
        for (DayCommand command : commands) {
            command.execute(selector);
        }
    }
}