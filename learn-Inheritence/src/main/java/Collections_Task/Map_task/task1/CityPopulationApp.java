package Collections_Task.Map_task.task1;

import java.util.HashMap;
import java.util.Map;

public class CityPopulationApp {
    private final Map<String, Integer> cityPopulationMap;

    public CityPopulationApp() {
        this.cityPopulationMap = new HashMap<>();
    }

    public void addCityPopulation(final String cityName, final int population) {
        cityPopulationMap.put(cityName, population);
    }

}
