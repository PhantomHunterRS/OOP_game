package Abstracts;

public abstract class Healer extends Hero{
    public Healer(String name, int health_Max, int power, int defence, int accuracy, int chanceCriticalAttack, int evasionAttack) {
        super(name, health_Max, power, defence, accuracy, chanceCriticalAttack, evasionAttack);
    }
    public void healing(Hero hero){

        int health = this.getPower()+(this.getAccuracy()/10)+(this.getChanceCriticalAttack()/10);
        hero.setHealth(((hero.getHealth()+health) > hero.getHealth_Max())?hero.getHealth_Max():hero.getHealth()+health);
    }
    };

