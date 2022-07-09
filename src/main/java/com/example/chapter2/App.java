package com.example.chapter2;

public class App 
{
    public static void main( String[] args )
    {
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

    public static int func(int p1, int p2, int d1, int d2){
        int d = 0;
        d = p1 + p2;
        d = d -((d1 + d2) / 2);
        if(d < 0) {
            d = 0;
        }
        return d;
    }
}
