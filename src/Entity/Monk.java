package Entity;

import Abstracts.Healer;
import Abstracts.Hero;
import Abstracts.Move;

import java.util.List;

public class Monk extends Healer implements Move {
    public Monk(String name, int health_Max, int power, int defence, int accuracy, int chanceCriticalAttack, int evasionAttack) {
        super(name, health_Max, power, defence, accuracy, chanceCriticalAttack, evasionAttack);
        this.initiative = 1;
    }

    @Override
    public void healing(Hero hero) {

    }

    @Override
    public String toString() {
        return super.toString() + " team - " + getTeam() + ":\n   Health - " + getHealth() + "\n   Power - " + getPower() + "\n   Defence - " + getDefence() + "\n   Accuracy - " + getAccuracy() +
                "\n   Chance Critical Attack - " + getChanceCriticalAttack() + "\n   Evasion attack - " + getEvasionAttack() + "\n position (" + getPosition().getPosX() + "," + getPosition().getPosY() + ")";
    }


}

