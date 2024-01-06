package Entity;
/**
Описание героя и его основных характиристик
 */
public abstract class Hero implements Actable{
    String name;
    private String team;
    private int health, health_Max;
    private int power;
    private int defence;
    private int accuracy;
    private int chanceCriticalAttack;
    private int evasionAttack;
    private int experience;
    private static boolean toggleSwitch = true;
    @Override
    public String toString(){
        return String.format(this.getClass().getSimpleName() + " " + name);
    }
    public Hero(String name, int health_Max, int power, int defence, int accuracy, int chanceCriticalAttack, int evasionAttack) {
        this.team = changeTeam();
        this.experience = 0;
        this.name = name;
        this.health_Max = health_Max;
        this.health = health_Max;
        this.power = power;
        this.defence = defence;
        this.accuracy = accuracy;
        this.chanceCriticalAttack = chanceCriticalAttack;
        this.evasionAttack = evasionAttack;
    }
    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
    public int getHealth_Max() {
        return health_Max;
    }
    public int getPower() {
        return power;
    }
    public int getDefence() {
        return defence;
    }
    public int getAccuracy() {
        return accuracy;
    }
    public int getChanceCriticalAttack() {
        return chanceCriticalAttack;
    }
    public int getEvasionAttack() {
        return evasionAttack;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setDefence(int defence) {
        this.defence = defence;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    protected String changeTeam(){
        return (toggleSwitch)?"GOOD":"EVIL";
    }
}
