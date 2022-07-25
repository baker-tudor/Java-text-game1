package EnemyTypes;

import java.util.HashMap;

public class Enemy {

    private HashMap<String, Double> stats;

    public Enemy(int level) {
        stats = createStats(level);
    }

    public double attackDamage() {
        System.out.println("Enemy attacks");
        return stats.get("Attack") * Math.random();
    }


    private HashMap<String, Double> createStats(int level) {
        HashMap<String, Double> stats = new HashMap<>();
        stats.put("Attack", level * Math.random());
        return stats;
    }

}
