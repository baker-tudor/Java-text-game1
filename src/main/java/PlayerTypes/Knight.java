package PlayerTypes;

import Util.Player_Stat_Utility;

import java.util.HashMap;

public class Knight extends Player {

    public Knight(String name) {
        super(name, Player_Stat_Utility.createPlayerStats("K")); // pass it the knight enum?
    }

    public double block() {
        System.out.println("Blocking the attack");
        return getStats().get("Defense") * Math.random();
    }
}
