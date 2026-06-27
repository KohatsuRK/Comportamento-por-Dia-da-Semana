package command;

import selector.StrategySelect;

public interface DayCommand {
    void execute(StrategySelect selector);
}
