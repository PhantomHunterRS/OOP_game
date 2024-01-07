package Entity;

import Abstracts.Actable;
import Abstracts.Hero;

public class Spearman extends Hero implements Actable {
    public Spearman(String name, int health_Max, int power, int defence, int accuracy, int chanceCriticalAttack, int evasionAttack) {
        super(name, health_Max, power, defence, accuracy, chanceCriticalAttack, evasionAttack);
    }
    @Override
    public String toString(){
        return super.toString()+ " team - "+ getTeam() + ":\n   Health - " + getHealth() + "\n   Power - " + getPower() + "\n   Defence - " + getDefence() + "\n   Accuracy - " + getAccuracy() +
                "\n   Chance Critical Attack - " + getChanceCriticalAttack() + "\n   Evasion attack - " + getEvasionAttack()+ "\n position ("+ getPosition().getPosX() + ","+ getPosition().getPosY() + ")";
    }
}
