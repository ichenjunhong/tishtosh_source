package okio;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: okio.-DeprecatedUtf8 reason: invalid class name */
public final class DeprecatedUtf8 {
    public static final DeprecatedUtf8 INSTANCE = new DeprecatedUtf8();

    private DeprecatedUtf8() {
    }

    public final long size(String str) {
        C52711k.m112240b(str, "string");
        return Utf8.size$default(str, 0, 0, 3, null);
    }

    public final long size(String str, int i, int i2) {
        C52711k.m112240b(str, "string");
        return Utf8.size(str, i, i2);
    }
}
