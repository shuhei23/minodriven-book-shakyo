package com.example.chapter2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class HitPointTest {


    @Test
    void MAXより大きいHPで初期化した場合に例外を投げる() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new HitPoint(1000));
        assertEquals("999以下を指定してください" , e.getMessage());
    }

    @Test
    void MINより小さいHPで初期化した場合に例外を投げる() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class, () -> new HitPoint(-1));
        assertEquals("0以上を指定してください" , e.getMessage());
    }

    @Test
    void HPが100の場合に20のダメージを受けるとHPは80になる() {
        HitPoint hp = new HitPoint(100);
        HitPoint hp80 = new HitPoint(80);
        assertEquals(hp80.value, hp.damage(20).value);
    }

    @Test
    void HPが100の場合に120のダメージを受けるとHPは0になる() {
        HitPoint hp = new HitPoint(100);
        HitPoint hpMIN = new HitPoint(0);
        assertEquals(hpMIN.value, hp.damage(120).value);
    }

    @Test
    void HPが100の場合に20回復するとHPは120になる() {
        HitPoint hp = new HitPoint(100);
        HitPoint hp120 = new HitPoint(120);
        assertEquals(hp120.value, hp.recover(20).value);
    }

    @Test
    void HPが100の場合に900回復するとHPは999になる() {
        HitPoint hp = new HitPoint(100);
        HitPoint hpMAX = new HitPoint(999);
        assertEquals(hpMAX.value, hp.recover(900).value);
    }
}
