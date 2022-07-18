package com.example.chapter3;

import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    void 不正値で初期化する() {
        Money money = new Money(-100, null);
    }
}
