package Util;

import java.util.HashMap;

public class Player_Stat_Utility {

    public static HashMap<String, Double> createPlayerStats(String playerType) {
        HashMap<String, Double> stats = new HashMap<>();
        double health = 100;
        double defense;
        if(playerType.equals("K")) {
            defense = 10;
        } else {
            defense = 5;
        }
        stats.put("Health", health);
        stats.put("Defense", defense);
        return stats;
    }

}
