package Abstracts;

import java.util.List;

public abstract class Archery extends Hero {
    private int numberOfCrossBowArrows;
    public Archery(String name, int health_Max, int power, int defence, int accuracy, int chanceCriticalAttack, int evasionAttack) {
        super(name, health_Max, power, defence, accuracy, chanceCriticalAttack, evasionAttack);
    }
    public void sniperShoot(Hero hero){
        if (arrowsAreAvailable(this.numberOfCrossBowArrows)){
            this.attack(hero);
            this.numberOfCrossBowArrows--;
        }
    }
    public Hero searchForTheNearestEnemy(List<Hero> heroes){
        return null;
    }
    public boolean arrowsAreAvailable(int arrows){
        return (arrows>0)?true:false;
    }
    public int getNumberOfCrossBowArrows() {
        return numberOfCrossBowArrows;
    }
    public void setNumberOfCrossBowArrows(int replenishNumberOfCrossBowArrows) {
        this.numberOfCrossBowArrows = this.numberOfCrossBowArrows+replenishNumberOfCrossBowArrows;
    }

}
