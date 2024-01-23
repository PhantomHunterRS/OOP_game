package Entity;

import Abstracts.Hero;
import Abstracts.Healer;
import Abstracts.Vector2;

import java.util.List;

public class Wizard extends Healer {

    public Wizard(String name, int health_Max, int power, int defence, int accuracy, int chanceCriticalAttack, int evasionAttack) {
        super(name, health_Max, power, defence, accuracy, chanceCriticalAttack, evasionAttack);
        this.initiative = 1;
    }
    @Override
    public String toString() {
        return super.toString()+ " team - "+ getTeam() + ":\n   Health - " + getHealth() + "\n   Power - " + getPower() + "\n   Defence - " + getDefence() + "\n   Accuracy - " + getAccuracy() +
                "\n   Chance Critical Attack - " + getChanceCriticalAttack() + "\n   Evasion attack - " + getEvasionAttack()+"\n position ("+ getPosition().getPosX() + ","+ getPosition().getPosY() + ")";
    }
    @Override
    public boolean die(int health) {
        if (health <= 0) {
            System.out.println("The hero crumbled into stardust");
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void step(Hero hero, List<Hero> allies) {
        super.step(hero,allies);
    }
}
