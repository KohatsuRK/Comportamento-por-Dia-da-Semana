package Selector;

import Strategy.DayStrategy;

public interface StrategySelect {
    void register(String day, DayStrategy strategy);
    DayStrategy select(String day);
}
