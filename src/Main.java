import Abstracts.Hero;
import Entity.Peasant;
import Entity.Rogue;
import Entity.Sniper;
import Entity.Wizard;

public class Main {
    public static void main(String[] args) {
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
        System.out.println(((Sniper)hero5).getNumberOfArrows());
        ((Peasant)hero4).replenishTheShells(hero5);
        System.out.println(((Sniper)hero5).getNumberOfArrows());
    }
}
