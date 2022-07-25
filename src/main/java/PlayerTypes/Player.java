package PlayerTypes;

import java.util.HashMap;

public class Player {

    private String name;
    private HashMap<String, Double> stats;


    public Player(String name, HashMap<String, Double> stats) {
        this.name = name;
        this.stats = stats;
    }





    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public HashMap<String, Double> getStats() {
        return this.stats;
    }

    public void setStats(final HashMap<String, Double> stats) {
        this.stats = stats;
    }
}
