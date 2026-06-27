package Command;

import Selector.StrategySelect;

public interface DayCommand {
    void execute(StrategySelect selector);
}
