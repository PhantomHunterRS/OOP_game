package Entity;

import Abstracts.Hero;
import Abstracts.Vector2;

public class Crossbowman extends Hero {
    private int numberOfCrossBowArrows;
    public Crossbowman(String name, int health_Max, int power, int defence, int accuracy, int chanceCriticalAttack, int evasionAttack) {
        super(name, health_Max, power, defence, accuracy, chanceCriticalAttack, evasionAttack);
        this.initiative = 3;
    }
    @Override
    public String toString() {
        return super.toString()+ " team - "+ getTeam() + ":\n   Health - " + getHealth() + "\n   Power - " + getPower() + "\n   Defence - " + getDefence() + "\n   Accuracy - " + getAccuracy() +
                "\n   Chance Critical Attack - " + getChanceCriticalAttack() + "\n   Evasion attack - " + getEvasionAttack()+ "\n number Of CrossBow Arrows - " + getNumberOfCrossBowArrows() +"\n position ("+ getPosition().getPosX() + ","+ getPosition().getPosY() + ")";
    }

    public int getNumberOfCrossBowArrows() {
        return numberOfCrossBowArrows;
    }
    public void setNumberOfCrossBowArrows(int replenishNumberOfCrossBowArrows) {
        this.numberOfCrossBowArrows = this.numberOfCrossBowArrows+replenishNumberOfCrossBowArrows;
    }

    @Override
    public void step(Vector2 vector) {
        super.step(vector);
    }
}
