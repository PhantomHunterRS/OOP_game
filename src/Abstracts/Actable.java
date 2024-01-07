package Abstracts;

import Abstracts.Hero;

public interface Actable {
    public void attack(Hero hero);
    public void protect(Hero hero);
    public boolean die(int health);
}
