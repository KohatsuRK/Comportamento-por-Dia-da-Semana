package Command;

import Strategy.DayStrategy;
import Strategy.UnknownDayStrategy;

import java.util.HashMap;
import java.util.Map;

public class StrategySelector {

    private final Map<String, DayStrategy> strategies = new HashMap<>();

    public void register(String day, DayStrategy strategy) {
        strategies.put(day, strategy);
    }

    public DayStrategy select(String day) {
        return strategies.getOrDefault(day, new UnknownDayStrategy());
    }
}