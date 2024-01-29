package Abstracts;

import Entity.Peasant;

import java.util.List;

public abstract class Archery extends Hero implements Move{
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

    @Override
    public void step(Hero hero, Hero enemy, List<Hero> allies) {
        Hero peasant = isPeasant(allies);
        if (!(peasant == null)){
            ((Peasant)peasant).replenishTheShells(this);
        }
        Move.super.step(hero, enemy, allies);
    }

    public Hero isPeasant(List<Hero> allies){
        for (Hero isPeasertX: allies) {
            if ((isPeasertX instanceof Peasant) && (!(isPeasertX.die(isPeasertX.getHealth())))) {
                return isPeasertX;
            }
        }
         return null;
    }
}
