package Entity;

import Abstracts.Archery;
import Abstracts.Hero;
import Abstracts.Move;
import Abstracts.Vector2;

import java.util.List;

public class Crossbowman extends Archery {

    public Crossbowman(String name, int health_Max, int power, int defence, int accuracy, int chanceCriticalAttack, int evasionAttack) {
        super(name, health_Max, power, defence, accuracy, chanceCriticalAttack, evasionAttack);
        this.setNumberOfCrossBowArrows(15);
        this.initiative = 3;
    }
    @Override
    public String toString() {
        return super.toString()+ " team - "+ getTeam() + ":\n   Health - " + getHealth() + "\n   Power - " + getPower() + "\n   Defence - " + getDefence() + "\n   Accuracy - " + getAccuracy() +
                "\n   Chance Critical Attack - " + getChanceCriticalAttack() + "\n   Evasion attack - " + getEvasionAttack()+ "\n number Of CrossBow Arrows - " + getNumberOfCrossBowArrows() +"\n position ("+ getPosition().getPosX() + ","+ getPosition().getPosY() + ")";
    }


}
