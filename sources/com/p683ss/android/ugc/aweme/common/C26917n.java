package com.p683ss.android.ugc.aweme.common;

import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.common.n */
public final class C26917n implements InputFilter {
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        boolean z;
        C52711k.m112240b(charSequence, "source");
        String obj = charSequence.toString();
        if (obj != null) {
            if (TextUtils.isEmpty(C52830p.m112447b(obj).toString())) {
                if (charSequence.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && i3 == 0) {
                    return "";
                }
            }
            return null;
        }
        throw new C52857u("null cannot be cast to non-null type kotlin.CharSequence");
    }
}
