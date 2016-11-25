package jp.ac.uryukyu.ie.e165758;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by e165758 on 2016/11/25.
 */
public class EnemyTest {
    @Test
    public void attack() throws Exception {
        int heroHP = 10;
        Hero hero = new Hero("テスト勇者", heroHP, 5);
        Enemy enemy = new Enemy("テストスライム", 3, 3);
        for (int i = 0; i < 3; i++) {
            enemy.attack(hero);
        }
        assertEquals(heroHP, hero.hitPoint);
    }
}