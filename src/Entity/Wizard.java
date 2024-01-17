package Entity;

import Abstracts.Hero;
import Abstracts.Magic;
import Abstracts.Vector2;

public class Wizard extends Magic {

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
    public void healing(Hero hero) {
        int health = this.getPower()+(this.getAccuracy()/10)+(this.getChanceCriticalAttack()/10);
        hero.setHealth(((hero.getHealth()+health) > hero.getHealth_Max())?hero.getHealth_Max():hero.getHealth()+health);
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
    public void step(Vector2 vector) {
        super.step(vector);
    }
}
