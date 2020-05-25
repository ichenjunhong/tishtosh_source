package com.p683ss.android.ugc.aweme.utils;

import com.C2240a;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.utils.fv */
public final class C47902fv {
    /* renamed from: a */
    public static String m103621a(int i) {
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i5 == 0) {
            return C2240a.m6773a(Locale.CHINA, "%02d:%02d", new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)});
        }
        return C2240a.m6773a(Locale.CHINA, "%02d:%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)});
    }
}
