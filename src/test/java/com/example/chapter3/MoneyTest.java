package com.example.chapter3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Currency;
import java.util.Locale;

import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    void 負の値で初期した場合に例外を投げる() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> new Money(-100, Currency.getInstance(Locale.JAPAN)));
        assertEquals("金額には0以上を指定してください。", e.getMessage());
    }

    @Test
    void 通貨単位をnullで初期した場合に例外を投げる() {
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,
                () -> new Money(10, null));
        assertEquals("通貨単位を指定してください。", e.getMessage());
    }
}
