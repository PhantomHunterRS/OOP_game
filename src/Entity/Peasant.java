package Entity;

import Abstracts.CarryingAWeapons;
import Abstracts.Hero;

public class Peasant extends Hero implements CarryingAWeapons {

    public Peasant(String name, int health_Max) {
        super(name, health_Max, 0, 0, 0, 0, 0);
    }
    @Override
    public void replenishTheShells(Hero hero) {
        if (hero instanceof Sniper){
            ((Sniper) hero).setNumberOfArrows(5);
        } else if (hero instanceof Crossbowman) {
            ((Crossbowman) hero).setNumberOfCrossBowArrows(5);
        }
    }
    @Override
    public String toString() {
        return super.toString()+ " team - "+ getTeam() + ":\n   Health - " + getHealth() + "\n   Power - " + getPower() + "\n   Defence - " + getDefence() + "\n   Accuracy - " + getAccuracy() +
                "\n   Chance Critical Attack - " + getChanceCriticalAttack() + "\n   Evasion attack - " + getEvasionAttack()+"\n position ("+ getPosition().getPosX() + ","+ getPosition().getPosY() + ")";
    }
}
