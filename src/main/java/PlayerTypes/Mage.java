
package PlayerTypes;

import Util.Player_Stat_Utility;

import java.util.HashMap;

public class Mage extends Player {


    public Mage(String name) {
        super(name, Player_Stat_Utility.createPlayerStats("M"));

    }


    public double cast() {
        System.out.println("Casting magic");
        return getStats().get("Magic") * Math.random();
    }

}
