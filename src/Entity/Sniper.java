package Entity;

import Abstracts.AccurateShooting;
import Abstracts.Hero;

public class Sniper extends Hero implements AccurateShooting {
    private int numberOfArrows;
    public Sniper(String name, int health_Max, int power, int defence, int accuracy, int chanceCriticalAttack, int evasionAttack) {
        super(name, health_Max, power, defence, accuracy, chanceCriticalAttack, evasionAttack);
        this.numberOfArrows = 15;
    }
    public int getNumberOfArrows() {
        return numberOfArrows;
    }
    public void setNumberOfArrows(int replenishNumberOfArrows) {
        this.numberOfArrows = this.numberOfArrows + replenishNumberOfArrows;
    }
    @Override
    public void sniperShoot(Hero hero) {
        if (hero.die(hero.getHealth())){
            System.out.println("He's already dead.");
        }
        else {
            hero.setHealth(hero.getHealth() - (this.getPower()*2 + this.getAccuracy() + this.getChanceCriticalAttack()));
        }
        System.out.println(hero.die(hero.getHealth())?"dead":"");
    }
    @Override
    public String toString() {
        return super.toString()+ " team - "+ getTeam() + ":\n   Health - " + getHealth() + "\n   Power - " + getPower() + "\n   Defence - " + getDefence() + "\n   Accuracy - " + getAccuracy() +
                "\n   Chance Critical Attack - " + getChanceCriticalAttack() + "\n   Evasion attack - " + getEvasionAttack()+"\n   number Of Arrows - " + getNumberOfArrows()+"\n position ("+ getPosition().getPosX() + ","+ getPosition().getPosY() + ")";
    }
}
