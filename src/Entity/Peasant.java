package Entity;

import Abstracts.Archery;
import Abstracts.CarryingAWeapons;
import Abstracts.Hero;
import Abstracts.Move;

import java.util.List;

public class Peasant extends Hero implements CarryingAWeapons, Move {
    boolean prepared;
    int numberOfCrossBowArrows;
    public Peasant(String name, int health_Max) {
        super(name, health_Max, 0, 0, 0, 0, 0);
        this.initiative = 0;
        prepared = true;
        numberOfCrossBowArrows = 5;

    }

    @Override
    public void replenishTheShells(Hero hero) {
            ((Archery) hero).setNumberOfCrossBowArrows(1);

    }
    @Override
    public String toString() {
        return super.toString()+ " team - "+ getTeam() + ":\n   Health - " + getHealth() + "\n   Power - " + getPower() + "\n   Defence - " + getDefence() + "\n   Accuracy - " + getAccuracy() +
                "\n   Chance Critical Attack - " + getChanceCriticalAttack() + "\n   Evasion attack - " + getEvasionAttack()+"\n position ("+ getPosition().getPosX() + ","+ getPosition().getPosY() + ")";
    }
    @Override
    public void step(Hero hero, Hero enemy, List<Hero> allies) {
        prepared = (numberOfCrossBowArrows == 0)?false:true;
    }
}
