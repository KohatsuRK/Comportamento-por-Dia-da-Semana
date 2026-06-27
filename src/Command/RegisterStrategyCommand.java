package Command;

import Selector.StrategySelect;
import Strategy.DayStrategy;

public class RegisterStrategyCommand implements DayCommand {

    private final String day;
    private final DayStrategy strategy;

    public RegisterStrategyCommand(String day, DayStrategy strategy) {
        this.day = day;
        this.strategy = strategy;
    }

    @Override
    public void execute(StrategySelect selector) {
        selector.register(day, strategy);
    }
}