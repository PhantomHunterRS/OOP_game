package Abstracts;

import Entity.Rogue;

import java.util.List;

public interface Move {
    default void step(Hero hero, Hero enemy, List<Hero> allies) {
        if (((hero.getPosition().getPosX() == enemy.getPosition().getPosX()) &&
                (hero.getPosition().getPosY() + 1 == enemy.getPosition().getPosY() || hero.getPosition().getPosY() - 1 == enemy.getPosition().getPosY())) ||
                ((hero.getPosition().getPosY()) == enemy.getPosition().getPosY() &&
                        ((hero.getPosition().getPosX() + 1 == enemy.getPosition().getPosX()) || (hero.getPosition().getPosX() - 1 == enemy.getPosition().getPosX())))) {
            hero.attack(enemy);
        } else {
            //new position move
            int newPosX = hero.getPosition().getPosX() + ((enemy.getPosition().getPosX() - hero.getPosition().getPosX()) / (Math.abs((enemy.getPosition().getPosX() - hero.getPosition().getPosX()))));
            int newPosY = hero.getPosition().getPosY() + ((enemy.getPosition().getPosY() - hero.getPosition().getPosY()) / (Math.abs((enemy.getPosition().getPosY() - hero.getPosition().getPosY()))));

            if ((enemy.getPosition().getPosX() - hero.getPosition().getPosX()) > (enemy.getPosition().getPosY() - hero.getPosition().getPosY())) {
                if (cageIsOccupied(new Vector2(newPosX, hero.getPosition().getPosY()), allies)) {
                    hero.getPosition().setPosY(newPosY);
                } else {
                    hero.getPosition().setPosX(newPosX);
                }
            } else {
                if (cageIsOccupied(new Vector2(hero.getPosition().getPosX(), newPosY), allies)) {
                    hero.getPosition().setPosX(newPosX);
                } else {
                    hero.getPosition().setPosY(newPosY);
                }
            }
        }
    }
    default boolean cageIsOccupied(Vector2 vector, List<Hero> allies) {
        boolean occupied = false;
        for (Hero hero : allies) {
            if (vector.equals(hero.getPosition())) {
                occupied = true;
            }
        }
        return occupied;
    }
}
