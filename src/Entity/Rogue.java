package Entity;

import Abstracts.Hero;
import Abstracts.Move;
import Abstracts.Vector2;


import java.util.List;

public class Rogue extends Hero implements Move {
    public Rogue(String name, int health_Max, int power, int defence, int accuracy, int chanceCriticalAttack, int evasionAttack) {
        super(name, health_Max, power, defence, accuracy, chanceCriticalAttack, evasionAttack);
        this.initiative = 2;
    }
    @Override
    public void protect(Hero hero) {
        hero.setDefence(hero.getDefence()+this.getPower()/10+this.getEvasionAttack()/5);
    }

    @Override
    public String toString(){
        return super.toString()+ " team - "+ getTeam() + ":\n   Health - " + getHealth() + "\n   Power - " + getPower() + "\n   Defence - " + getDefence() + "\n   Accuracy - " + getAccuracy() +
                "\n   Chance Critical Attack - " + getChanceCriticalAttack() + "\n   Evasion attack - " + getEvasionAttack()+ "\n position ("+ getPosition().getPosX() + ","+ getPosition().getPosY() + ")";
    }

    @Override
    public void step(Hero hero, Hero enemy, List<Hero> allies) {
        Move.super.step(hero, enemy, allies);
    }
    @Override
    public boolean cageIsOccupied(Vector2 vector, List<Hero> allies) {
        return Move.super.cageIsOccupied(vector, allies);
    }

}
