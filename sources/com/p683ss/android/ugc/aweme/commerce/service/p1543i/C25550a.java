package com.p683ss.android.ugc.aweme.commerce.service.p1543i;

import com.C2240a;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.i.a */
public final class C25550a {
    /* renamed from: a */
    public static String m62084a(int i) {
        if (i % 100 == 0) {
            return String.valueOf(i / 100);
        }
        if (i % 10 == 0) {
            return C2240a.m6773a(Locale.getDefault(), "%.1f", new Object[]{Float.valueOf(((float) i) / 100.0f)});
        }
        return C2240a.m6773a(Locale.getDefault(), "%.2f", new Object[]{Float.valueOf(((float) i) / 100.0f)});
    }
}
