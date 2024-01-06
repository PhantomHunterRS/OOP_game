import Entity.Hero;
import Entity.Rogue;
import Entity.Wizard;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Wizard("Alexey",150,15,20,75,150,50);
        System.out.println(hero.toString());
        Hero hero1 = new Rogue("Phantom",300,120,300,70,130,100);
        System.out.println(hero1.toString());

        hero.attack(hero1);
        System.out.println(hero1.toString());
        hero.attack(hero1);
        System.out.println(hero1.toString());
        hero.attack(hero1);
        System.out.println(hero1.toString());
        // (Wizard)hero.
    }
}
