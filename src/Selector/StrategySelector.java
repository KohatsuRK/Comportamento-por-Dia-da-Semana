package Selector;

import Strategy.DayStrategy;
import Strategy.UnknownDayStrategy;

import java.util.HashMap;
import java.util.Map;

public class StrategySelector implements StrategySelect {

    private final Map<String, DayStrategy> strategies = new HashMap<>();

    @Override
    public void register(String day, DayStrategy strategy) {
        strategies.put(day.toLowerCase(), strategy);
    }

    @Override
    public DayStrategy select(String day) {
        if (day == null) {
            return new UnknownDayStrategy();
        }
        return strategies.getOrDefault(day.toLowerCase(), new UnknownDayStrategy());
    }
}