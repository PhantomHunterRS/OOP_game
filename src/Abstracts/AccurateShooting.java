package Abstracts;

import java.util.List;

public interface AccurateShooting {
    public void sniperShoot(Hero hero);
    public Hero searchForTheNearestEnemy(List<Hero> heroes);
}
