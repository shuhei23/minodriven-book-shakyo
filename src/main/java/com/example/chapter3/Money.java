package com.example.chapter3;

import java.util.Currency;

public class Money {
    final int amount;
    final Currency currency;

    Money(int amount, Currency currency) {
        if (amount < 0) {
            throw new IllegalArgumentException("金額には0以上を指定してください。");
        }
        if (currency == null) {
            throw new IllegalArgumentException("通貨単位を指定してください。");
        }

        this.amount = amount;
        this.currency = currency;
    }

    void add(int other) {
        amount += other;
    }
}
