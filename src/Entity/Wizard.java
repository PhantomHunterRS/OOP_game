package Entity;

public class Wizard extends Hero implements Actable{

    public Wizard(String name, int health_Max, int power, int defence, int accuracy, int chanceCriticalAttack, int evasionAttack) {
        super(name, health_Max, power, defence, accuracy, chanceCriticalAttack, evasionAttack);
    }
    @Override
    public String toString() {
        return super.toString()+ ":\n   Health - " + getHealth() + "\n   Power - " + getPower() + "\n   Defence - " + getDefence() + "\n   Accuracy - " + getAccuracy() +
                "\n   Chance Critical Attack - " + getChanceCriticalAttack() + "\n   Evasion attack - " + getEvasionAttack();
    }
    @Override
    public void attack(Hero hero) {
        if (getPower()> hero.getDefence()) {
            hero.setHealth(hero.getHealth() - (this.getPower() + (this.getAccuracy()/10) + (this.getChanceCriticalAttack()/10)));
        }else {
            hero.setHealth(hero.getHealth()+(hero.getDefence()/10) - (this.getPower() + (this.getAccuracy()/10) + (this.getChanceCriticalAttack()/10)));
        }
    }

    public void healing(Hero hero) {
        int health = this.getPower()+(this.getAccuracy()/10)+(this.getChanceCriticalAttack()/10);
        hero.setHealth((health > hero.getHealth_Max())?hero.getHealth_Max():health);
    }
    @Override
    public void protect(Hero hero) {
        hero.setDefence(hero.getDefence()+this.getPower()/10);
    }
}
