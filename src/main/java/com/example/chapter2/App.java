package com.example.chapter2;

public class App {
    public static void main(String[] args) {
        int playerAtk = 50;
        int weaponAtk = 20;
        int villainDef = 60;
        int armorDef = 30;

        System.out.println(String.format("プレイヤー本体の攻撃力: %d", playerAtk));
        System.out.println(String.format("プレイヤーの武器の攻撃力: %d", weaponAtk));
        System.out.println(String.format("敵本体の防御力: %d", villainDef));
        System.out.println(String.format("敵の防具の防御力: %d", armorDef));

        int damage = func(playerAtk, weaponAtk, villainDef, armorDef);

        System.out.println(String.format("ダメージは%dです", damage));
    }

    public static int func(int playerArmPower, int playerWeaponPower, int enemyBodyDefence, int enemyArmorDefence) {
        int damageAmount = 0;
        damageAmount = playerArmPower + playerWeaponPower; // プレイヤーの攻撃力の総量
        damageAmount = damageAmount - ((enemyBodyDefence + enemyArmorDefence) / 2); // 敵の防御力の総量
        if (damageAmount < 0) {
            damageAmount = 0;
        }
        return damageAmount;
    }
}
