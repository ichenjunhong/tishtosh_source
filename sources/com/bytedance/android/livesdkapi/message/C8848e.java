package com.bytedance.android.livesdkapi.message;

/* renamed from: com.bytedance.android.livesdkapi.message.e */
public enum C8848e {
    UNKNOWN(0, ""),
    STRING(1, "string"),
    USER(11, "user"),
    GIFT(12, "gift"),
    HEART(13, "heart"),
    PATTERN_REF(14, "pref");
    

    /* renamed from: a */
    private int f24146a;

    /* renamed from: b */
    private String f24147b;

    public final int getPieceType() {
        return this.f24146a;
    }

    public final String getTag() {
        return this.f24147b;
    }

    private C8848e(int i, String str) {
        this.f24146a = i;
        this.f24147b = str;
    }
}
