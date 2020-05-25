package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.aw */
public final class C35210aw {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static int m79596b(String str, int i, int i2) {
        C52711k.m112240b(str, "$this$lengthWithEmoji");
        return str.codePointCount(i, i2);
    }

    /* renamed from: a */
    public static final String m79595a(String str, int i, int i2) {
        C52711k.m112240b(str, "$this$substringWithEmoji");
        try {
            String substring = str.substring(str.offsetByCodePoints(0, i), str.offsetByCodePoints(0, i2));
            C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        } catch (Exception unused) {
            return str;
        }
    }
}
