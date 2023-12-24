package Entity;
/**
Описание героя и его основных характиристик
 */
public abstract class Hero {
    String name;
    enum league{
        GOOD,EVIL
    };
    int health, health_Max;
    int power;
    int defence;
    int accuracy;
    int chanceCriticalAttack;
    int evasionAttack;
    void attackHero() {}
    void getInDefense(){}

    @Override
    public String toString(){
        return String.format(this.getClass().getSimpleName() + name);
    }
    public Hero(String name, int health, int health_Max, int power, int defence, int accuracy, int chanceCriticalAttack, int evasionAttack) {
        this.name = name;
        this.health = health;
        this.health_Max = health_Max;
        this.power = power;
        this.defence = defence;
        this.accuracy = accuracy;
        this.chanceCriticalAttack = chanceCriticalAttack;
        this.evasionAttack = evasionAttack;
    }
}
