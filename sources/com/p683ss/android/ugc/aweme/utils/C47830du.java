package com.p683ss.android.ugc.aweme.utils;

import com.C2240a;
import com.taobao.android.dexposed.ClassUtils;
import java.util.Arrays;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.utils.du */
public final class C47830du {

    /* renamed from: a */
    public static final C47830du f120388a = new C47830du();

    private C47830du() {
    }

    /* renamed from: a */
    public static String m103470a(long j) {
        String a = C2240a.m6772a("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(((float) j) / 1048576.0f)}, 1));
        C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
        if (!C52830p.m112413c(a, "0", false, 2, null)) {
            return a;
        }
        CharSequence charSequence = a;
        if (!C52830p.m112456b(charSequence, (CharSequence) ClassUtils.PACKAGE_SEPARATOR, false, 2, (Object) null)) {
            return a;
        }
        int a2 = C52830p.m112419a(charSequence, ClassUtils.PACKAGE_SEPARATOR, 0, false, 6, (Object) null);
        if (a != null) {
            String substring = a.substring(0, a2);
            C52711k.m112236a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }
        throw new C52857u("null cannot be cast to non-null type java.lang.String");
    }
}
