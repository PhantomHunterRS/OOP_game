package Abstracts;

import java.util.List;

public abstract class Archery extends Hero {
    public Archery(String name, int health_Max, int power, int defence, int accuracy, int chanceCriticalAttack, int evasionAttack) {
        super(name, health_Max, power, defence, accuracy, chanceCriticalAttack, evasionAttack);
    }
    public void sniperShoot(Hero hero){

    };
    public Hero searchForTheNearestEnemy(List<Hero> heroes){
        return null;
    };
}
