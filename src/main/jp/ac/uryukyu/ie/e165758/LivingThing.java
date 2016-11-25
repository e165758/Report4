package jp.ac.uryukyu.ie.e165758;

public class LivingThing {
    //フィールド変数
    String name;
    int hitPoint;
    int attack;
    boolean dead;
    //コンストラクタ
    public LivingThing(String name, int maximumHP, int attack) {
        this.name = name;
        this.hitPoint = maximumHP;
        this.attack = attack;
        this.dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }
    //メソッド
    public boolean isDead() {
        return this.dead;
    }
    public String getName() {
        return this.name;
    }
    public void attack(LivingThing enemy) {
        if (isDead() != true) {  // HP <= 0 の場合は攻撃しない。
            int damage = (int) (Math.random() * this.attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, enemy.getName(), damage);
            enemy.wounded(damage);
        }
    }
    public void wounded(int damage) {
        this.hitPoint -= damage;
        if (this.hitPoint <= 0) {
            this.dead = true;
            System.out.printf("%sは倒れた。\n", getName());
        }
    }
}

