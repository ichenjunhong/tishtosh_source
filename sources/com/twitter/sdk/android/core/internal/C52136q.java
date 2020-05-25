package com.twitter.sdk.android.core.internal;

/* renamed from: com.twitter.sdk.android.core.internal.q */
public final class C52136q {

    /* renamed from: a */
    public final String f129776a;

    public C52136q() {
        this("https://api.twitter.com");
    }

    private C52136q(String str) {
        this.f129776a = str;
    }

    /* renamed from: a */
    public static String m111511a(String str) {
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt > 31 && charAt < 127) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }
}
