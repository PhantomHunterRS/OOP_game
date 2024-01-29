package Abstracts;

import Entity.Rogue;

import java.util.List;

/**
Описание героя и его основных характиристик
 */
public abstract class Hero{
    private static boolean toggleSwitch = true;
    private static int good = 0;
    private static int evil = 0;

    String name;
    private String team;
    private int health, health_Max;
    private int power;
    private int defence;
    private int accuracy;
    private int chanceCriticalAttack;
    private int evasionAttack;
    private int experience;
    protected int initiative;
    private Vector2  position;
    public void attack(Hero hero) {
        if (hero.die(hero.getHealth())){
            System.out.println("He's already dead.");
        }
        else {
            int healthX = hero.getHealth();
            hero.setHealth((getPower() > hero.getDefence()) ? hero.getHealth() - (this.getPower() + this.getAccuracy() + this.getChanceCriticalAttack()) : (hero.getHealth() + hero.getDefence() - (this.getPower() + this.getAccuracy() + this.getChanceCriticalAttack() )));
            setExperience((healthX - hero.getHealth())/10);
        }
        System.out.println(hero.die(hero.getHealth())?"dead":"");
    }
    public void protect(Hero hero) {
        hero.setDefence(hero.getDefence() + this.getPower() / 2);
    }
    public boolean die(int health) {
            return (health <=0 )?true:false;
    }
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
        this.position = determiningThePosition(this.team);
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
    public void setExperience(int gainedExperience) {
        this.experience = this.experience+gainedExperience;
    }
    protected String changeTeam(){
        if (toggleSwitch){
            toggleSwitch = false;
            return "GOOD";
        }else {
            toggleSwitch = true;
        return "EVIL";}
    }

    public int getInitiative() {
        return initiative;
    }

    public String getTeam() {
        return team;
    }

    public Vector2 getPosition() {
        return position;
    }
    private Vector2 determiningThePosition(String team){
        if (team.equals("GOOD")){
            return new Vector2(0,good++);
        }else {
            return new Vector2(9,evil++);
        }
    }
}
