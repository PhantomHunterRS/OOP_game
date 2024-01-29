import Abstracts.Hero;
import Abstracts.Vector2;
import Entity.Peasant;
import Entity.Rogue;
import Entity.Sniper;
import Entity.Wizard;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Hero> holyTeam = new ArrayList<>();
        List<Hero> darkTeam = new ArrayList<>();

        List<Hero> heroes = new ArrayList<>();
        Hero hero1 = new Wizard("Alexey",150,15,20,75,150,50);
        System.out.println(hero1.toString());
        Hero hero2 = new Rogue("Phantom",300,120,300,70,130,100);
        System.out.println(hero2.toString());
        Hero hero3 = new Rogue("PhantomХ",250,160,310,80,150,90);
        System.out.println(hero3.toString());
        Hero hero4 = new Peasant("Warehouse",100);
        System.out.println(hero4.toString());
        Hero hero5 = new Sniper("Hunter",100,150,70,50,300,150);
        System.out.println(hero5.toString());
        System.out.println(((Sniper)hero5).getNumberOfCrossBowArrows());
        ((Peasant)hero4).replenishTheShells(hero5);
        System.out.println(((Sniper)hero5).getNumberOfCrossBowArrows());


        heroes.add(hero1);
        heroes.add(hero2);
        heroes.add(hero3);
        heroes.add(hero4);
        heroes.add(hero5);
        // получаем героя-врага самого ближнего
        Hero heroS = ((Sniper) hero5).searchForTheNearestEnemy(heroes);
        System.out.println(hero5.getPosition().getPosX() + " " + hero5.getPosition().getPosY());
        System.out.println(hero5.getPosition().distance(heroS.getPosition()));
        System.out.println(heroS.getPosition().getPosX() + " "+ heroS.getPosition().getPosY());
    }
}
