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
        int totalPlayerAttackPower = sumUpPlayerAttackPower(playerArmPower, playerWeaponPower);
        int totalEnemyDefence = sumUpEnemyDefence(enemyBodyDefence, enemyArmorDefence);
        int damageAmount = estimateDamage(totalPlayerAttackPower, totalEnemyDefence);
        return damageAmount;
    }

    // プレイヤーの攻撃力を合算する
    private static int sumUpPlayerAttackPower(int playerArmPower, int playerWeaponPower) {
        return playerArmPower + playerWeaponPower;
    }

    // 敵の防御力を合算する
    private static int sumUpEnemyDefence(int enemyBodyDefence, int enemyArmorDefence) {
        return enemyBodyDefence + enemyArmorDefence;
    }

    // ダメージ量を評価する
    private static int estimateDamage(int totalPlayerAttackPower, int totalEnemyDefence) {
        int damageAmount = totalPlayerAttackPower - (totalEnemyDefence / 2);
        if (damageAmount < 0) {
            return 0;
        }
        return damageAmount;
    }

}
