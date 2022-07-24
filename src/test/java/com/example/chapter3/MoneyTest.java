package com.example.chapter3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
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

    int originalPrice = 100;
    int additionalServiceFee = 20;
    boolean specialServiceAdded = true;
    boolean seasonOffApplied = true;

    private int seasonPrice() {
        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH) + 1;
        return month * 10;
    }

    @Test
    void インスタンス変数をどんどん上書きしている() {

        Money money = new Money(0, Currency.getInstance(Locale.JAPAN));
        money.amount = originalPrice;
        // 中略
        if (specialServiceAdded) {
            money.add(additionalServiceFee);
            // 中略
            if (seasonOffApplied) {
                money.amount = seasonPrice();
            }
        }

        System.out.println(String.format("料金は%d円です。",money.amount));
    }

}
