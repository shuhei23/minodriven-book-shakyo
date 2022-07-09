package com.example.chapter2;

public class HitPoint {
    private static final int MIN = 0;
    private static final int MAX = 999;
    final int value;

    HitPoint(final int value) {
        if (value < MIN)
            throw new IllegalArgumentException(MIN + "以上を指定してください");
        if (value > MAX)
            throw new IllegalArgumentException(MAX + "以下を指定してください");
        this.value = value;
    }

    // ダメージを受ける
    HitPoint damage(final int damageAmount) {
        final int damaged = value - damageAmount;
        final int corrected = damaged < MIN ? MIN : damaged;
        return new HitPoint(corrected);
    }

    // 回復する
    HitPoint recover(final int recoverAmount) {
        final int recovered = value + recoverAmount;
        final int corrected = MAX < recovered ? MAX : recovered;
        return new HitPoint(corrected);
    }
}
